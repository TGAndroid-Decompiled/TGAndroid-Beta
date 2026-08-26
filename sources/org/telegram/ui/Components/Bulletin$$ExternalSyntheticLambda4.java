package org.telegram.ui.Components;

public final class Bulletin$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final Bulletin.Layout f$0;

    public Bulletin$$ExternalSyntheticLambda4(Bulletin.Layout layout, int i) {
        this.$r8$classId = i;
        this.f$0 = layout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onExitTransitionStart();
                break;
            default:
                this.f$0.onEnterTransitionStart();
                break;
        }
    }
}
