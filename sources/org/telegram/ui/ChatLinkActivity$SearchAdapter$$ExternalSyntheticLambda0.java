package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class ChatLinkActivity$SearchAdapter$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatLinkActivity.SearchAdapter f$0;
    public final String f$1;

    public ChatLinkActivity$SearchAdapter$$ExternalSyntheticLambda0(ChatLinkActivity.SearchAdapter searchAdapter, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = searchAdapter;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatLinkActivity.SearchAdapter searchAdapter = this.f$0;
                searchAdapter.getClass();
                AndroidUtilities.runOnUIThread(new ChatLinkActivity$SearchAdapter$$ExternalSyntheticLambda0(searchAdapter, this.f$1, 1));
                break;
            default:
                ChatLinkActivity.SearchAdapter searchAdapter2 = this.f$0;
                String str = this.f$1;
                searchAdapter2.searchRunnable = null;
                Utilities.searchQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda102(searchAdapter2, str, new ArrayList(ChatLinkActivity.this.chats), 26));
                break;
        }
    }
}
