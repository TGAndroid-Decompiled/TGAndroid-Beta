package org.telegram.ui.Stories.recorder;

public final class DualCameraView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final DualCameraView f$0;

    public DualCameraView$$ExternalSyntheticLambda1(DualCameraView dualCameraView, int i) {
        this.$r8$classId = i;
        this.f$0 = dualCameraView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DualCameraView dualCameraView = this.f$0;
                if (dualCameraView.tapTime > 0) {
                    dualCameraView.dualToggleShape();
                    try {
                        dualCameraView.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                DualCameraView dualCameraView2 = this.f$0;
                dualCameraView2.focusToPoint((int) dualCameraView2.tapX, (int) dualCameraView2.tapY);
                break;
        }
    }
}
