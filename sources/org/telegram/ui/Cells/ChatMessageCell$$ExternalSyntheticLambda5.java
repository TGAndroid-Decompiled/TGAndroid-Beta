package org.telegram.ui.Cells;

public final class ChatMessageCell$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final ChatMessageCell f$0;

    public ChatMessageCell$$ExternalSyntheticLambda5(int i, ChatMessageCell chatMessageCell) {
        this.$r8$classId = i;
        this.f$0 = chatMessageCell;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkSpoilersMotionEvent$1();
                break;
            case 1:
                this.f$0.invalidateParentForce();
                break;
            case 2:
                this.f$0.invalidateOutbounds();
                break;
            case 3:
                this.f$0.scheduleUpdateRelativeDates();
                break;
            case 4:
                this.f$0.doUpdateRelativeDates();
                break;
            case 5:
                this.f$0.lambda$checkReplyTouchEvent$5();
                break;
            case 6:
                this.f$0.lambda$checkReplyTouchEvent$6();
                break;
            case 7:
                this.f$0.lambda$checkSpoilersMotionEvent$0();
                break;
            case 8:
                ChatMessageCell.lambda$checkSpoilersMotionEvent$2(this.f$0);
                break;
            case 9:
                this.f$0.lambda$onLongPress$12();
                break;
            default:
                this.f$0.lambda$setMessageContent$9();
                break;
        }
    }
}
