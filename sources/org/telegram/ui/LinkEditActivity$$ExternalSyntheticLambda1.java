package org.telegram.ui;

public final class LinkEditActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final LinkEditActivity f$0;

    public LinkEditActivity$$ExternalSyntheticLambda1(LinkEditActivity linkEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = linkEditActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$5();
                break;
            case 1:
                this.f$0.lambda$createView$8();
                break;
            default:
                this.f$0.lambda$createView$6();
                break;
        }
    }
}
