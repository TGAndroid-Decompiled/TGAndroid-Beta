package org.telegram.ui.Components;

public final class BlurBehindDrawable$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final BlurBehindDrawable f$0;

    public BlurBehindDrawable$$ExternalSyntheticLambda0(BlurBehindDrawable blurBehindDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = blurBehindDrawable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$draw$0();
                break;
            case 1:
                this.f$0.lambda$clear$1();
                break;
            default:
                this.f$0.lambda$clear$2();
                break;
        }
    }
}
