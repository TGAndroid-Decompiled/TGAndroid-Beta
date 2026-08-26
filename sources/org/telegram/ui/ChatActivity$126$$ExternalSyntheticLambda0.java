package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;

public final class ChatActivity$126$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final int f$2;
    public final Object f$3;

    public ChatActivity$126$$ExternalSyntheticLambda0(Object obj, Object obj2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$3 = obj2;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).didReceivedNotification(this.f$1, this.f$2, (Object[]) this.f$3);
                break;
            case 1:
                ((ChatActivity.ChatActivityAdapter.AnonymousClass2) this.f$0).lambda$didPressTaskLink$2((ChatActionCell) this.f$3, this.f$1, this.f$2);
                break;
            case 2:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressFactCheckWhat$1((ChatMessageCell) this.f$3, this.f$1, this.f$2);
                break;
            default:
                ((DialogsActivity.SwipeController) this.f$0).lambda$onSwiped$3((TLRPC.Dialog) this.f$3, this.f$1, this.f$2);
                break;
        }
    }

    public ChatActivity$126$$ExternalSyntheticLambda0(ChatActivity chatActivity, int i, int i2, Object[] objArr) {
        this.$r8$classId = 0;
        this.f$0 = chatActivity;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = objArr;
    }
}
