package org.telegram.ui.Stories.recorder;

import org.telegram.ui.Components.Paint.Views.RoundView;

public final class PaintView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final PaintView f$0;
    public final RoundView f$1;

    public PaintView$$ExternalSyntheticLambda1(PaintView paintView, RoundView roundView, int i) {
        this.$r8$classId = i;
        this.f$0 = paintView;
        this.f$1 = roundView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.selectEntity$1(this.f$1, true);
                break;
            default:
                PaintView paintView = this.f$0;
                paintView.getClass();
                paintView.removeEntity$1(this.f$1);
                break;
        }
    }
}
