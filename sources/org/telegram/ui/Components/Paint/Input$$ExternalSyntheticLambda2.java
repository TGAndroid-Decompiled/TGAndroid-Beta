package org.telegram.ui.Components.Paint;

public final class Input$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Input f$0;

    public Input$$ExternalSyntheticLambda2(Input input, int i) {
        this.$r8$classId = i;
        this.f$0 = input;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Input input = this.f$0;
                Brush brush = input.switchedBrushByStylusFrom;
                if (brush != null) {
                    input.renderView.selectBrush(brush);
                    input.switchedBrushByStylusFrom = null;
                }
                break;
            default:
                this.f$0.fill(null, true, null);
                break;
        }
    }
}
