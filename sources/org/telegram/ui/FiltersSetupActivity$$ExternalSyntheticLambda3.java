package org.telegram.ui;

public final class FiltersSetupActivity$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final FiltersSetupActivity f$0;

    public FiltersSetupActivity$$ExternalSyntheticLambda3(FiltersSetupActivity filtersSetupActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onDefaultTabMoved$7();
                break;
            case 1:
                this.f$0.lambda$updateRows$0();
                break;
            default:
                this.f$0.lambda$createView$6();
                break;
        }
    }
}
