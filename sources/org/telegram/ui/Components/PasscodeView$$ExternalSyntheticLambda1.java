package org.telegram.ui.Components;

public final class PasscodeView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final PasscodeView f$0;

    public PasscodeView$$ExternalSyntheticLambda1(PasscodeView passcodeView, int i) {
        this.$r8$classId = i;
        this.f$0 = passcodeView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onResume$12();
                break;
            default:
                this.f$0.lambda$processDone$11();
                break;
        }
    }
}
