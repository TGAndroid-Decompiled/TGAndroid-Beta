package org.telegram.ui.Adapters;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import me.vkryl.android.util.ClickHelper$$ExternalSyntheticLambda0;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda17;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda24;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;

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
    protected ArrayList<TLRPC.TL_messageMediaVenue> locations = new ArrayList<>();
    protected ArrayList<TLRPC.TL_messageMediaVenue> places = new ArrayList<>();
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

    public String getLastSearchString() {
        return this.lastFoundQuery;
    }

    public boolean isSearching() {
        return this.searchInProgress;
    }

    public final void lambda$searchBotUser$2(TLObject tLObject) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        Location location = this.lastSearchLocation;
        this.lastSearchLocation = null;
        searchPlacesWithQuery(this.lastSearchQuery, location, false);
    }

    public final void lambda$searchBotUser$3(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new ClickHelper$$ExternalSyntheticLambda0(29, this, tLObject));
        }
    }

    public final void lambda$searchDelayed$0(String str, Location location) {
        this.searchRunnable = null;
        this.lastSearchLocation = null;
        searchPlacesWithQuery(str, location, true);
    }

    public final void lambda$searchDelayed$1(String str, Location location) {
        AndroidUtilities.runOnUIThread(new BaseLocationAdapter$$ExternalSyntheticLambda2(this, str, location, 0));
    }

    public final void lambda$searchPlacesWithQuery$4(Location location, String str, ArrayList arrayList) {
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

    public final void lambda$searchPlacesWithQuery$5(Locale locale, String str, Locale locale2, Location location, String str2) {
        List<Address> list;
        List<Address> list2;
        HashSet hashSet;
        int i;
        HashSet hashSet2;
        boolean z;
        boolean z2;
        String countryName;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        String subAdminArea;
        String adminArea;
        boolean z3;
        StringBuilder sb;
        String addressLine;
        String[] strArrSplit;
        int length;
        String str3;
        int i2;
        String str4;
        BaseLocationAdapter baseLocationAdapter = this;
        ArrayList arrayList = new ArrayList();
        try {
            int i3 = baseLocationAdapter.biz ? 10 : 5;
            List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, locale).getFromLocationName(str, 5);
            List<Address> fromLocationName2 = baseLocationAdapter.stories ? new Geocoder(ApplicationLoader.applicationContext, locale2).getFromLocationName(str, 5) : null;
            HashSet hashSet3 = new HashSet();
            HashSet hashSet4 = new HashSet();
            int i4 = 0;
            while (i4 < fromLocationName.size()) {
                Address address = fromLocationName.get(i4);
                Address address2 = (fromLocationName2 == null || i4 >= fromLocationName2.size()) ? null : fromLocationName2.get(i4);
                if (address.hasLatitude() && address.hasLongitude()) {
                    double latitude = address.getLatitude();
                    double longitude = address.getLongitude();
                    StringBuilder sb2 = new StringBuilder();
                    list = fromLocationName2;
                    StringBuilder sb3 = new StringBuilder();
                    list2 = fromLocationName;
                    StringBuilder sb4 = new StringBuilder();
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
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(thoroughfare);
                        }
                        z = false;
                        if (TextUtils.isEmpty(str5)) {
                            z2 = true;
                        } else {
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(str5);
                            if (sb4 != null) {
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(str5);
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
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(str3);
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
                            hashSet3 = hashSet2;
                            hashSet = hashSet4;
                        } else {
                            if (sb4 == 0 && sb4.length() > 0) {
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue4.geo = tL_geoPoint2;
                                tL_geoPoint2.lat = latitude;
                                tL_geoPoint2._long = longitude;
                                tL_messageMediaVenue4.query_id = -1L;
                                tL_messageMediaVenue4.title = sb4.toString();
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
                                    StringBuilder sb5 = new StringBuilder();
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
                                            sb5 = null;
                                        } else {
                                            if (sb5.length() > 0) {
                                                sb5.append(", ");
                                            }
                                            sb5.append(thoroughfare2);
                                        }
                                        if (!TextUtils.isEmpty(sb5)) {
                                            int i6 = 0;
                                            while (true) {
                                                String[] strArr = LocationController.unnamedRoads;
                                                if (i6 >= strArr.length) {
                                                    z3 = false;
                                                    break;
                                                } else {
                                                    if (strArr[i6].equalsIgnoreCase(sb5.toString())) {
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
                                        if (!TextUtils.isEmpty(sb5)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue4.geoAddress;
                                            tL_geoPointAddress4.flags |= 4;
                                            tL_geoPointAddress4.street = sb5.toString();
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
                                    sb3 = sb3;
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
                                sb3 = sb3;
                            }
                            if (!z2) {
                                hashSet = hashSet4;
                                if (!hashSet.contains(sb3.toString())) {
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
                            if (sb2.length() > 0) {
                                hashSet3 = hashSet2;
                                if (hashSet3.contains(sb2.toString())) {
                                    continue;
                                } else {
                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint4;
                                    tL_geoPoint4.lat = latitude;
                                    tL_geoPoint4._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb2.toString();
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
                    if (TextUtils.isEmpty(subLocality)) {
                        String locality3 = address.getLocality();
                        if (TextUtils.isEmpty(locality3) || TextUtils.equals(locality3, str5)) {
                            sb4 = null;
                            z = true;
                        } else {
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(locality3);
                        }
                        if (TextUtils.isEmpty(str5)) {
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(str5);
                            if (sb4 != null) {
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(str5);
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
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(str3);
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(countryName);
                        } else {
                            hashSet4 = hashSet4;
                        }
                        if (baseLocationAdapter.biz) {
                            sb = new StringBuilder();
                            addressLine = address.getAddressLine(0);
                            if (!TextUtils.isEmpty(addressLine)) {
                                sb.append(addressLine);
                            }
                            if (sb.length() > 0) {
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue5 = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint5 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue5.geo = tL_geoPoint5;
                                tL_geoPoint5.lat = latitude;
                                tL_geoPoint5._long = longitude;
                                tL_messageMediaVenue5.query_id = -1L;
                                tL_messageMediaVenue5.title = sb.toString();
                                tL_messageMediaVenue5.icon = "pin";
                                tL_messageMediaVenue5.address = LocaleController.getString(R.string.PassportAddress);
                                arrayList.add(tL_messageMediaVenue5);
                            }
                            hashSet3 = hashSet2;
                            hashSet = hashSet4;
                        } else if (sb4 == 0) {
                            sb3 = sb3;
                            if (!z2) {
                                hashSet = hashSet4;
                                if (!hashSet.contains(sb3.toString())) {
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
                            if (sb2.length() > 0) {
                                hashSet3 = hashSet2;
                                if (hashSet3.contains(sb2.toString())) {
                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint7 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint7;
                                    tL_geoPoint7.lat = latitude;
                                    tL_geoPoint7._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb2.toString();
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
                            sb3 = sb3;
                            if (!z2) {
                                hashSet = hashSet4;
                                if (!hashSet.contains(sb3.toString())) {
                                    tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint8 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue2.geo = tL_geoPoint8;
                                    tL_geoPoint8.lat = latitude;
                                    tL_geoPoint8._long = longitude;
                                    tL_messageMediaVenue2.query_id = -1L;
                                    tL_messageMediaVenue2.title = sb3.toString();
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
                            if (sb2.length() > 0) {
                                hashSet3 = hashSet2;
                                if (hashSet3.contains(sb2.toString())) {
                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint9 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint9;
                                    tL_geoPoint9.lat = latitude;
                                    tL_geoPoint9._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb2.toString();
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
                    } else {
                        if (sb4.length() > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(subLocality);
                    }
                    z = false;
                    if (TextUtils.isEmpty(str5)) {
                        if (sb3.length() > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(str5);
                        if (sb4 != null) {
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(str5);
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
                        if (sb3.length() > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(str3);
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(countryName);
                    } else {
                        hashSet4 = hashSet4;
                    }
                    if (baseLocationAdapter.biz) {
                        sb = new StringBuilder();
                        addressLine = address.getAddressLine(0);
                        if (!TextUtils.isEmpty(addressLine)) {
                            sb.append(addressLine);
                        }
                        if (sb.length() > 0) {
                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue6 = new TLRPC.TL_messageMediaVenue();
                            TLRPC.TL_geoPoint tL_geoPoint10 = new TLRPC.TL_geoPoint();
                            tL_messageMediaVenue6.geo = tL_geoPoint10;
                            tL_geoPoint10.lat = latitude;
                            tL_geoPoint10._long = longitude;
                            tL_messageMediaVenue6.query_id = -1L;
                            tL_messageMediaVenue6.title = sb.toString();
                            tL_messageMediaVenue6.icon = "pin";
                            tL_messageMediaVenue6.address = LocaleController.getString(R.string.PassportAddress);
                            arrayList.add(tL_messageMediaVenue6);
                        }
                        hashSet3 = hashSet2;
                        hashSet = hashSet4;
                    } else if (sb4 == 0) {
                        sb3 = sb3;
                        if (!z2) {
                            hashSet = hashSet4;
                            if (!hashSet.contains(sb3.toString())) {
                                tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint11 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue2.geo = tL_geoPoint11;
                                tL_geoPoint11.lat = latitude;
                                tL_geoPoint11._long = longitude;
                                tL_messageMediaVenue2.query_id = -1L;
                                tL_messageMediaVenue2.title = sb3.toString();
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
                        if (sb2.length() > 0) {
                            hashSet3 = hashSet2;
                            if (hashSet3.contains(sb2.toString())) {
                                tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint12 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue.geo = tL_geoPoint12;
                                tL_geoPoint12.lat = latitude;
                                tL_geoPoint12._long = longitude;
                                tL_messageMediaVenue.query_id = -1L;
                                tL_messageMediaVenue.title = sb2.toString();
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
                        sb3 = sb3;
                        if (!z2) {
                            hashSet = hashSet4;
                            if (!hashSet.contains(sb3.toString())) {
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
                        if (sb2.length() > 0) {
                            hashSet3 = hashSet2;
                            if (hashSet3.contains(sb2.toString())) {
                                tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint14 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue.geo = tL_geoPoint14;
                                tL_geoPoint14.lat = latitude;
                                tL_geoPoint14._long = longitude;
                                tL_messageMediaVenue.query_id = -1L;
                                tL_messageMediaVenue.title = sb2.toString();
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
                hashSet4 = hashSet;
                fromLocationName2 = list;
                fromLocationName = list2;
                baseLocationAdapter = this;
            }
        } catch (Exception unused2) {
        }
        AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda17(8, this, location, str2, arrayList));
    }

    public final void lambda$searchPlacesWithQuery$6(TLRPC.TL_error tL_error, String str, TLObject tLObject) {
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
                        tL_messageMediaVenue.icon = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), tL_botInlineMessageMediaVenue.venue_type, "_64.png");
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

    public final void lambda$searchPlacesWithQuery$7(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda17(this, tL_error, str, tLObject));
    }

    public void notifyStartSearch(boolean z, int i, boolean z2) {
        if (!z2) {
            notifyDataSetChanged();
            return;
        }
        if (this.places.isEmpty() || z) {
            if (z) {
                return;
            }
            int iMax = Math.max(0, getItemCount() - 4);
            notifyItemRangeRemoved(iMax, getItemCount() - iMax);
            return;
        }
        int size = this.locations.size() + this.places.size() + 3;
        int i2 = i - size;
        notifyItemInserted(i2);
        notifyItemRangeRemoved(i2, size);
    }

    public final void searchBotUser() {
        if (this.searchingUser) {
            return;
        }
        this.searchingUser = true;
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = this.stories ? MessagesController.getInstance(this.currentAccount).storyVenueSearchBot : MessagesController.getInstance(this.currentAccount).venueSearchBot;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new RichMediaUploader$$ExternalSyntheticLambda0(this, 3));
    }

    public void searchDelayed(String str, Location location) {
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
        BaseLocationAdapter$$ExternalSyntheticLambda2 baseLocationAdapter$$ExternalSyntheticLambda2 = new BaseLocationAdapter$$ExternalSyntheticLambda2(this, str, location, 1);
        this.searchRunnable = baseLocationAdapter$$ExternalSyntheticLambda2;
        dispatchQueue.postRunnable(baseLocationAdapter$$ExternalSyntheticLambda2, 400L);
    }

    public void searchPlacesWithQuery(String str, Location location, boolean z) {
        searchPlacesWithQuery(str, location, z, false);
    }

    public void setDelegate(long j, BaseLocationAdapterDelegate baseLocationAdapterDelegate) {
        this.dialogId = j;
        this.delegate = baseLocationAdapterDelegate;
    }

    public void update(boolean z) {
        notifyDataSetChanged();
    }

    public void searchPlacesWithQuery(String str, Location location, boolean z, boolean z2) {
        Location location2;
        BaseLocationAdapter baseLocationAdapter;
        String str2;
        Location location3;
        Locale locale;
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
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.stories ? MessagesController.getInstance(this.currentAccount).storyVenueSearchBot : MessagesController.getInstance(this.currentAccount).venueSearchBot);
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
                if (TextUtils.isEmpty(str) || !(this.stories || this.biz)) {
                    baseLocationAdapter = this;
                    str2 = str;
                    location3 = location;
                    baseLocationAdapter.searchingLocations = false;
                } else {
                    this.searchingLocations = true;
                    Locale currentLocale = LocaleController.getInstance().getCurrentLocale();
                    if (!this.stories) {
                        locale = locale2;
                    } else if (currentLocale.getLanguage().contains("en")) {
                        locale = currentLocale;
                    } else {
                        locale2 = Locale.US;
                        locale = locale2;
                    }
                    baseLocationAdapter = this;
                    str2 = str;
                    location3 = location;
                    Utilities.globalQueue.postRunnable(new GiftSheet$$ExternalSyntheticLambda24(baseLocationAdapter, currentLocale, str2, locale, location3, str, 1));
                }
                if (location3 == null) {
                    return;
                }
                baseLocationAdapter.currentRequestNum = ConnectionsManager.getInstance(baseLocationAdapter.currentAccount).sendRequest(tL_messages_getInlineBotResults, new StarGiftSheet$$ExternalSyntheticLambda0(7, this, str2));
                update(true);
                return;
            }
            if (z) {
                searchBotUser();
            }
        }
    }
}
