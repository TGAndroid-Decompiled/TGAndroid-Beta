package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.BulletinFactory;

public final class ChatActivity$$ExternalSyntheticLambda347 implements MessagesStorage.IntCallback {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda347(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run(int i) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = this.f$0;
                if (chatActivity.getParentActivity() != null && chatActivity.fragmentView != null && i > 0) {
                    BulletinFactory.of(chatActivity).createDownloadBulletin(BulletinFactory.FileType.LIVEPHOTO, i, 0, 0, chatActivity.themeDelegate).show();
                    break;
                }
                break;
            case 1:
                ChatActivity chatActivity2 = this.f$0;
                if (i != 0) {
                    chatActivity2.scrollToMessageId(i, 0, false, 0, true, 0);
                } else {
                    chatActivity2.hasAllMentionsLocal = false;
                    chatActivity2.loadLastUnreadMention();
                }
                break;
            default:
                ChatActivity chatActivity3 = this.f$0;
                if (i != 0) {
                    chatActivity3.finishFragment();
                } else {
                    chatActivity3.updateTopPanel(true);
                }
                break;
        }
    }
}
