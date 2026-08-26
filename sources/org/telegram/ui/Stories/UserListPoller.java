package org.telegram.ui.Stories;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;

public final class UserListPoller {
    public static final UserListPoller[] istances = new UserListPoller[4];
    public final int currentAccount;
    public final AnonymousClass1 requestCollectedRunnables;
    public final LongSparseLongArray userPollLastTime = new LongSparseLongArray();
    public final ArrayList dialogIds = new ArrayList();
    public final ArrayList collectedDialogIds = new ArrayList();

    public final class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override
        public final void run() {
            UserListPoller userListPoller = UserListPoller.this;
            if (userListPoller.collectedDialogIds.isEmpty()) {
                return;
            }
            ArrayList arrayList = userListPoller.collectedDialogIds;
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            int i = 0;
            while (true) {
                int size = arrayList2.size();
                int i2 = userListPoller.currentAccount;
                if (i >= size) {
                    ConnectionsManager.getInstance(i2).sendRequestTyped(tL_stories_getPeerMaxIDs, new AiTonesController$$ExternalSyntheticLambda0(), new OAuthSheet$$ExternalSyntheticLambda18(25, this, arrayList2));
                    return;
                } else {
                    tL_stories_getPeerMaxIDs.id.add(MessagesController.getInstance(i2).getInputPeer(((Long) arrayList2.get(i)).longValue()));
                    i++;
                }
            }
        }
    }

    public UserListPoller(int i) {
        new ArrayList();
        this.requestCollectedRunnables = new AnonymousClass1();
        this.currentAccount = i;
    }

    public final void checkList(BlurredRecyclerView blurredRecyclerView) {
        TLRPC.UserStatus userStatus;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.dialogIds;
        arrayList.clear();
        for (int i = 0; i < blurredRecyclerView.getChildCount(); i++) {
            View childAt = blurredRecyclerView.getChildAt(i);
            long dialogId = childAt instanceof DialogCell ? ((DialogCell) childAt).getDialogId() : childAt instanceof UserCell ? ((UserCell) childAt).getDialogId() : 0L;
            int i2 = this.currentAccount;
            LongSparseLongArray longSparseLongArray = this.userPollLastTime;
            if (dialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(dialogId));
                if (user != null && !user.bot && !user.self && !user.contact && (userStatus = user.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && jCurrentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, jCurrentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i2).getChat(Long.valueOf(-dialogId));
                if (ChatObject.isChannel(chat) && !ChatObject.isMonoForum(chat) && jCurrentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, jCurrentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.collectedDialogIds.addAll(arrayList);
        AnonymousClass1 anonymousClass1 = this.requestCollectedRunnables;
        AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
        AndroidUtilities.runOnUIThread(anonymousClass1, 300L);
    }
}
