package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

public final class ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatUsersActivity.SearchAdapter f$0;
    public final String f$1;

    public ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda0(ChatUsersActivity.SearchAdapter searchAdapter, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = searchAdapter;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        ChatUsersActivity$$ExternalSyntheticLambda13 chatUsersActivity$$ExternalSyntheticLambda13;
        switch (this.$r8$classId) {
            case 0:
                ChatUsersActivity.SearchAdapter searchAdapter = this.f$0;
                searchAdapter.getClass();
                AndroidUtilities.runOnUIThread(new ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda0(searchAdapter, this.f$1, 1));
                break;
            default:
                ChatUsersActivity.SearchAdapter searchAdapter2 = this.f$0;
                searchAdapter2.searchRunnable = null;
                ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
                ArrayList arrayList = (ChatObject.isChannel(chatUsersActivity.currentChat) || chatUsersActivity.info == null) ? null : new ArrayList(chatUsersActivity.info.participants.participants);
                int i = chatUsersActivity.selectType;
                ArrayList arrayList2 = i == 1 ? new ArrayList(chatUsersActivity.getContactsController().contacts) : null;
                String str = this.f$1;
                if (arrayList == null && arrayList2 == null) {
                    searchAdapter2.searchInProgress = false;
                    chatUsersActivity$$ExternalSyntheticLambda13 = null;
                } else {
                    chatUsersActivity$$ExternalSyntheticLambda13 = new ChatUsersActivity$$ExternalSyntheticLambda13(searchAdapter2, str, arrayList, arrayList2, 2);
                }
                searchAdapter2.searchAdapterHelper.queryServerSearch(str, i != 0, false, true, false, false, ChatObject.isChannel(chatUsersActivity.currentChat) ? chatUsersActivity.chatId : 0L, false, chatUsersActivity.type, 1, 0L, chatUsersActivity$$ExternalSyntheticLambda13);
                break;
        }
    }
}
