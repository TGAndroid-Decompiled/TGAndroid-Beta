package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;

public final class ChatActivity$16$$ExternalSyntheticLambda2 implements MessagesStorage.IntCallback {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public ChatActivity$16$$ExternalSyntheticLambda2(int i, Object obj, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void run(int i) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.AnonymousClass16 anonymousClass16 = (ChatActivity.AnonymousClass16) this.f$0;
                if (i > 0) {
                    ChatActivity chatActivity = ChatActivity.this;
                    if (chatActivity.getParentActivity() != null) {
                        BulletinFactory.of(chatActivity).createDownloadBulletin(this.f$1 ? BulletinFactory.FileType.AUDIOS : BulletinFactory.FileType.UNKNOWNS, i, 0, 0, chatActivity.themeDelegate).show();
                        break;
                    }
                }
                break;
            default:
                ChatActivity.AnonymousClass16.AnonymousClass1 anonymousClass1 = (ChatActivity.AnonymousClass16.AnonymousClass1) this.f$0;
                ChatActivity chatActivity2 = ChatActivity.this;
                if (i < 50) {
                    chatActivity2.performHistoryClear(chatActivity2.threadMessageId, true);
                } else {
                    TLRPC.Chat chat = chatActivity2.currentChat;
                    TLRPC.User user = chatActivity2.currentUser;
                    boolean z = this.f$1;
                    AlertsCreator.createClearOrDeleteDialogAlert(chatActivity2, true, chat, user, false, false, false, z, new ChatActivity$$ExternalSyntheticLambda356(anonymousClass1, z));
                }
                break;
        }
    }
}
