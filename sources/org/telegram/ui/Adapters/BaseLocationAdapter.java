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
                BaseLocationAdapter.m1278$r8$lambda$UzOocwjEU5x3EeNBE12gwvGt9I(this.f$0, str, location);
            }
        };
        this.searchRunnable = runnable;
        dispatchQueue.postRunnable(runnable, 400L);
    }

    public static void m1278$r8$lambda$UzOocwjEU5x3EeNBE12gwvGt9I(final BaseLocationAdapter baseLocationAdapter, final String str, final Location location) {
        baseLocationAdapter.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BaseLocationAdapter.m1282$r8$lambda$y90nmaRInFalsuFNKur0trYb3U(this.f$0, str, location);
            }
        });
    }

    public static void m1282$r8$lambda$y90nmaRInFalsuFNKur0trYb3U(BaseLocationAdapter baseLocationAdapter, String str, Location location) {
        baseLocationAdapter.searchRunnable = null;
        baseLocationAdapter.lastSearchLocation = null;
        baseLocationAdapter.searchPlacesWithQuery(str, location, true);
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
                BaseLocationAdapter.$r8$lambda$4Nt7Zy6Elg7WbJ6IxBLzGtKqjZs(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$4Nt7Zy6Elg7WbJ6IxBLzGtKqjZs(final BaseLocationAdapter baseLocationAdapter, final TLObject tLObject, TLRPC.TL_error tL_error) {
        baseLocationAdapter.getClass();
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BaseLocationAdapter.$r8$lambda$A9lpV6QD6dmFP1uGkItVajDxhWE(this.f$0, tLObject);
                }
            });
        }
    }

    public static void $r8$lambda$A9lpV6QD6dmFP1uGkItVajDxhWE(BaseLocationAdapter baseLocationAdapter, TLObject tLObject) {
        baseLocationAdapter.getClass();
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(baseLocationAdapter.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(baseLocationAdapter.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(baseLocationAdapter.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        Location location = baseLocationAdapter.lastSearchLocation;
        baseLocationAdapter.lastSearchLocation = null;
        baseLocationAdapter.searchPlacesWithQuery(baseLocationAdapter.lastSearchQuery, location, false);
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

    public void searchPlacesWithQuery(final String str, Location location, boolean z, boolean z2) {
        Location location2;
        String str2;
        final BaseLocationAdapter baseLocationAdapter;
        final String str3;
        final Location location3;
        final Locale locale;
        if ((location != null || this.stories) && ((location2 = this.lastSearchLocation) == null || location == null || location.distanceTo(location2) >= 200.0f)) {
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
            if (userOrChat instanceof TLRPC.User) {
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
                    baseLocationAdapter = this;
                    str3 = str;
                    location3 = location;
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            BaseLocationAdapter.m1279$r8$lambda$X38L9THsqmGcopAtll3U7NJl_0(this.f$0, currentLocale, str3, locale, location3, str);
                        }
                    });
                } else {
                    baseLocationAdapter = this;
                    str3 = str;
                    location3 = location;
                    baseLocationAdapter.searchingLocations = false;
                }
                if (location3 == null) {
                    return;
                }
                baseLocationAdapter.currentRequestNum = ConnectionsManager.getInstance(baseLocationAdapter.currentAccount).sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        BaseLocationAdapter.m1280$r8$lambda$ZC2XbztLqEWm164HtZHxnTSS8(this.f$0, str3, tLObject, tL_error);
                    }
                });
                update(true);
                return;
            }
            if (z) {
                searchBotUser();
            }
        }
    }

    public static void m1279$r8$lambda$X38L9THsqmGcopAtll3U7NJl_0(final BaseLocationAdapter baseLocationAdapter, Locale locale, String str, Locale locale2, final Location location, final String str2) {
        List<Address> list;
        List<Address> list2;
        HashSet hashSet;
        int i;
        HashSet hashSet2;
        boolean z;
        boolean z2;
        String countryName;
        StringBuilder sb;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        String subAdminArea;
        String adminArea;
        boolean z3;
        StringBuilder sb2;
        String addressLine;
        String[] strArrSplit;
        int length;
        String str3;
        int i2;
        String str4;
        BaseLocationAdapter baseLocationAdapter2 = baseLocationAdapter;
        baseLocationAdapter2.getClass();
        final ArrayList arrayList = new ArrayList();
        try {
            int i3 = baseLocationAdapter2.biz ? 10 : 5;
            List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, locale).getFromLocationName(str, 5);
            List<Address> fromLocationName2 = baseLocationAdapter2.stories ? new Geocoder(ApplicationLoader.applicationContext, locale2).getFromLocationName(str, 5) : null;
            HashSet hashSet3 = new HashSet();
            HashSet hashSet4 = new HashSet();
            int i4 = 0;
            while (i4 < fromLocationName.size()) {
                Address address = fromLocationName.get(i4);
                Address address2 = (fromLocationName2 == null || i4 >= fromLocationName2.size()) ? null : fromLocationName2.get(i4);
                if (address.hasLatitude() && address.hasLongitude()) {
                    double latitude = address.getLatitude();
                    double longitude = address.getLongitude();
                    StringBuilder sb3 = new StringBuilder();
                    list = fromLocationName2;
                    StringBuilder sb4 = new StringBuilder();
                    list2 = fromLocationName;
                    StringBuilder sb5 = new StringBuilder();
                    String locality = address.getLocality();
                    if (TextUtils.isEmpty(locality)) {
                        locality = address.getAdminArea();
                    }
                    String str5 = locality;
                    if (address2 != null && TextUtils.isEmpty(address2.getLocality())) {
                        address2.getAdminArea();
                    }
                    i = i4;
                    String thoroughfare = address.getThoroughfare();
                    Address address3 = address2;
                    if (TextUtils.isEmpty(thoroughfare)) {
                        hashSet2 = hashSet3;
                    } else {
                        hashSet2 = hashSet3;
                        if (!TextUtils.equals(thoroughfare, address.getAdminArea())) {
                            if (sb5.length() > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(thoroughfare);
                        }
                        z = false;
                        if (TextUtils.isEmpty(str5)) {
                            z2 = true;
                        } else {
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(str5);
                            if (sb5 != null) {
                                if (sb5.length() > 0) {
                                    sb5.append(", ");
                                }
                                sb5.append(str5);
                            }
                            z2 = false;
                        }
                        boolean z4 = z;
                        countryName = address.getCountryName();
                        if (TextUtils.isEmpty(countryName)) {
                            hashSet4 = hashSet4;
                        } else {
                            if (!"US".equals(address.getCountryCode()) || "AE".equals(address.getCountryCode()) || ("GB".equals(address.getCountryCode()) && "en".equals(locale.getLanguage()))) {
                                strArrSplit = countryName.split(" ");
                                length = strArrSplit.length;
                                str3 = "";
                                i2 = 0;
                                while (i2 < length) {
                                    int i5 = length;
                                    str4 = strArrSplit[i2];
                                    if (str4.length() > 0) {
                                        str3 = str3 + str4.charAt(0);
                                    }
                                    i2++;
                                    length = i5;
                                }
                            } else {
                                str3 = countryName;
                            }
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(str3);
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(countryName);
                        }
                        sb = sb4;
                        if (baseLocationAdapter2.biz) {
                            sb2 = new StringBuilder();
                            try {
                                addressLine = address.getAddressLine(0);
                                if (!TextUtils.isEmpty(addressLine)) {
                                    sb2.append(addressLine);
                                }
                            } catch (Exception unused) {
                            }
                            if (sb2.length() > 0) {
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue3.geo = tL_geoPoint;
                                tL_geoPoint.lat = latitude;
                                tL_geoPoint._long = longitude;
                                tL_messageMediaVenue3.query_id = -1L;
                                tL_messageMediaVenue3.title = sb2.toString();
                                tL_messageMediaVenue3.icon = "pin";
                                tL_messageMediaVenue3.address = LocaleController.getString(R.string.PassportAddress);
                                arrayList.add(tL_messageMediaVenue3);
                            }
                            hashSet3 = hashSet2;
                            hashSet = hashSet4;
                        } else {
                            if (sb5 == 0 && sb5.length() > 0) {
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue4.geo = tL_geoPoint2;
                                tL_geoPoint2.lat = latitude;
                                tL_geoPoint2._long = longitude;
                                tL_messageMediaVenue4.query_id = -1L;
                                tL_messageMediaVenue4.title = sb5.toString();
                                tL_messageMediaVenue4.icon = "pin";
                                tL_messageMediaVenue4.address = LocaleController.getString(z4 ? R.string.PassportCity : R.string.PassportStreet1);
                                if (address3 != null) {
                                    TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                                    tL_messageMediaVenue4.geoAddress = tL_geoPointAddress;
                                    tL_geoPointAddress.country_iso2 = address3.getCountryCode();
                                    String locality2 = TextUtils.isEmpty(null) ? address3.getLocality() : null;
                                    if (TextUtils.isEmpty(locality2)) {
                                        locality2 = address3.getAdminArea();
                                    }
                                    if (TextUtils.isEmpty(locality2)) {
                                        locality2 = address3.getSubAdminArea();
                                    }
                                    String adminArea2 = address3.getAdminArea();
                                    StringBuilder sb6 = new StringBuilder();
                                    if (!TextUtils.isEmpty(adminArea2)) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue4.geoAddress;
                                        tL_geoPointAddress2.state = adminArea2;
                                        tL_geoPointAddress2.flags |= 1;
                                    }
                                    if (!TextUtils.isEmpty(locality2)) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue4.geoAddress;
                                        tL_geoPointAddress3.city = locality2;
                                        tL_geoPointAddress3.flags |= 2;
                                    }
                                    if (!z4) {
                                        String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address3.getThoroughfare(), str5) || TextUtils.equals(address3.getThoroughfare(), address3.getCountryName())) ? null : address3.getThoroughfare();
                                        if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address3.getSubLocality(), str5) && !TextUtils.equals(address3.getSubLocality(), address3.getCountryName())) {
                                            thoroughfare2 = address3.getSubLocality();
                                        }
                                        if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address3.getLocality(), str5) && !TextUtils.equals(address3.getLocality(), address3.getCountryName())) {
                                            thoroughfare2 = address3.getLocality();
                                        }
                                        if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, adminArea2) || TextUtils.equals(thoroughfare2, address3.getCountryName())) {
                                            sb6 = null;
                                        } else {
                                            if (sb6.length() > 0) {
                                                sb6.append(", ");
                                            }
                                            sb6.append(thoroughfare2);
                                        }
                                        if (!TextUtils.isEmpty(sb6)) {
                                            int i6 = 0;
                                            while (true) {
                                                String[] strArr = LocationController.unnamedRoads;
                                                if (i6 >= strArr.length) {
                                                    z3 = false;
                                                    break;
                                                } else {
                                                    if (strArr[i6].equalsIgnoreCase(sb6.toString())) {
                                                        z3 = true;
                                                        break;
                                                    }
                                                    i6++;
                                                }
                                            }
                                        } else {
                                            z3 = false;
                                            break;
                                        }
                                        if (!TextUtils.isEmpty(sb6)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue4.geoAddress;
                                            tL_geoPointAddress4.flags |= 4;
                                            tL_geoPointAddress4.street = sb6.toString();
                                        }
                                    }
                                    if (!z3) {
                                        arrayList.add(tL_messageMediaVenue4);
                                        if (arrayList.size() >= i3) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    sb = sb;
                                }
                                z3 = false;
                                if (!z3) {
                                    arrayList.add(tL_messageMediaVenue4);
                                    if (arrayList.size() >= i3) {
                                        break;
                                    }
                                    break;
                                    break;
                                }
                            } else {
                                sb = sb;
                            }
                            if (!z2) {
                                hashSet = hashSet4;
                                if (!hashSet.contains(sb.toString())) {
                                    tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue2.geo = tL_geoPoint3;
                                    tL_geoPoint3.lat = latitude;
                                    tL_geoPoint3._long = longitude;
                                    tL_messageMediaVenue2.query_id = -1L;
                                    tL_messageMediaVenue2.title = sb.toString();
                                    tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                    tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet.add(tL_messageMediaVenue2.title);
                                    tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                    if (address3 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress5 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue2.geoAddress = tL_geoPointAddress5;
                                        tL_geoPointAddress5.country_iso2 = address3.getCountryCode();
                                        if (TextUtils.isEmpty(null)) {
                                            subAdminArea = address3.getLocality();
                                        } else {
                                            subAdminArea = null;
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address3.getAdminArea();
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address3.getSubAdminArea();
                                        }
                                        adminArea = address3.getAdminArea();
                                        if (!TextUtils.isEmpty(adminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress6 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress6.state = adminArea;
                                            tL_geoPointAddress6.flags |= 1;
                                        }
                                        if (!TextUtils.isEmpty(subAdminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress7 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress7.city = subAdminArea;
                                            tL_geoPointAddress7.flags |= 2;
                                        }
                                    }
                                    arrayList.add(tL_messageMediaVenue2);
                                    if (arrayList.size() < i3) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                hashSet = hashSet4;
                            }
                            if (sb3.length() > 0) {
                                hashSet3 = hashSet2;
                                if (hashSet3.contains(sb3.toString())) {
                                    continue;
                                } else {
                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint4;
                                    tL_geoPoint4.lat = latitude;
                                    tL_geoPoint4._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb3.toString();
                                    tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                    tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet3.add(tL_messageMediaVenue.title);
                                    tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                    if (address3 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress8;
                                        tL_geoPointAddress8.country_iso2 = address3.getCountryCode();
                                    }
                                    arrayList.add(tL_messageMediaVenue);
                                    if (arrayList.size() >= i3) {
                                        break;
                                    }
                                }
                            } else {
                                hashSet3 = hashSet2;
                            }
                        }
                    }
                    String subLocality = address.getSubLocality();
                    if (!TextUtils.isEmpty(subLocality)) {
                        if (sb5.length() > 0) {
                            sb5.append(", ");
                        }
                        sb5.append(subLocality);
                    } else {
                        String locality3 = address.getLocality();
                        if (TextUtils.isEmpty(locality3) || TextUtils.equals(locality3, str5)) {
                            sb5 = null;
                            z = true;
                        } else {
                            if (sb5.length() > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(locality3);
                        }
                        if (TextUtils.isEmpty(str5)) {
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(str5);
                            if (sb5 != null) {
                                if (sb5.length() > 0) {
                                    sb5.append(", ");
                                }
                                sb5.append(str5);
                            }
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        boolean z5 = z;
                        countryName = address.getCountryName();
                        if (TextUtils.isEmpty(countryName)) {
                            if ("US".equals(address.getCountryCode())) {
                                strArrSplit = countryName.split(" ");
                                length = strArrSplit.length;
                                str3 = "";
                                i2 = 0;
                                while (i2 < length) {
                                    int i7 = length;
                                    str4 = strArrSplit[i2];
                                    if (str4.length() > 0) {
                                        str3 = str3 + str4.charAt(0);
                                    }
                                    i2++;
                                    length = i7;
                                }
                            } else {
                                strArrSplit = countryName.split(" ");
                                length = strArrSplit.length;
                                str3 = "";
                                i2 = 0;
                                while (i2 < length) {
                                    int i8 = length;
                                    str4 = strArrSplit[i2];
                                    if (str4.length() > 0) {
                                        str3 = str3 + str4.charAt(0);
                                    }
                                    i2++;
                                    length = i8;
                                }
                            }
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(str3);
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(countryName);
                        } else {
                            hashSet4 = hashSet4;
                        }
                        sb = sb4;
                        if (baseLocationAdapter2.biz) {
                            sb2 = new StringBuilder();
                            addressLine = address.getAddressLine(0);
                            if (!TextUtils.isEmpty(addressLine)) {
                                sb2.append(addressLine);
                            }
                            if (sb2.length() > 0) {
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue5 = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint5 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue5.geo = tL_geoPoint5;
                                tL_geoPoint5.lat = latitude;
                                tL_geoPoint5._long = longitude;
                                tL_messageMediaVenue5.query_id = -1L;
                                tL_messageMediaVenue5.title = sb2.toString();
                                tL_messageMediaVenue5.icon = "pin";
                                tL_messageMediaVenue5.address = LocaleController.getString(R.string.PassportAddress);
                                arrayList.add(tL_messageMediaVenue5);
                            }
                            hashSet3 = hashSet2;
                            hashSet = hashSet4;
                        } else if (sb5 == 0) {
                            sb = sb;
                            if (!z2) {
                                hashSet = hashSet4;
                                if (!hashSet.contains(sb.toString())) {
                                    tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint6 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue2.geo = tL_geoPoint6;
                                    tL_geoPoint6.lat = latitude;
                                    tL_geoPoint6._long = longitude;
                                    tL_messageMediaVenue2.query_id = -1L;
                                    tL_messageMediaVenue2.title = sb.toString();
                                    tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                    tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet.add(tL_messageMediaVenue2.title);
                                    tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                    if (address3 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress9 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue2.geoAddress = tL_geoPointAddress9;
                                        tL_geoPointAddress9.country_iso2 = address3.getCountryCode();
                                        if (TextUtils.isEmpty(null)) {
                                            subAdminArea = address3.getLocality();
                                        } else {
                                            subAdminArea = null;
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address3.getAdminArea();
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address3.getSubAdminArea();
                                        }
                                        adminArea = address3.getAdminArea();
                                        if (!TextUtils.isEmpty(adminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress10 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress10.state = adminArea;
                                            tL_geoPointAddress10.flags |= 1;
                                        }
                                        if (!TextUtils.isEmpty(subAdminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress11 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress11.city = subAdminArea;
                                            tL_geoPointAddress11.flags |= 2;
                                        }
                                    }
                                    arrayList.add(tL_messageMediaVenue2);
                                    if (arrayList.size() < i3) {
                                        break;
                                    }
                                    break;
                                    break;
                                }
                            } else {
                                hashSet = hashSet4;
                            }
                            if (sb3.length() > 0) {
                                hashSet3 = hashSet2;
                                if (hashSet3.contains(sb3.toString())) {
                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint7 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint7;
                                    tL_geoPoint7.lat = latitude;
                                    tL_geoPoint7._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb3.toString();
                                    tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                    tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet3.add(tL_messageMediaVenue.title);
                                    tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                    if (address3 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress12 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress12;
                                        tL_geoPointAddress12.country_iso2 = address3.getCountryCode();
                                    }
                                    arrayList.add(tL_messageMediaVenue);
                                    if (arrayList.size() >= i3) {
                                        break;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                hashSet3 = hashSet2;
                            }
                        } else {
                            sb = sb;
                            if (!z2) {
                                hashSet = hashSet4;
                                if (!hashSet.contains(sb.toString())) {
                                    tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint8 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue2.geo = tL_geoPoint8;
                                    tL_geoPoint8.lat = latitude;
                                    tL_geoPoint8._long = longitude;
                                    tL_messageMediaVenue2.query_id = -1L;
                                    tL_messageMediaVenue2.title = sb.toString();
                                    tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                    tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet.add(tL_messageMediaVenue2.title);
                                    tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                    if (address3 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress13 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue2.geoAddress = tL_geoPointAddress13;
                                        tL_geoPointAddress13.country_iso2 = address3.getCountryCode();
                                        if (TextUtils.isEmpty(null)) {
                                            subAdminArea = address3.getLocality();
                                        } else {
                                            subAdminArea = null;
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address3.getAdminArea();
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address3.getSubAdminArea();
                                        }
                                        adminArea = address3.getAdminArea();
                                        if (!TextUtils.isEmpty(adminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress14 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress14.state = adminArea;
                                            tL_geoPointAddress14.flags |= 1;
                                        }
                                        if (!TextUtils.isEmpty(subAdminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress15 = tL_messageMediaVenue2.geoAddress;
                                            tL_geoPointAddress15.city = subAdminArea;
                                            tL_geoPointAddress15.flags |= 2;
                                        }
                                    }
                                    arrayList.add(tL_messageMediaVenue2);
                                    if (arrayList.size() < i3) {
                                        break;
                                    }
                                    break;
                                    break;
                                }
                            } else {
                                hashSet = hashSet4;
                            }
                            if (sb3.length() > 0) {
                                hashSet3 = hashSet2;
                                if (hashSet3.contains(sb3.toString())) {
                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint9 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint9;
                                    tL_geoPoint9.lat = latitude;
                                    tL_geoPoint9._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb3.toString();
                                    tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                    tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet3.add(tL_messageMediaVenue.title);
                                    tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                    if (address3 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress16 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress16;
                                        tL_geoPointAddress16.country_iso2 = address3.getCountryCode();
                                    }
                                    arrayList.add(tL_messageMediaVenue);
                                    if (arrayList.size() >= i3) {
                                        break;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                hashSet3 = hashSet2;
                            }
                        }
                    }
                    z = false;
                    if (TextUtils.isEmpty(str5)) {
                        if (sb4.length() > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(str5);
                        if (sb5 != null) {
                            if (sb5.length() > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(str5);
                        }
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    boolean z6 = z;
                    countryName = address.getCountryName();
                    if (TextUtils.isEmpty(countryName)) {
                        if ("US".equals(address.getCountryCode())) {
                            strArrSplit = countryName.split(" ");
                            length = strArrSplit.length;
                            str3 = "";
                            i2 = 0;
                            while (i2 < length) {
                                int i9 = length;
                                str4 = strArrSplit[i2];
                                if (str4.length() > 0) {
                                    str3 = str3 + str4.charAt(0);
                                }
                                i2++;
                                length = i9;
                            }
                        } else {
                            strArrSplit = countryName.split(" ");
                            length = strArrSplit.length;
                            str3 = "";
                            i2 = 0;
                            while (i2 < length) {
                                int i10 = length;
                                str4 = strArrSplit[i2];
                                if (str4.length() > 0) {
                                    str3 = str3 + str4.charAt(0);
                                }
                                i2++;
                                length = i10;
                            }
                        }
                        if (sb4.length() > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(str3);
                        if (sb3.length() > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(countryName);
                    } else {
                        hashSet4 = hashSet4;
                    }
                    sb = sb4;
                    if (baseLocationAdapter2.biz) {
                        sb2 = new StringBuilder();
                        addressLine = address.getAddressLine(0);
                        if (!TextUtils.isEmpty(addressLine)) {
                            sb2.append(addressLine);
                        }
                        if (sb2.length() > 0) {
                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue6 = new TLRPC.TL_messageMediaVenue();
                            TLRPC.TL_geoPoint tL_geoPoint10 = new TLRPC.TL_geoPoint();
                            tL_messageMediaVenue6.geo = tL_geoPoint10;
                            tL_geoPoint10.lat = latitude;
                            tL_geoPoint10._long = longitude;
                            tL_messageMediaVenue6.query_id = -1L;
                            tL_messageMediaVenue6.title = sb2.toString();
                            tL_messageMediaVenue6.icon = "pin";
                            tL_messageMediaVenue6.address = LocaleController.getString(R.string.PassportAddress);
                            arrayList.add(tL_messageMediaVenue6);
                        }
                        hashSet3 = hashSet2;
                        hashSet = hashSet4;
                    } else if (sb5 == 0) {
                        sb = sb;
                        if (!z2) {
                            hashSet = hashSet4;
                            if (!hashSet.contains(sb.toString())) {
                                tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint11 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue2.geo = tL_geoPoint11;
                                tL_geoPoint11.lat = latitude;
                                tL_geoPoint11._long = longitude;
                                tL_messageMediaVenue2.query_id = -1L;
                                tL_messageMediaVenue2.title = sb.toString();
                                tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                hashSet.add(tL_messageMediaVenue2.title);
                                tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                if (address3 != null) {
                                    TL_stories.TL_geoPointAddress tL_geoPointAddress17 = new TL_stories.TL_geoPointAddress();
                                    tL_messageMediaVenue2.geoAddress = tL_geoPointAddress17;
                                    tL_geoPointAddress17.country_iso2 = address3.getCountryCode();
                                    if (TextUtils.isEmpty(null)) {
                                        subAdminArea = address3.getLocality();
                                    } else {
                                        subAdminArea = null;
                                    }
                                    if (TextUtils.isEmpty(subAdminArea)) {
                                        subAdminArea = address3.getAdminArea();
                                    }
                                    if (TextUtils.isEmpty(subAdminArea)) {
                                        subAdminArea = address3.getSubAdminArea();
                                    }
                                    adminArea = address3.getAdminArea();
                                    if (!TextUtils.isEmpty(adminArea)) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress18 = tL_messageMediaVenue2.geoAddress;
                                        tL_geoPointAddress18.state = adminArea;
                                        tL_geoPointAddress18.flags |= 1;
                                    }
                                    if (!TextUtils.isEmpty(subAdminArea)) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress19 = tL_messageMediaVenue2.geoAddress;
                                        tL_geoPointAddress19.city = subAdminArea;
                                        tL_geoPointAddress19.flags |= 2;
                                    }
                                }
                                arrayList.add(tL_messageMediaVenue2);
                                if (arrayList.size() < i3) {
                                    break;
                                }
                                break;
                                break;
                            }
                        } else {
                            hashSet = hashSet4;
                        }
                        if (sb3.length() > 0) {
                            hashSet3 = hashSet2;
                            if (hashSet3.contains(sb3.toString())) {
                                tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint12 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue.geo = tL_geoPoint12;
                                tL_geoPoint12.lat = latitude;
                                tL_geoPoint12._long = longitude;
                                tL_messageMediaVenue.query_id = -1L;
                                tL_messageMediaVenue.title = sb3.toString();
                                tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                hashSet3.add(tL_messageMediaVenue.title);
                                tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                if (address3 != null) {
                                    TL_stories.TL_geoPointAddress tL_geoPointAddress110 = new TL_stories.TL_geoPointAddress();
                                    tL_messageMediaVenue.geoAddress = tL_geoPointAddress110;
                                    tL_geoPointAddress110.country_iso2 = address3.getCountryCode();
                                }
                                arrayList.add(tL_messageMediaVenue);
                                if (arrayList.size() >= i3) {
                                    break;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            hashSet3 = hashSet2;
                        }
                    } else {
                        sb = sb;
                        if (!z2) {
                            hashSet = hashSet4;
                            if (!hashSet.contains(sb.toString())) {
                                tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint13 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue2.geo = tL_geoPoint13;
                                tL_geoPoint13.lat = latitude;
                                tL_geoPoint13._long = longitude;
                                tL_messageMediaVenue2.query_id = -1L;
                                tL_messageMediaVenue2.title = sb.toString();
                                tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                hashSet.add(tL_messageMediaVenue2.title);
                                tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                if (address3 != null) {
                                    TL_stories.TL_geoPointAddress tL_geoPointAddress111 = new TL_stories.TL_geoPointAddress();
                                    tL_messageMediaVenue2.geoAddress = tL_geoPointAddress111;
                                    tL_geoPointAddress111.country_iso2 = address3.getCountryCode();
                                    if (TextUtils.isEmpty(null)) {
                                        subAdminArea = address3.getLocality();
                                    } else {
                                        subAdminArea = null;
                                    }
                                    if (TextUtils.isEmpty(subAdminArea)) {
                                        subAdminArea = address3.getAdminArea();
                                    }
                                    if (TextUtils.isEmpty(subAdminArea)) {
                                        subAdminArea = address3.getSubAdminArea();
                                    }
                                    adminArea = address3.getAdminArea();
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
                                if (arrayList.size() < i3) {
                                    break;
                                }
                                break;
                                break;
                            }
                        } else {
                            hashSet = hashSet4;
                        }
                        if (sb3.length() > 0) {
                            hashSet3 = hashSet2;
                            if (hashSet3.contains(sb3.toString())) {
                                tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint14 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue.geo = tL_geoPoint14;
                                tL_geoPoint14.lat = latitude;
                                tL_geoPoint14._long = longitude;
                                tL_messageMediaVenue.query_id = -1L;
                                tL_messageMediaVenue.title = sb3.toString();
                                tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                hashSet3.add(tL_messageMediaVenue.title);
                                tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                if (address3 != null) {
                                    TL_stories.TL_geoPointAddress tL_geoPointAddress114 = new TL_stories.TL_geoPointAddress();
                                    tL_messageMediaVenue.geoAddress = tL_geoPointAddress114;
                                    tL_geoPointAddress114.country_iso2 = address3.getCountryCode();
                                }
                                arrayList.add(tL_messageMediaVenue);
                                if (arrayList.size() >= i3) {
                                    break;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            hashSet3 = hashSet2;
                        }
                    }
                } else {
                    list = fromLocationName2;
                    list2 = fromLocationName;
                    hashSet = hashSet4;
                    i = i4;
                }
                i4 = i + 1;
                baseLocationAdapter2 = baseLocationAdapter;
                hashSet4 = hashSet;
                fromLocationName2 = list;
                fromLocationName = list2;
            }
        } catch (Exception unused2) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BaseLocationAdapter.m1281$r8$lambda$gr5_sHZ3bA1F39VYaMSAdJTd0(this.f$0, location, str2, arrayList);
            }
        });
    }

    public static void m1281$r8$lambda$gr5_sHZ3bA1F39VYaMSAdJTd0(BaseLocationAdapter baseLocationAdapter, Location location, String str, ArrayList arrayList) {
        baseLocationAdapter.searchingLocations = false;
        if (location == null) {
            baseLocationAdapter.currentRequestNum = 0;
            baseLocationAdapter.searching = false;
            baseLocationAdapter.places.clear();
            baseLocationAdapter.searchInProgress = false;
            baseLocationAdapter.lastFoundQuery = str;
        }
        baseLocationAdapter.locations.clear();
        baseLocationAdapter.locations.addAll(arrayList);
        baseLocationAdapter.update(true);
    }

    public static void m1280$r8$lambda$ZC2XbztLqEWm164HtZHxnTSS8(final BaseLocationAdapter baseLocationAdapter, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        baseLocationAdapter.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BaseLocationAdapter.m1277$r8$lambda$9fAnmZcQFtCjpcrhZURpZasDmY(this.f$0, tL_error, str, tLObject);
            }
        });
    }

    public static void m1277$r8$lambda$9fAnmZcQFtCjpcrhZURpZasDmY(BaseLocationAdapter baseLocationAdapter, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        if (tL_error == null) {
            baseLocationAdapter.currentRequestNum = 0;
            baseLocationAdapter.searching = false;
            baseLocationAdapter.places.clear();
            baseLocationAdapter.searchInProgress = false;
            baseLocationAdapter.lastFoundQuery = str;
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
                        baseLocationAdapter.places.add(tL_messageMediaVenue);
                    }
                }
            }
        }
        BaseLocationAdapterDelegate baseLocationAdapterDelegate = baseLocationAdapter.delegate;
        if (baseLocationAdapterDelegate != null) {
            baseLocationAdapterDelegate.didLoadSearchResult(baseLocationAdapter.places);
        }
        baseLocationAdapter.update(true);
    }

    protected void update(boolean z) {
        notifyDataSetChanged();
    }
}
