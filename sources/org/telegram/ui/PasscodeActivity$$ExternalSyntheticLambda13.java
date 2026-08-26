package org.telegram.ui;

public final class PasscodeActivity$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final PasscodeActivity f$0;
    public final boolean f$1;

    public PasscodeActivity$$ExternalSyntheticLambda13(int i, PasscodeActivity passcodeActivity, boolean z) {
        this.$r8$classId = i;
        this.f$0 = passcodeActivity;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processDone$18(this.f$1);
                break;
            default:
                this.f$0.lambda$updateFields$16(this.f$1);
                break;
        }
    }
}
