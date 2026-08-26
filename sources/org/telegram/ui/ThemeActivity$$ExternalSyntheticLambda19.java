package org.telegram.ui;

public final class ThemeActivity$$ExternalSyntheticLambda19 implements Runnable {
    public final int $r8$classId;
    public final ThemeActivity f$0;

    public ThemeActivity$$ExternalSyntheticLambda19(ThemeActivity themeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$15();
                break;
            default:
                this.f$0.lambda$updateSunTime$23();
                break;
        }
    }
}
