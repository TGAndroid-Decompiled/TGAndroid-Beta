package org.telegram.ui.Components;

import android.app.Activity;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.ChatActivity$70$$ExternalSyntheticLambda1;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;

public abstract class DialogsChannelsAdapter extends UniversalAdapter {
    public final int currentAccount;
    public boolean expandedMyChannels;
    public boolean expandedSearchChannels;
    public final int folderId;
    public boolean hasMore;
    public boolean loadingChannels;
    public boolean loadingMessages;
    public final ArrayList messages;
    public final ArrayList myChannels;
    public int nextRate;
    public String query;
    public final ArrayList searchChannels;
    public int searchChannelsId;
    public final Bulletin$2$$ExternalSyntheticLambda1 searchMessagesRunnable;
    public final ArrayList searchMyChannels;
    public final ArrayList searchRecommendedChannels;

    public DialogsChannelsAdapter(RecyclerListView recyclerListView, Activity activity, int i, int i2) {
        super(recyclerListView, activity, i, 0, false, null, null);
        this.messages = new ArrayList();
        this.searchMyChannels = new ArrayList();
        this.searchRecommendedChannels = new ArrayList();
        this.searchChannels = new ArrayList();
        this.myChannels = new ArrayList();
        SearchViewPager.AnonymousClass8 anonymousClass8 = (SearchViewPager.AnonymousClass8) this;
        this.searchMessagesRunnable = new Bulletin$2$$ExternalSyntheticLambda1(anonymousClass8, 26);
        this.fillItems = new CallLogActivity$$ExternalSyntheticLambda3(anonymousClass8, 26);
        this.currentAccount = i;
        this.folderId = i2;
        update(false);
    }

    public final void searchMessages$1(boolean z) {
        this.loadingMessages = true;
        int i = this.searchChannelsId + 1;
        this.searchChannelsId = i;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = true;
        int i2 = this.folderId;
        if (i2 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i2;
        }
        tL_messages_searchGlobal.q = this.query;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i3 = this.currentAccount;
        if (z) {
            ArrayList arrayList = this.messages;
            if (arrayList.isEmpty()) {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                MessageObject messageObject = (MessageObject) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.nextRate;
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                if (messageObject.messageOwner.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i3).getInputPeer(messageObject.messageOwner.peer_id);
                }
            }
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        AndroidUtilities.runOnUIThread(new ChatActivity$70$$ExternalSyntheticLambda1(this, i, tL_messages_searchGlobal, z, 4), z ? 800L : 0L);
        if (z) {
            return;
        }
        this.loadingChannels = true;
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.limit = 20;
        tL_contacts_search.broadcasts = true;
        tL_contacts_search.q = this.query;
        ConnectionsManager.getInstance(i3).sendRequestTyped(tL_contacts_search, new AiTonesController$$ExternalSyntheticLambda0(), new OAuthSheet$$ExternalSyntheticLambda18(10, this, tL_contacts_search));
    }

    public final void updateMyChannels() {
        ArrayList arrayList = new ArrayList();
        int i = this.currentAccount;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i).getAllDialogs();
        int size = allDialogs.size();
        int i2 = 0;
        while (i2 < size) {
            TLRPC.Dialog dialog = allDialogs.get(i2);
            i2++;
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-dialog.id));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.isPublic(chat) && !ChatObject.isNotInChat(chat)) {
                arrayList.add(chat);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = this.myChannels;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }
}
