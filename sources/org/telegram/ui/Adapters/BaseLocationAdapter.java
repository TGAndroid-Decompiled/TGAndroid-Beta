package org.telegram.ui.Adapters;

import android.location.Location;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda208;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda375;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;

public abstract class BaseLocationAdapter extends AdapterWithDiffUtils {
    public final boolean biz;
    public int currentRequestNum;
    public BaseLocationAdapterDelegate delegate;
    public long dialogId;
    public String lastFoundQuery;
    public Location lastSearchLocation;
    public String lastSearchQuery;
    public boolean searchInProgress;
    public BaseLocationAdapter$$ExternalSyntheticLambda2 searchRunnable;
    public boolean searching;
    public boolean searchingLocations;
    public boolean searchingUser;
    public final boolean stories;
    public boolean searched = false;
    public final ArrayList locations = new ArrayList();
    public final ArrayList places = new ArrayList();
    public final int currentAccount = UserConfig.selectedAccount;

    public interface BaseLocationAdapterDelegate {
        void didLoadSearchResult(ArrayList arrayList);
    }

    public BaseLocationAdapter(boolean z, boolean z2) {
        this.stories = z;
        this.biz = z2;
    }

    public final void destroy() {
        if (this.currentRequestNum != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentRequestNum, true);
            this.currentRequestNum = 0;
        }
    }

    public final void searchDelayed(String str, Location location) {
        if (str == null || str.length() == 0) {
            this.places.clear();
            this.locations.clear();
            this.searchInProgress = false;
            notifyDataSetChanged();
            return;
        }
        if (this.searchRunnable != null) {
            Utilities.searchQueue.cancelRunnable(this.searchRunnable);
            this.searchRunnable = null;
        }
        this.searchInProgress = true;
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        BaseLocationAdapter$$ExternalSyntheticLambda2 baseLocationAdapter$$ExternalSyntheticLambda2 = new BaseLocationAdapter$$ExternalSyntheticLambda2((LocationActivitySearchAdapter) this, str, location, 0);
        this.searchRunnable = baseLocationAdapter$$ExternalSyntheticLambda2;
        dispatchQueue.postRunnable(baseLocationAdapter$$ExternalSyntheticLambda2, 400L);
    }

    public final void searchPlacesWithQuery(String str, Location location, boolean z) {
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
                    Utilities.globalQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda375((Object) baseLocationAdapter, (Object) currentLocale, str2, (Object) locale, (Object) location3, (Object) str, 1));
                }
                if (location3 == null) {
                    return;
                }
                baseLocationAdapter.currentRequestNum = ConnectionsManager.getInstance(baseLocationAdapter.currentAccount).sendRequest(tL_messages_getInlineBotResults, new ChatActivity$$ExternalSyntheticLambda208(7, this, str2));
                notifyDataSetChanged();
                return;
            }
            if (z && !this.searchingUser) {
                this.searchingUser = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                boolean z2 = this.stories;
                int i = this.currentAccount;
                tL_contacts_resolveUsername.username = z2 ? MessagesController.getInstance(i).storyVenueSearchBot : MessagesController.getInstance(i).venueSearchBot;
                ConnectionsManager.getInstance(i).sendRequest(tL_contacts_resolveUsername, new CallLogActivity$$ExternalSyntheticLambda1(this, 3));
            }
        }
    }
}
