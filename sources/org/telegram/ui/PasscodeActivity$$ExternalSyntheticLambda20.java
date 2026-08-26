package org.telegram.ui;

public final class PasscodeActivity$$ExternalSyntheticLambda20 implements Runnable {
    public final int $r8$classId;
    public final CodeNumberField f$0;

    public PasscodeActivity$$ExternalSyntheticLambda20(CodeNumberField codeNumberField, int i) {
        this.$r8$classId = i;
        this.f$0 = codeNumberField;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.animateSuccessProgress(1.0f);
                break;
            default:
                this.f$0.animateSuccessProgress(1.0f);
                break;
        }
    }
}
