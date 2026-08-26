package org.telegram.ui.Components;

public final class PipVideoOverlay$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final PipVideoOverlay f$0;

    public PipVideoOverlay$$ExternalSyntheticLambda12(PipVideoOverlay pipVideoOverlay, int i) {
        this.$r8$classId = i;
        this.f$0 = pipVideoOverlay;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onDismissedInternal();
                break;
            case 1:
                this.f$0.lambda$new$4();
                break;
            case 2:
                this.f$0.onLongClick();
                break;
            default:
                this.f$0.lambda$new$5();
                break;
        }
    }
}
