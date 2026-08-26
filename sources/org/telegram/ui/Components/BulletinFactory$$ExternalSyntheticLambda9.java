package org.telegram.ui.Components;

public final class BulletinFactory$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final Bulletin.LottieLayout f$0;

    public BulletinFactory$$ExternalSyntheticLambda9(Bulletin.LottieLayout lottieLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = lottieLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.performHapticFeedback(3, 2);
                break;
            default:
                this.f$0.performHapticFeedback(3, 2);
                break;
        }
    }
}
