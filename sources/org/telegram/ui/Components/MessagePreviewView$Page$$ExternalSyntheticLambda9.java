package org.telegram.ui.Components;

public final class MessagePreviewView$Page$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final MessagePreviewView.Page f$0;

    public MessagePreviewView$Page$$ExternalSyntheticLambda9(MessagePreviewView.Page page, int i) {
        this.$r8$classId = i;
        this.f$0 = page;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$1();
                break;
            default:
                this.f$0.lambda$checkScroll$20();
                break;
        }
    }
}
