package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.ChatActivity$70$$ExternalSyntheticLambda1;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.Stars.BalanceCloud$$ExternalSyntheticLambda0;

public class DialogsBotsAdapter extends UniversalAdapter {
    public final int currentAccount;
    public boolean expandedMyBots;
    public boolean expandedSearchBots;
    public boolean first;
    public final int folderId;
    public boolean hasMore;
    public final CharSequence infoText;
    public boolean loadingBots;
    public boolean loadingMessages;
    public int nextRate;
    public final DialogCell$$ExternalSyntheticLambda6 openBotCallback;
    public final PopularBots popular;
    public String query;
    public int searchBotsId;
    public final ArrayList searchGlobal;
    public final ArrayList searchMessages;
    public final DialogsBotsAdapter$$ExternalSyntheticLambda2 searchMessagesRunnable;
    public final ArrayList searchMine;
    public final boolean showOnlyPopular;
    public int topPeersEnd;
    public int topPeersStart;

    public final class PopularBots {
        public boolean cacheLoaded;
        public long cacheTime;
        public final int currentAccount;
        public boolean endReached;
        public String lastOffset;
        public boolean loading;
        public final DialogsBotsAdapter$$ExternalSyntheticLambda2 whenUpdated;
        public final ArrayList bots = new ArrayList();
        public boolean savingCache = false;

        public PopularBots(int i, DialogsBotsAdapter$$ExternalSyntheticLambda2 dialogsBotsAdapter$$ExternalSyntheticLambda2) {
            this.currentAccount = i;
            this.whenUpdated = dialogsBotsAdapter$$ExternalSyntheticLambda2;
        }

        public final void load() {
            if (this.loading || this.endReached) {
                return;
            }
            this.loading = true;
            boolean z = this.cacheLoaded;
            int i = this.currentAccount;
            if (!z) {
                DialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda0 dialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda0 = new DialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda0(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
                messagesStorage.getStorageQueue().postRunnable(new FilterGLThread$$ExternalSyntheticLambda1(this, messagesStorage, dialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda0, 8));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.lastOffset;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i).sendRequest(getpopularappbots, new CallLogActivity$$ExternalSyntheticLambda1(this, 19));
        }
    }

    public DialogsBotsAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(recyclerListView, context, i, 0, true, null, resourcesProvider);
        this.searchMine = new ArrayList();
        this.searchGlobal = new ArrayList();
        this.searchMessages = new ArrayList();
        this.searchMessagesRunnable = new DialogsBotsAdapter$$ExternalSyntheticLambda2(this, 0);
        this.first = true;
        this.openBotCallback = new DialogCell$$ExternalSyntheticLambda6(this, 17);
        this.fillItems = new CallLogActivity$$ExternalSyntheticLambda3(this, 25);
        this.currentAccount = i;
        this.folderId = i2;
        this.showOnlyPopular = z;
        this.popular = new PopularBots(i, new DialogsBotsAdapter$$ExternalSyntheticLambda2(this, 1));
        this.infoText = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new BalanceCloud$$ExternalSyntheticLambda0(this, resourcesProvider, context)), true);
        update(false);
        MediaDataController.getInstance(i).loadHints(true);
    }

    public final void checkBottom() {
        boolean zIsEmpty = TextUtils.isEmpty(this.query);
        RecyclerListView recyclerListView = this.listView;
        if (zIsEmpty) {
            if (this.first) {
                this.popular.load();
                break;
            } else if (recyclerListView != null) {
                for (int i = 0; i < recyclerListView.getChildCount(); i++) {
                    if (recyclerListView.getChildAt(i) instanceof FlickerLoadingView) {
                        this.popular.load();
                        break;
                    }
                }
            }
        } else if (this.hasMore && !this.loadingMessages && recyclerListView != null) {
            for (int i2 = 0; i2 < recyclerListView.getChildCount(); i2++) {
                if (recyclerListView.getChildAt(i2) instanceof FlickerLoadingView) {
                    if (this.hasMore && !this.loadingMessages && !TextUtils.isEmpty(this.query)) {
                        searchMessages(true);
                        break;
                    } else {
                        break;
                        break;
                        break;
                    }
                }
            }
        }
        this.first = false;
    }

    public final void searchMessages(boolean z) {
        this.loadingMessages = true;
        int i = this.searchBotsId + 1;
        this.searchBotsId = i;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = false;
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
            ArrayList arrayList = this.searchMessages;
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
        AndroidUtilities.runOnUIThread(new ChatActivity$70$$ExternalSyntheticLambda1(this, i, tL_messages_searchGlobal, z, 3), z ? 800L : 0L);
        if (z) {
            return;
        }
        this.loadingBots = true;
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.limit = 30;
        tL_contacts_search.bots = true;
        tL_contacts_search.q = this.query;
        ConnectionsManager.getInstance(i3).sendRequestTyped(tL_contacts_search, new AiTonesController$$ExternalSyntheticLambda0(), new OAuthSheet$$ExternalSyntheticLambda18(9, this, tL_contacts_search));
    }
}
