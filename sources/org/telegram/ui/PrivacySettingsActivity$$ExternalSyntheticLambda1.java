package org.telegram.ui;

public final class PrivacySettingsActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final PrivacySettingsActivity f$0;

    public PrivacySettingsActivity$$ExternalSyntheticLambda1(PrivacySettingsActivity privacySettingsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$9();
                break;
            case 1:
                this.f$0.lambda$createView$14();
                break;
            default:
                this.f$0.lambda$createView$7();
                break;
        }
    }
}
