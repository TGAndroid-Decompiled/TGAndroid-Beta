package org.telegram.ui.Components;

public final class ThanosEffect$DrawingThread$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ThanosEffect.DrawingThread f$0;
    public final ThanosEffect.DrawingThread.Animation f$1;

    public ThanosEffect$DrawingThread$$ExternalSyntheticLambda0(ThanosEffect.DrawingThread drawingThread, ThanosEffect.DrawingThread.Animation animation, int i) {
        this.$r8$classId = i;
        this.f$0 = drawingThread;
        this.f$1 = animation;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.addAnimationInternal(this.f$1);
                break;
            case 1:
                this.f$0.addAnimationInternal(this.f$1);
                break;
            default:
                this.f$0.addAnimationInternal(this.f$1);
                break;
        }
    }
}
