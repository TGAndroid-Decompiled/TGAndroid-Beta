package org.telegram.ui;

public final class SettingsActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final SettingsActivity f$0;

    public SettingsActivity$$ExternalSyntheticLambda0(SettingsActivity settingsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = settingsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.blur3_InvalidateBlur();
                break;
            case 1:
                this.f$0.lambda$fillItems$8();
                break;
            case 2:
                this.f$0.lambda$createView$0();
                break;
            case 3:
                this.f$0.lambda$createView$1();
                break;
            default:
                this.f$0.lambda$onLongClick$16();
                break;
        }
    }
}
