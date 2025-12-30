package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MessagesSearchAdapter;
import org.telegram.ui.Stories.StoriesController;

public abstract class HashtagsSearchAdapter extends UniversalAdapter {
    private final boolean[] cashtag;
    private final int currentAccount;
    private boolean endReached;
    private boolean hadStories;
    public boolean hasList;
    private String hashtagQuery;
    private String lastQuery;
    private int lastRate;
    public StoriesController.SearchStoriesList list;
    protected boolean loading;
    private final ArrayList messages;
    private int reqId;
    private int searchId;
    private Runnable searchRunnable;
    private int totalCount;

    protected abstract void scrollToTop(boolean z);

    public HashtagsSearchAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        super(recyclerListView, context, i, 0, null, resourcesProvider);
        this.messages = new ArrayList();
        this.searchId = 0;
        this.reqId = -1;
        this.cashtag = new boolean[1];
        this.fillItems = new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        };
        this.currentAccount = i;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        StoriesController.SearchStoriesList searchStoriesList;
        int i = 0;
        boolean z = this.hasList && (searchStoriesList = this.list) != null && searchStoriesList.getLoadedCount() > 0;
        if (z) {
            arrayList.add(MessagesSearchAdapter.StoriesView.Factory.asStoriesList(this.list));
        }
        this.hadStories = z;
        while (i < this.messages.size()) {
            int i2 = i + 1;
            arrayList.add(UItem.asSearchMessage(i2, (MessageObject) this.messages.get(i)));
            i = i2;
        }
        if (this.loading || !this.endReached) {
            arrayList.add(UItem.asFlicker(-2, 1));
            arrayList.add(UItem.asFlicker(-3, 1));
            arrayList.add(UItem.asFlicker(-4, 1));
        }
        if (this.hadStories || !z) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$fillItems$0();
            }
        });
    }

    public void lambda$fillItems$0() {
        scrollToTop(true);
    }

    public void setInitialData(String str, ArrayList arrayList, int i, int i2) {
        if (TextUtils.equals(str, this.hashtagQuery)) {
            return;
        }
        cancel();
        this.messages.clear();
        this.messages.addAll(arrayList);
        this.totalCount = i2;
        this.endReached = i2 > arrayList.size();
        this.lastRate = i;
        this.hashtagQuery = str;
        update(true);
    }

    public void search(String str) {
        this.lastQuery = str;
        final String hashtag = getHashtag(str, this.cashtag);
        if (!TextUtils.equals(this.hashtagQuery, hashtag)) {
            this.messages.clear();
            this.endReached = false;
            this.totalCount = 0;
            cancel();
        } else if (this.loading) {
            return;
        }
        final int i = this.searchId + 1;
        this.searchId = i;
        if (hashtag == null) {
            return;
        }
        this.loading = true;
        update(true);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$search$3(i, hashtag);
            }
        };
        this.searchRunnable = runnable;
        AndroidUtilities.runOnUIThread(runnable, 300L);
    }

    public void lambda$search$3(final int i, String str) {
        if (i != this.searchId) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.cashtag[0] ? "$" : "#");
        sb.append(this.hashtagQuery);
        final String string = sb.toString();
        StoriesController.SearchStoriesList searchStoriesList = this.list;
        if (searchStoriesList == null || !TextUtils.equals(searchStoriesList.query, string)) {
            this.list = new StoriesController.SearchStoriesList(this.currentAccount, null, string);
        }
        if (this.list.getLoadedCount() <= 0) {
            this.list.load(true, 4);
        }
        this.hasList = true;
        TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
        tL_channels_searchPosts.flags |= 1;
        this.hashtagQuery = str;
        tL_channels_searchPosts.hashtag = str;
        tL_channels_searchPosts.limit = 10;
        if (!this.messages.isEmpty()) {
            ArrayList arrayList = this.messages;
            MessageObject messageObject = (MessageObject) arrayList.get(arrayList.size() - 1);
            tL_channels_searchPosts.offset_rate = this.lastRate;
            tL_channels_searchPosts.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.messageOwner.peer_id);
        } else {
            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_searchPosts, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$search$2(i, string, tLObject, tL_error);
            }
        });
    }

    public void lambda$search$2(final int i, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$search$1(i, tLObject, str);
            }
        });
    }

    public void lambda$search$1(int i, TLObject tLObject, String str) {
        if (i != this.searchId) {
            return;
        }
        boolean zIsEmpty = this.messages.isEmpty();
        this.loading = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages instanceof TLRPC.TL_messages_messages) {
                this.totalCount = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
            } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                this.totalCount = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            }
            this.lastRate = messages_messages.next_rate;
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
            for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i2), false, true);
                messageObject.setQuery(str);
                this.messages.add(messageObject);
            }
            this.endReached = this.messages.size() >= this.totalCount;
            checkBottom();
        } else {
            this.endReached = true;
            this.totalCount = this.messages.size();
        }
        update(true);
        if (zIsEmpty) {
            scrollToTop(false);
        }
    }

    public String getHashtag(String str) {
        return getHashtag(str, null);
    }

    public String getHashtag(String str, boolean[] zArr) {
        if (zArr != null) {
            zArr[0] = false;
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() <= 1) {
            return null;
        }
        if ((strTrim.charAt(0) != '#' && strTrim.charAt(0) != '$') || strTrim.indexOf(64) >= 0) {
            return null;
        }
        if (zArr != null) {
            zArr[0] = strTrim.charAt(0) == '$';
        }
        return strTrim.substring(1);
    }

    public void cancel() {
        StoriesController.SearchStoriesList searchStoriesList = this.list;
        if (searchStoriesList != null) {
            searchStoriesList.cancel();
        }
        this.hasList = false;
        if (this.reqId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            this.reqId = -1;
        }
        AndroidUtilities.cancelRunOnUIThread(this.searchRunnable);
        this.searchId++;
        this.loading = false;
    }

    public void checkBottom() {
        if (TextUtils.isEmpty(this.lastQuery) || this.endReached || this.loading || !seesLoading()) {
            return;
        }
        search(this.lastQuery);
    }

    public boolean seesLoading() {
        if (this.listView == null) {
            return false;
        }
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            if (this.listView.getChildAt(i) instanceof FlickerLoadingView) {
                return true;
            }
        }
        return false;
    }
}
