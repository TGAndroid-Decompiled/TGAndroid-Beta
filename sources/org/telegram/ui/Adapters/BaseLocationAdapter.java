package org.telegram.ui.Adapters;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;

public abstract class BaseLocationAdapter extends AdapterWithDiffUtils {
    public final boolean biz;
    private int currentRequestNum;
    private BaseLocationAdapterDelegate delegate;
    private long dialogId;
    private String lastFoundQuery;
    private Location lastSearchLocation;
    private String lastSearchQuery;
    protected boolean searchInProgress;
    private Runnable searchRunnable;
    protected boolean searching;
    protected boolean searchingLocations;
    private boolean searchingUser;
    public final boolean stories;
    protected boolean searched = false;
    protected ArrayList locations = new ArrayList();
    protected ArrayList places = new ArrayList();
    private int currentAccount = UserConfig.selectedAccount;

    public interface BaseLocationAdapterDelegate {
        void didLoadSearchResult(ArrayList arrayList);
    }

    public BaseLocationAdapter(boolean z, boolean z2) {
        this.stories = z;
        this.biz = z2;
    }

    public void destroy() {
        if (this.currentRequestNum != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentRequestNum, true);
            this.currentRequestNum = 0;
        }
    }

    public void setDelegate(long j, BaseLocationAdapterDelegate baseLocationAdapterDelegate) {
        this.dialogId = j;
        this.delegate = baseLocationAdapterDelegate;
    }

    public void searchDelayed(final String str, final Location location) {
        if (str == null || str.length() == 0) {
            this.places.clear();
            this.locations.clear();
            this.searchInProgress = false;
            update(true);
            return;
        }
        if (this.searchRunnable != null) {
            Utilities.searchQueue.cancelRunnable(this.searchRunnable);
            this.searchRunnable = null;
        }
        this.searchInProgress = true;
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchDelayed$1(str, location);
            }
        };
        this.searchRunnable = runnable;
        dispatchQueue.postRunnable(runnable, 400L);
    }

    public void lambda$searchDelayed$1(final String str, final Location location) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchDelayed$0(str, location);
            }
        });
    }

    public void lambda$searchDelayed$0(String str, Location location) {
        this.searchRunnable = null;
        this.lastSearchLocation = null;
        searchPlacesWithQuery(str, location, true);
    }

    private void searchBotUser() {
        String str;
        if (this.searchingUser) {
            return;
        }
        this.searchingUser = true;
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        if (this.stories) {
            str = MessagesController.getInstance(this.currentAccount).storyVenueSearchBot;
        } else {
            str = MessagesController.getInstance(this.currentAccount).venueSearchBot;
        }
        tL_contacts_resolveUsername.username = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$searchBotUser$3(tLObject, tL_error);
            }
        });
    }

    public void lambda$searchBotUser$3(final TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$searchBotUser$2(tLObject);
                }
            });
        }
    }

    public void lambda$searchBotUser$2(TLObject tLObject) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        Location location = this.lastSearchLocation;
        this.lastSearchLocation = null;
        searchPlacesWithQuery(this.lastSearchQuery, location, false);
    }

    public boolean isSearching() {
        return this.searchInProgress;
    }

    public String getLastSearchString() {
        return this.lastFoundQuery;
    }

    public void searchPlacesWithQuery(String str, Location location, boolean z) {
        searchPlacesWithQuery(str, location, z, false);
    }

    public void searchPlacesWithQuery(final String str, final Location location, boolean z, boolean z2) {
        String str2;
        final Locale locale;
        if (location != null || this.stories) {
            Location location2 = this.lastSearchLocation;
            if (location2 == null || location == null || location.distanceTo(location2) >= 200.0f) {
                Locale locale2 = null;
                this.lastSearchLocation = location == null ? null : new Location(location);
                this.lastSearchQuery = str;
                if (this.searching) {
                    this.searching = false;
                    if (this.currentRequestNum != 0) {
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentRequestNum, true);
                        this.currentRequestNum = 0;
                    }
                }
                getItemCount();
                this.searching = true;
                this.searched = true;
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                if (this.stories) {
                    str2 = MessagesController.getInstance(this.currentAccount).storyVenueSearchBot;
                } else {
                    str2 = MessagesController.getInstance(this.currentAccount).venueSearchBot;
                }
                TLObject userOrChat = messagesController.getUserOrChat(str2);
                if (!(userOrChat instanceof TLRPC.User)) {
                    if (z) {
                        searchBotUser();
                        return;
                    }
                    return;
                }
                TLRPC.User user = (TLRPC.User) userOrChat;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.query = str == null ? "" : str;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
                tL_messages_getInlineBotResults.offset = "";
                if (location != null) {
                    TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                    tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                    tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(location.getLatitude());
                    tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(location.getLongitude());
                    tL_messages_getInlineBotResults.flags |= 1;
                }
                if (DialogObject.isEncryptedDialog(this.dialogId)) {
                    tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                }
                if (!TextUtils.isEmpty(str) && (this.stories || this.biz)) {
                    this.searchingLocations = true;
                    final Locale currentLocale = LocaleController.getInstance().getCurrentLocale();
                    if (!this.stories) {
                        locale = locale2;
                    } else if (currentLocale.getLanguage().contains("en")) {
                        locale = currentLocale;
                    } else {
                        locale2 = Locale.US;
                        locale = locale2;
                    }
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$searchPlacesWithQuery$5(currentLocale, str, locale, location, str);
                        }
                    });
                } else {
                    this.searchingLocations = false;
                }
                if (location == null) {
                    return;
                }
                this.currentRequestNum = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$searchPlacesWithQuery$7(str, tLObject, tL_error);
                    }
                });
                update(true);
            }
        }
    }

    public void lambda$searchPlacesWithQuery$5(Locale locale, String str, Locale locale2, final Location location, final String str2) {
        List<Address> list;
        List<Address> list2;
        HashSet hashSet;
        int i;
        HashSet hashSet2;
        HashSet hashSet3;
        boolean z;
        boolean z2;
        String countryName;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        String string;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        String subAdminArea;
        String adminArea;
        boolean z3;
        String str3;
        String locality;
        int i2;
        String[] strArr;
        StringBuilder sb;
        String addressLine;
        String[] strArrSplit;
        int length;
        String str4;
        int i3;
        String str5;
        BaseLocationAdapter baseLocationAdapter = this;
        final ArrayList arrayList = new ArrayList();
        try {
            int i4 = baseLocationAdapter.biz ? 10 : 5;
            List<Address> fromLocationName = baseLocationAdapter.stories ? new Geocoder(ApplicationLoader.applicationContext, locale2).getFromLocationName(str, 5) : null;
            HashSet hashSet4 = new HashSet();
            HashSet hashSet5 = new HashSet();
            int i5 = 0;
            for (List<Address> fromLocationName2 = new Geocoder(ApplicationLoader.applicationContext, locale).getFromLocationName(str, 5); i5 < fromLocationName2.size(); fromLocationName2 = list2) {
                Address address = fromLocationName2.get(i5);
                Address address2 = (fromLocationName == null || i5 >= fromLocationName.size()) ? null : fromLocationName.get(i5);
                if (address.hasLatitude() && address.hasLongitude()) {
                    double latitude = address.getLatitude();
                    double longitude = address.getLongitude();
                    StringBuilder sb2 = new StringBuilder();
                    list = fromLocationName;
                    StringBuilder sb3 = new StringBuilder();
                    list2 = fromLocationName2;
                    StringBuilder sb4 = new StringBuilder();
                    String locality2 = address.getLocality();
                    if (TextUtils.isEmpty(locality2)) {
                        locality2 = address.getAdminArea();
                    }
                    String str6 = locality2;
                    if (address2 != null && TextUtils.isEmpty(address2.getLocality())) {
                        address2.getAdminArea();
                    }
                    i = i5;
                    String thoroughfare = address.getThoroughfare();
                    HashSet hashSet6 = hashSet4;
                    if (TextUtils.isEmpty(thoroughfare)) {
                        hashSet3 = hashSet5;
                    } else {
                        hashSet3 = hashSet5;
                        if (!TextUtils.equals(thoroughfare, address.getAdminArea())) {
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(thoroughfare);
                        }
                        z = false;
                        if (TextUtils.isEmpty(str6)) {
                            z2 = true;
                        } else {
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(str6);
                            if (sb4 != null) {
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(str6);
                            }
                            z2 = false;
                        }
                        countryName = address.getCountryName();
                        if (TextUtils.isEmpty(countryName)) {
                            z = z;
                            address2 = address2;
                        } else {
                            if (!"US".equals(address.getCountryCode()) || "AE".equals(address.getCountryCode()) || ("GB".equals(address.getCountryCode()) && "en".equals(locale.getLanguage()))) {
                                strArrSplit = countryName.split(" ");
                                length = strArrSplit.length;
                                str4 = "";
                                i3 = 0;
                                while (i3 < length) {
                                    int i6 = length;
                                    str5 = strArrSplit[i3];
                                    if (str5.length() > 0) {
                                        str4 = str4 + str5.charAt(0);
                                    }
                                    i3++;
                                    length = i6;
                                    strArrSplit = strArrSplit;
                                }
                            } else {
                                str4 = countryName;
                            }
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(str4);
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(countryName);
                        }
                        if (baseLocationAdapter.biz) {
                            sb = new StringBuilder();
                            try {
                                addressLine = address.getAddressLine(0);
                                if (!TextUtils.isEmpty(addressLine)) {
                                    sb.append(addressLine);
                                }
                            } catch (Exception unused) {
                            }
                            if (sb.length() > 0) {
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue3.geo = tL_geoPoint;
                                tL_geoPoint.lat = latitude;
                                tL_geoPoint._long = longitude;
                                tL_messageMediaVenue3.query_id = -1L;
                                tL_messageMediaVenue3.title = sb.toString();
                                tL_messageMediaVenue3.icon = "pin";
                                tL_messageMediaVenue3.address = LocaleController.getString(R.string.PassportAddress);
                                arrayList.add(tL_messageMediaVenue3);
                            }
                            hashSet = hashSet3;
                            hashSet2 = hashSet6;
                            i4 = i4;
                        } else if (sb4 == null && sb4.length() > 0) {
                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                            TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                            tL_messageMediaVenue4.geo = tL_geoPoint2;
                            tL_geoPoint2.lat = latitude;
                            tL_geoPoint2._long = longitude;
                            tL_messageMediaVenue4.query_id = -1L;
                            tL_messageMediaVenue4.title = sb4.toString();
                            tL_messageMediaVenue4.icon = "pin";
                            tL_messageMediaVenue4.address = LocaleController.getString(z ? R.string.PassportCity : R.string.PassportStreet1);
                            if (address2 != null) {
                                TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                                tL_messageMediaVenue4.geoAddress = tL_geoPointAddress;
                                tL_geoPointAddress.country_iso2 = address2.getCountryCode();
                                String locality3 = TextUtils.isEmpty(null) ? address2.getLocality() : null;
                                if (TextUtils.isEmpty(locality3)) {
                                    locality3 = address2.getAdminArea();
                                }
                                if (TextUtils.isEmpty(locality3)) {
                                    locality3 = address2.getSubAdminArea();
                                }
                                String adminArea2 = address2.getAdminArea();
                                StringBuilder sb5 = new StringBuilder();
                                if (!TextUtils.isEmpty(adminArea2)) {
                                    TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue4.geoAddress;
                                    tL_geoPointAddress2.state = adminArea2;
                                    tL_geoPointAddress2.flags |= 1;
                                }
                                if (!TextUtils.isEmpty(locality3)) {
                                    TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue4.geoAddress;
                                    tL_geoPointAddress3.city = locality3;
                                    tL_geoPointAddress3.flags |= 2;
                                }
                                if (z) {
                                    z3 = false;
                                } else {
                                    if (TextUtils.isEmpty(null)) {
                                        str3 = str6;
                                        if (!TextUtils.equals(address2.getThoroughfare(), str3) && !TextUtils.equals(address2.getThoroughfare(), address2.getCountryName())) {
                                            locality = address2.getThoroughfare();
                                        }
                                        if (TextUtils.isEmpty(locality) && !TextUtils.equals(address2.getSubLocality(), str3) && !TextUtils.equals(address2.getSubLocality(), address2.getCountryName())) {
                                            locality = address2.getSubLocality();
                                        }
                                        if (TextUtils.isEmpty(locality) && !TextUtils.equals(address2.getLocality(), str3) && !TextUtils.equals(address2.getLocality(), address2.getCountryName())) {
                                            locality = address2.getLocality();
                                        }
                                        if (!TextUtils.isEmpty(locality) || TextUtils.equals(locality, adminArea2) || TextUtils.equals(locality, address2.getCountryName())) {
                                            sb5 = null;
                                        } else {
                                            if (sb5.length() > 0) {
                                                sb5.append(", ");
                                            }
                                            sb5.append(locality);
                                        }
                                        if (!TextUtils.isEmpty(sb5)) {
                                            z3 = false;
                                            break;
                                        }
                                        i2 = 0;
                                        while (true) {
                                            strArr = LocationController.unnamedRoads;
                                            if (i2 < strArr.length) {
                                                z3 = false;
                                                break;
                                            } else {
                                                if (strArr[i2].equalsIgnoreCase(sb5.toString())) {
                                                    z3 = true;
                                                    break;
                                                }
                                                i2++;
                                            }
                                        }
                                        if (!TextUtils.isEmpty(sb5)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue4.geoAddress;
                                            tL_geoPointAddress4.flags |= 4;
                                            tL_geoPointAddress4.street = sb5.toString();
                                        }
                                    } else {
                                        str3 = str6;
                                    }
                                    locality = null;
                                    if (TextUtils.isEmpty(locality)) {
                                        locality = address2.getSubLocality();
                                    }
                                    if (TextUtils.isEmpty(locality)) {
                                        locality = address2.getLocality();
                                    }
                                    if (TextUtils.isEmpty(locality)) {
                                        sb5 = null;
                                    } else {
                                        sb5 = null;
                                    }
                                    if (!TextUtils.isEmpty(sb5)) {
                                        z3 = false;
                                        break;
                                    }
                                    i2 = 0;
                                    while (true) {
                                        strArr = LocationController.unnamedRoads;
                                        if (i2 < strArr.length) {
                                            z3 = false;
                                            break;
                                        } else {
                                            if (strArr[i2].equalsIgnoreCase(sb5.toString())) {
                                                z3 = true;
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                    if (!TextUtils.isEmpty(sb5)) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress5 = tL_messageMediaVenue4.geoAddress;
                                        tL_geoPointAddress5.flags |= 4;
                                        tL_geoPointAddress5.street = sb5.toString();
                                    }
                                }
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                arrayList.add(tL_messageMediaVenue4);
                                if (arrayList.size() >= i4) {
                                    i4 = i4;
                                    break;
                                }
                            } else {
                                i4 = i4;
                            }
                            if (z2) {
                                hashSet = hashSet3;
                            } else {
                                string = sb3.toString();
                                hashSet = hashSet3;
                                if (!hashSet.contains(string)) {
                                    tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue2.geo = tL_geoPoint3;
                                    tL_geoPoint3.lat = latitude;
                                    tL_geoPoint3._long = longitude;
                                    tL_messageMediaVenue2.query_id = -1L;
                                    tL_messageMediaVenue2.title = sb3.toString();
                                    tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                    tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet.add(tL_messageMediaVenue2.title);
                                    tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                    if (address2 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress6 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue2.geoAddress = tL_geoPointAddress6;
                                        tL_geoPointAddress6.country_iso2 = address2.getCountryCode();
                                        if (TextUtils.isEmpty(null)) {
                                            subAdminArea = address2.getLocality();
                                        } else {
                                            subAdminArea = null;
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address2.getAdminArea();
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address2.getSubAdminArea();
                                        }
                                        adminArea = address2.getAdminArea();
                                        if (!TextUtils.isEmpty(adminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress7 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress7.state = adminArea;
                                            tL_geoPointAddress7.flags |= 1;
                                        }
                                        if (!TextUtils.isEmpty(subAdminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress8 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress8.city = subAdminArea;
                                            tL_geoPointAddress8.flags |= 2;
                                        }
                                    }
                                    arrayList.add(tL_messageMediaVenue2);
                                    if (arrayList.size() < i4) {
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                if (sb2.length() > 0) {
                                    hashSet2 = hashSet6;
                                    if (!hashSet2.contains(sb2.toString())) {
                                        tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                        TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue.geo = tL_geoPoint4;
                                        tL_geoPoint4.lat = latitude;
                                        tL_geoPoint4._long = longitude;
                                        tL_messageMediaVenue.query_id = -1L;
                                        tL_messageMediaVenue.title = sb2.toString();
                                        tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                        tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                        hashSet2.add(tL_messageMediaVenue.title);
                                        tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                        if (address2 != null) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress9 = new TL_stories.TL_geoPointAddress();
                                            tL_messageMediaVenue.geoAddress = tL_geoPointAddress9;
                                            tL_geoPointAddress9.country_iso2 = address2.getCountryCode();
                                        }
                                        arrayList.add(tL_messageMediaVenue);
                                        if (arrayList.size() >= i4) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    hashSet2 = hashSet6;
                                }
                            }
                            if (sb2.length() > 0) {
                                hashSet2 = hashSet6;
                                if (!hashSet2.contains(sb2.toString())) {
                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint5 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint5;
                                    tL_geoPoint5.lat = latitude;
                                    tL_geoPoint5._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb2.toString();
                                    tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                    tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet2.add(tL_messageMediaVenue.title);
                                    tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                    if (address2 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress10 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress10;
                                        tL_geoPointAddress10.country_iso2 = address2.getCountryCode();
                                    }
                                    arrayList.add(tL_messageMediaVenue);
                                    if (arrayList.size() >= i4) {
                                        break;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                hashSet2 = hashSet6;
                            }
                        } else {
                            i4 = i4;
                            if (z2) {
                                string = sb3.toString();
                                hashSet = hashSet3;
                                if (!hashSet.contains(string)) {
                                    tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint6 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue2.geo = tL_geoPoint6;
                                    tL_geoPoint6.lat = latitude;
                                    tL_geoPoint6._long = longitude;
                                    tL_messageMediaVenue2.query_id = -1L;
                                    tL_messageMediaVenue2.title = sb3.toString();
                                    tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                    tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet.add(tL_messageMediaVenue2.title);
                                    tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                    if (address2 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress11 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue2.geoAddress = tL_geoPointAddress11;
                                        tL_geoPointAddress11.country_iso2 = address2.getCountryCode();
                                        if (TextUtils.isEmpty(null)) {
                                            subAdminArea = address2.getLocality();
                                        } else {
                                            subAdminArea = null;
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address2.getAdminArea();
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address2.getSubAdminArea();
                                        }
                                        adminArea = address2.getAdminArea();
                                        if (!TextUtils.isEmpty(adminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress12 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress12.state = adminArea;
                                            tL_geoPointAddress12.flags |= 1;
                                        }
                                        if (!TextUtils.isEmpty(subAdminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress13 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress13.city = subAdminArea;
                                            tL_geoPointAddress13.flags |= 2;
                                        }
                                    }
                                    arrayList.add(tL_messageMediaVenue2);
                                    if (arrayList.size() < i4) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                if (sb2.length() > 0) {
                                    hashSet2 = hashSet6;
                                    if (!hashSet2.contains(sb2.toString())) {
                                        tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                        TLRPC.TL_geoPoint tL_geoPoint7 = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue.geo = tL_geoPoint7;
                                        tL_geoPoint7.lat = latitude;
                                        tL_geoPoint7._long = longitude;
                                        tL_messageMediaVenue.query_id = -1L;
                                        tL_messageMediaVenue.title = sb2.toString();
                                        tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                        tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                        hashSet2.add(tL_messageMediaVenue.title);
                                        tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                        if (address2 != null) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress14 = new TL_stories.TL_geoPointAddress();
                                            tL_messageMediaVenue.geoAddress = tL_geoPointAddress14;
                                            tL_geoPointAddress14.country_iso2 = address2.getCountryCode();
                                        }
                                        arrayList.add(tL_messageMediaVenue);
                                        if (arrayList.size() >= i4) {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    hashSet2 = hashSet6;
                                }
                            } else {
                                hashSet = hashSet3;
                            }
                            if (sb2.length() > 0) {
                                hashSet2 = hashSet6;
                                if (!hashSet2.contains(sb2.toString())) {
                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint8 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint8;
                                    tL_geoPoint8.lat = latitude;
                                    tL_geoPoint8._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb2.toString();
                                    tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                    tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet2.add(tL_messageMediaVenue.title);
                                    tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                    if (address2 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress15 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress15;
                                        tL_geoPointAddress15.country_iso2 = address2.getCountryCode();
                                    }
                                    arrayList.add(tL_messageMediaVenue);
                                    if (arrayList.size() >= i4) {
                                        break;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                hashSet2 = hashSet6;
                            }
                        }
                        i5 = i + 1;
                        baseLocationAdapter = this;
                        hashSet5 = hashSet;
                        hashSet4 = hashSet2;
                        fromLocationName = list;
                    }
                    String subLocality = address.getSubLocality();
                    if (!TextUtils.isEmpty(subLocality)) {
                        if (sb4.length() > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(subLocality);
                    } else {
                        String locality4 = address.getLocality();
                        if (TextUtils.isEmpty(locality4) || TextUtils.equals(locality4, str6)) {
                            sb4 = null;
                            z = true;
                        } else {
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(locality4);
                        }
                        if (TextUtils.isEmpty(str6)) {
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(str6);
                            if (sb4 != null) {
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(str6);
                            }
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        countryName = address.getCountryName();
                        if (TextUtils.isEmpty(countryName)) {
                            if ("US".equals(address.getCountryCode())) {
                                strArrSplit = countryName.split(" ");
                                length = strArrSplit.length;
                                str4 = "";
                                i3 = 0;
                                while (i3 < length) {
                                    int i7 = length;
                                    str5 = strArrSplit[i3];
                                    if (str5.length() > 0) {
                                        str4 = str4 + str5.charAt(0);
                                    }
                                    i3++;
                                    length = i7;
                                    strArrSplit = strArrSplit;
                                }
                            } else {
                                strArrSplit = countryName.split(" ");
                                length = strArrSplit.length;
                                str4 = "";
                                i3 = 0;
                                while (i3 < length) {
                                    int i8 = length;
                                    str5 = strArrSplit[i3];
                                    if (str5.length() > 0) {
                                        str4 = str4 + str5.charAt(0);
                                    }
                                    i3++;
                                    length = i8;
                                    strArrSplit = strArrSplit;
                                }
                            }
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(str4);
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(countryName);
                        } else {
                            z = z;
                            address2 = address2;
                        }
                        if (baseLocationAdapter.biz) {
                            sb = new StringBuilder();
                            addressLine = address.getAddressLine(0);
                            if (!TextUtils.isEmpty(addressLine)) {
                                sb.append(addressLine);
                            }
                            if (sb.length() > 0) {
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue5 = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint9 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue5.geo = tL_geoPoint9;
                                tL_geoPoint9.lat = latitude;
                                tL_geoPoint9._long = longitude;
                                tL_messageMediaVenue5.query_id = -1L;
                                tL_messageMediaVenue5.title = sb.toString();
                                tL_messageMediaVenue5.icon = "pin";
                                tL_messageMediaVenue5.address = LocaleController.getString(R.string.PassportAddress);
                                arrayList.add(tL_messageMediaVenue5);
                            }
                            hashSet = hashSet3;
                            hashSet2 = hashSet6;
                            i4 = i4;
                        } else if (sb4 == null) {
                            i4 = i4;
                            if (z2) {
                                string = sb3.toString();
                                hashSet = hashSet3;
                                if (!hashSet.contains(string)) {
                                    tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint10 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue2.geo = tL_geoPoint10;
                                    tL_geoPoint10.lat = latitude;
                                    tL_geoPoint10._long = longitude;
                                    tL_messageMediaVenue2.query_id = -1L;
                                    tL_messageMediaVenue2.title = sb3.toString();
                                    tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                    tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet.add(tL_messageMediaVenue2.title);
                                    tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                    if (address2 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress16 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue2.geoAddress = tL_geoPointAddress16;
                                        tL_geoPointAddress16.country_iso2 = address2.getCountryCode();
                                        if (TextUtils.isEmpty(null)) {
                                            subAdminArea = address2.getLocality();
                                        } else {
                                            subAdminArea = null;
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address2.getAdminArea();
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address2.getSubAdminArea();
                                        }
                                        adminArea = address2.getAdminArea();
                                        if (!TextUtils.isEmpty(adminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress17 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress17.state = adminArea;
                                            tL_geoPointAddress17.flags |= 1;
                                        }
                                        if (!TextUtils.isEmpty(subAdminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress18 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress18.city = subAdminArea;
                                            tL_geoPointAddress18.flags |= 2;
                                        }
                                    }
                                    arrayList.add(tL_messageMediaVenue2);
                                    if (arrayList.size() < i4) {
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                if (sb2.length() > 0) {
                                    hashSet2 = hashSet6;
                                    if (!hashSet2.contains(sb2.toString())) {
                                        tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                        TLRPC.TL_geoPoint tL_geoPoint11 = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue.geo = tL_geoPoint11;
                                        tL_geoPoint11.lat = latitude;
                                        tL_geoPoint11._long = longitude;
                                        tL_messageMediaVenue.query_id = -1L;
                                        tL_messageMediaVenue.title = sb2.toString();
                                        tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                        tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                        hashSet2.add(tL_messageMediaVenue.title);
                                        tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                        if (address2 != null) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress19 = new TL_stories.TL_geoPointAddress();
                                            tL_messageMediaVenue.geoAddress = tL_geoPointAddress19;
                                            tL_geoPointAddress19.country_iso2 = address2.getCountryCode();
                                        }
                                        arrayList.add(tL_messageMediaVenue);
                                        if (arrayList.size() >= i4) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    hashSet2 = hashSet6;
                                }
                            } else {
                                hashSet = hashSet3;
                            }
                            if (sb2.length() > 0) {
                                hashSet2 = hashSet6;
                                if (!hashSet2.contains(sb2.toString())) {
                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint12 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint12;
                                    tL_geoPoint12.lat = latitude;
                                    tL_geoPoint12._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb2.toString();
                                    tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                    tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet2.add(tL_messageMediaVenue.title);
                                    tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                    if (address2 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress110 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress110;
                                        tL_geoPointAddress110.country_iso2 = address2.getCountryCode();
                                    }
                                    arrayList.add(tL_messageMediaVenue);
                                    if (arrayList.size() >= i4) {
                                        break;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                hashSet2 = hashSet6;
                            }
                        } else {
                            i4 = i4;
                            if (z2) {
                                string = sb3.toString();
                                hashSet = hashSet3;
                                if (!hashSet.contains(string)) {
                                    tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint13 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue2.geo = tL_geoPoint13;
                                    tL_geoPoint13.lat = latitude;
                                    tL_geoPoint13._long = longitude;
                                    tL_messageMediaVenue2.query_id = -1L;
                                    tL_messageMediaVenue2.title = sb3.toString();
                                    tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                    tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet.add(tL_messageMediaVenue2.title);
                                    tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                    if (address2 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress111 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue2.geoAddress = tL_geoPointAddress111;
                                        tL_geoPointAddress111.country_iso2 = address2.getCountryCode();
                                        if (TextUtils.isEmpty(null)) {
                                            subAdminArea = address2.getLocality();
                                        } else {
                                            subAdminArea = null;
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address2.getAdminArea();
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address2.getSubAdminArea();
                                        }
                                        adminArea = address2.getAdminArea();
                                        if (!TextUtils.isEmpty(adminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress112 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress112.state = adminArea;
                                            tL_geoPointAddress112.flags |= 1;
                                        }
                                        if (!TextUtils.isEmpty(subAdminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress113 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress113.city = subAdminArea;
                                            tL_geoPointAddress113.flags |= 2;
                                        }
                                    }
                                    arrayList.add(tL_messageMediaVenue2);
                                    if (arrayList.size() < i4) {
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                if (sb2.length() > 0) {
                                    hashSet2 = hashSet6;
                                    if (!hashSet2.contains(sb2.toString())) {
                                        tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                        TLRPC.TL_geoPoint tL_geoPoint14 = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue.geo = tL_geoPoint14;
                                        tL_geoPoint14.lat = latitude;
                                        tL_geoPoint14._long = longitude;
                                        tL_messageMediaVenue.query_id = -1L;
                                        tL_messageMediaVenue.title = sb2.toString();
                                        tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                        tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                        hashSet2.add(tL_messageMediaVenue.title);
                                        tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                        if (address2 != null) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress114 = new TL_stories.TL_geoPointAddress();
                                            tL_messageMediaVenue.geoAddress = tL_geoPointAddress114;
                                            tL_geoPointAddress114.country_iso2 = address2.getCountryCode();
                                        }
                                        arrayList.add(tL_messageMediaVenue);
                                        if (arrayList.size() >= i4) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    hashSet2 = hashSet6;
                                }
                            } else {
                                hashSet = hashSet3;
                            }
                            if (sb2.length() > 0) {
                                hashSet2 = hashSet6;
                                if (!hashSet2.contains(sb2.toString())) {
                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint15 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint15;
                                    tL_geoPoint15.lat = latitude;
                                    tL_geoPoint15._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb2.toString();
                                    tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                    tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet2.add(tL_messageMediaVenue.title);
                                    tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                    if (address2 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress115 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress115;
                                        tL_geoPointAddress115.country_iso2 = address2.getCountryCode();
                                    }
                                    arrayList.add(tL_messageMediaVenue);
                                    if (arrayList.size() >= i4) {
                                        break;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                hashSet2 = hashSet6;
                            }
                        }
                        i5 = i + 1;
                        baseLocationAdapter = this;
                        hashSet5 = hashSet;
                        hashSet4 = hashSet2;
                        fromLocationName = list;
                    }
                    z = false;
                    if (TextUtils.isEmpty(str6)) {
                        if (sb3.length() > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(str6);
                        if (sb4 != null) {
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(str6);
                        }
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    countryName = address.getCountryName();
                    if (TextUtils.isEmpty(countryName)) {
                        if ("US".equals(address.getCountryCode())) {
                            strArrSplit = countryName.split(" ");
                            length = strArrSplit.length;
                            str4 = "";
                            i3 = 0;
                            while (i3 < length) {
                                int i9 = length;
                                str5 = strArrSplit[i3];
                                if (str5.length() > 0) {
                                    str4 = str4 + str5.charAt(0);
                                }
                                i3++;
                                length = i9;
                                strArrSplit = strArrSplit;
                            }
                        } else {
                            strArrSplit = countryName.split(" ");
                            length = strArrSplit.length;
                            str4 = "";
                            i3 = 0;
                            while (i3 < length) {
                                int i10 = length;
                                str5 = strArrSplit[i3];
                                if (str5.length() > 0) {
                                    str4 = str4 + str5.charAt(0);
                                }
                                i3++;
                                length = i10;
                                strArrSplit = strArrSplit;
                            }
                        }
                        if (sb3.length() > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(str4);
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(countryName);
                    } else {
                        z = z;
                        address2 = address2;
                    }
                    if (baseLocationAdapter.biz) {
                        sb = new StringBuilder();
                        addressLine = address.getAddressLine(0);
                        if (!TextUtils.isEmpty(addressLine)) {
                            sb.append(addressLine);
                        }
                        if (sb.length() > 0) {
                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue6 = new TLRPC.TL_messageMediaVenue();
                            TLRPC.TL_geoPoint tL_geoPoint16 = new TLRPC.TL_geoPoint();
                            tL_messageMediaVenue6.geo = tL_geoPoint16;
                            tL_geoPoint16.lat = latitude;
                            tL_geoPoint16._long = longitude;
                            tL_messageMediaVenue6.query_id = -1L;
                            tL_messageMediaVenue6.title = sb.toString();
                            tL_messageMediaVenue6.icon = "pin";
                            tL_messageMediaVenue6.address = LocaleController.getString(R.string.PassportAddress);
                            arrayList.add(tL_messageMediaVenue6);
                        }
                        hashSet = hashSet3;
                        hashSet2 = hashSet6;
                        i4 = i4;
                    } else if (sb4 == null) {
                        i4 = i4;
                        if (z2) {
                            string = sb3.toString();
                            hashSet = hashSet3;
                            if (!hashSet.contains(string)) {
                                tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint17 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue2.geo = tL_geoPoint17;
                                tL_geoPoint17.lat = latitude;
                                tL_geoPoint17._long = longitude;
                                tL_messageMediaVenue2.query_id = -1L;
                                tL_messageMediaVenue2.title = sb3.toString();
                                tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                hashSet.add(tL_messageMediaVenue2.title);
                                tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                if (address2 != null) {
                                    TL_stories.TL_geoPointAddress tL_geoPointAddress116 = new TL_stories.TL_geoPointAddress();
                                    tL_messageMediaVenue2.geoAddress = tL_geoPointAddress116;
                                    tL_geoPointAddress116.country_iso2 = address2.getCountryCode();
                                    if (TextUtils.isEmpty(null)) {
                                        subAdminArea = address2.getLocality();
                                    } else {
                                        subAdminArea = null;
                                    }
                                    if (TextUtils.isEmpty(subAdminArea)) {
                                        subAdminArea = address2.getAdminArea();
                                    }
                                    if (TextUtils.isEmpty(subAdminArea)) {
                                        subAdminArea = address2.getSubAdminArea();
                                    }
                                    adminArea = address2.getAdminArea();
                                    if (!TextUtils.isEmpty(adminArea)) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress117 = tL_messageMediaVenue2.geoAddress;
                                        tL_geoPointAddress117.state = adminArea;
                                        tL_geoPointAddress117.flags |= 1;
                                    }
                                    if (!TextUtils.isEmpty(subAdminArea)) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress118 = tL_messageMediaVenue2.geoAddress;
                                        tL_geoPointAddress118.city = subAdminArea;
                                        tL_geoPointAddress118.flags |= 2;
                                    }
                                }
                                arrayList.add(tL_messageMediaVenue2);
                                if (arrayList.size() < i4) {
                                    break;
                                }
                                break;
                                break;
                            }
                            if (sb2.length() > 0) {
                                hashSet2 = hashSet6;
                                if (!hashSet2.contains(sb2.toString())) {
                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint18 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint18;
                                    tL_geoPoint18.lat = latitude;
                                    tL_geoPoint18._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb2.toString();
                                    tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                    tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet2.add(tL_messageMediaVenue.title);
                                    tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                    if (address2 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress119 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress119;
                                        tL_geoPointAddress119.country_iso2 = address2.getCountryCode();
                                    }
                                    arrayList.add(tL_messageMediaVenue);
                                    if (arrayList.size() >= i4) {
                                        break;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                hashSet2 = hashSet6;
                            }
                        } else {
                            hashSet = hashSet3;
                        }
                        if (sb2.length() > 0) {
                            hashSet2 = hashSet6;
                            if (!hashSet2.contains(sb2.toString())) {
                                tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint19 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue.geo = tL_geoPoint19;
                                tL_geoPoint19.lat = latitude;
                                tL_geoPoint19._long = longitude;
                                tL_messageMediaVenue.query_id = -1L;
                                tL_messageMediaVenue.title = sb2.toString();
                                tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                hashSet2.add(tL_messageMediaVenue.title);
                                tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                if (address2 != null) {
                                    TL_stories.TL_geoPointAddress tL_geoPointAddress1110 = new TL_stories.TL_geoPointAddress();
                                    tL_messageMediaVenue.geoAddress = tL_geoPointAddress1110;
                                    tL_geoPointAddress1110.country_iso2 = address2.getCountryCode();
                                }
                                arrayList.add(tL_messageMediaVenue);
                                if (arrayList.size() >= i4) {
                                    break;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            hashSet2 = hashSet6;
                        }
                    } else {
                        i4 = i4;
                        if (z2) {
                            string = sb3.toString();
                            hashSet = hashSet3;
                            if (!hashSet.contains(string)) {
                                tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint110 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue2.geo = tL_geoPoint110;
                                tL_geoPoint110.lat = latitude;
                                tL_geoPoint110._long = longitude;
                                tL_messageMediaVenue2.query_id = -1L;
                                tL_messageMediaVenue2.title = sb3.toString();
                                tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                hashSet.add(tL_messageMediaVenue2.title);
                                tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                if (address2 != null) {
                                    TL_stories.TL_geoPointAddress tL_geoPointAddress1111 = new TL_stories.TL_geoPointAddress();
                                    tL_messageMediaVenue2.geoAddress = tL_geoPointAddress1111;
                                    tL_geoPointAddress1111.country_iso2 = address2.getCountryCode();
                                    if (TextUtils.isEmpty(null)) {
                                        subAdminArea = address2.getLocality();
                                    } else {
                                        subAdminArea = null;
                                    }
                                    if (TextUtils.isEmpty(subAdminArea)) {
                                        subAdminArea = address2.getAdminArea();
                                    }
                                    if (TextUtils.isEmpty(subAdminArea)) {
                                        subAdminArea = address2.getSubAdminArea();
                                    }
                                    adminArea = address2.getAdminArea();
                                    if (!TextUtils.isEmpty(adminArea)) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress1112 = tL_messageMediaVenue2.geoAddress;
                                        tL_geoPointAddress1112.state = adminArea;
                                        tL_geoPointAddress1112.flags |= 1;
                                    }
                                    if (!TextUtils.isEmpty(subAdminArea)) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress1113 = tL_messageMediaVenue2.geoAddress;
                                        tL_geoPointAddress1113.city = subAdminArea;
                                        tL_geoPointAddress1113.flags |= 2;
                                    }
                                }
                                arrayList.add(tL_messageMediaVenue2);
                                if (arrayList.size() < i4) {
                                    break;
                                }
                                break;
                                break;
                            }
                            if (sb2.length() > 0) {
                                hashSet2 = hashSet6;
                                if (!hashSet2.contains(sb2.toString())) {
                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint111 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint111;
                                    tL_geoPoint111.lat = latitude;
                                    tL_geoPoint111._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb2.toString();
                                    tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                    tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet2.add(tL_messageMediaVenue.title);
                                    tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                    if (address2 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress1114 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress1114;
                                        tL_geoPointAddress1114.country_iso2 = address2.getCountryCode();
                                    }
                                    arrayList.add(tL_messageMediaVenue);
                                    if (arrayList.size() >= i4) {
                                        break;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                hashSet2 = hashSet6;
                            }
                        } else {
                            hashSet = hashSet3;
                        }
                        if (sb2.length() > 0) {
                            hashSet2 = hashSet6;
                            if (!hashSet2.contains(sb2.toString())) {
                                tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint112 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue.geo = tL_geoPoint112;
                                tL_geoPoint112.lat = latitude;
                                tL_geoPoint112._long = longitude;
                                tL_messageMediaVenue.query_id = -1L;
                                tL_messageMediaVenue.title = sb2.toString();
                                tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                hashSet2.add(tL_messageMediaVenue.title);
                                tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                if (address2 != null) {
                                    TL_stories.TL_geoPointAddress tL_geoPointAddress1115 = new TL_stories.TL_geoPointAddress();
                                    tL_messageMediaVenue.geoAddress = tL_geoPointAddress1115;
                                    tL_geoPointAddress1115.country_iso2 = address2.getCountryCode();
                                }
                                arrayList.add(tL_messageMediaVenue);
                                if (arrayList.size() >= i4) {
                                    break;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            hashSet2 = hashSet6;
                        }
                    }
                    i5 = i + 1;
                    baseLocationAdapter = this;
                    hashSet5 = hashSet;
                    hashSet4 = hashSet2;
                    fromLocationName = list;
                } else {
                    list = fromLocationName;
                    list2 = fromLocationName2;
                    hashSet = hashSet5;
                    i = i5;
                    hashSet2 = hashSet4;
                }
                i5 = i + 1;
                baseLocationAdapter = this;
                hashSet5 = hashSet;
                hashSet4 = hashSet2;
                fromLocationName = list;
            }
        } catch (Exception unused2) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchPlacesWithQuery$4(location, str2, arrayList);
            }
        });
    }

    public void lambda$searchPlacesWithQuery$4(Location location, String str, ArrayList arrayList) {
        this.searchingLocations = false;
        if (location == null) {
            this.currentRequestNum = 0;
            this.searching = false;
            this.places.clear();
            this.searchInProgress = false;
            this.lastFoundQuery = str;
        }
        this.locations.clear();
        this.locations.addAll(arrayList);
        update(true);
    }

    public void lambda$searchPlacesWithQuery$7(final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchPlacesWithQuery$6(tL_error, str, tLObject);
            }
        });
    }

    public void lambda$searchPlacesWithQuery$6(TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        if (tL_error == null) {
            this.currentRequestNum = 0;
            this.searching = false;
            this.places.clear();
            this.searchInProgress = false;
            this.lastFoundQuery = str;
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            int size = messages_botresults.results.size();
            for (int i = 0; i < size; i++) {
                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i);
                if ("venue".equals(botInlineResult.type)) {
                    TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                    if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                        TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                        tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                        tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                        tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                        tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/" + tL_botInlineMessageMediaVenue.venue_type + "_64.png";
                        tL_messageMediaVenue.venue_type = tL_botInlineMessageMediaVenue.venue_type;
                        tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                        tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.provider;
                        tL_messageMediaVenue.query_id = messages_botresults.query_id;
                        tL_messageMediaVenue.result_id = botInlineResult.id;
                        this.places.add(tL_messageMediaVenue);
                    }
                }
            }
        }
        BaseLocationAdapterDelegate baseLocationAdapterDelegate = this.delegate;
        if (baseLocationAdapterDelegate != null) {
            baseLocationAdapterDelegate.didLoadSearchResult(this.places);
        }
        update(true);
    }

    protected void update(boolean z) {
        notifyDataSetChanged();
    }
}
