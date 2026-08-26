package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.ChatMessageCell;

public final class ChatActivity$$ExternalSyntheticLambda26 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final int f$1;

    public ChatActivity$$ExternalSyntheticLambda26(ChatActivity chatActivity, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chatActivity;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        ChatMessageCell chatMessageCell;
        MessageObject messageObject;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didReceivedNotification3$174(this.f$1);
                break;
            case 1:
                this.f$0.getConnectionsManager().cancelRequest(this.f$1, true);
                break;
            case 2:
                this.f$0.scrollToMessageId(this.f$1, 0, false, 0, true, 0);
                break;
            case 3:
                this.f$0.getConnectionsManager().cancelRequest(this.f$1, true);
                break;
            case 4:
                ChatActivity chatActivity = this.f$0;
                ChatActivity.AnonymousClass21 anonymousClass21 = chatActivity.chatListView;
                if (anonymousClass21 != null) {
                    int childCount = anonymousClass21.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = chatActivity.chatListView.getChildAt(i);
                        if ((childAt instanceof ChatMessageCell) && (messageObject = (chatMessageCell = (ChatMessageCell) childAt).getMessageObject()) != null && messageObject.equals(chatActivity.hintMessageObject)) {
                            chatMessageCell.showHintButton(this.f$1, true, true);
                        }
                    }
                }
                chatActivity.hintMessageObject = null;
                break;
            case 5:
                this.f$0.lambda$didReceivedNotification7$189(this.f$1);
                break;
            case 6:
                this.f$0.getConnectionsManager().cancelRequest(this.f$1, true);
                break;
            case 7:
                this.f$0.lambda$createView$23(this.f$1);
                break;
            case 8:
                this.f$0.lambda$createView$22(this.f$1);
                break;
            default:
                this.f$0.getConnectionsManager().cancelRequest(this.f$1, true);
                break;
        }
    }
}
