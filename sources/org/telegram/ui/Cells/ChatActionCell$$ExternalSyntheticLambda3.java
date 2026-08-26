package org.telegram.ui.Cells;

public final class ChatActionCell$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final ChatActionCell f$0;

    public ChatActionCell$$ExternalSyntheticLambda3(ChatActionCell chatActionCell, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActionCell;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invalidateOutbounds();
                break;
            case 1:
                this.f$0.requestLayout();
                break;
            case 2:
                this.f$0.lambda$setMessageObject$1();
                break;
            case 3:
                this.f$0.lambda$onTouchEvent$2();
                break;
            default:
                this.f$0.lambda$onTouchEvent$3();
                break;
        }
    }
}
