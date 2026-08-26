package org.telegram.ui;

public final class PasscodeActivity$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final PasscodeActivity f$0;

    public PasscodeActivity$$ExternalSyntheticLambda11(PasscodeActivity passcodeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passcodeActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.showKeyboard();
                break;
            case 1:
                this.f$0.lambda$processDone$17();
                break;
            case 2:
                this.f$0.lambda$processDone$19();
                break;
            case 3:
                this.f$0.lambda$onPasscodeError$20();
                break;
            case 4:
                this.f$0.lambda$onPasscodeError$21();
                break;
            default:
                this.f$0.lambda$new$0();
                break;
        }
    }
}
