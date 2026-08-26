package org.telegram.ui.Components;

public final class StickersAlert$$ExternalSyntheticLambda32 implements Runnable {
    public final int $r8$classId;
    public final StickersAlert f$0;

    public StickersAlert$$ExternalSyntheticLambda32(StickersAlert stickersAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = stickersAlert;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$disableEditMode$52();
                break;
            case 1:
                this.f$0.lambda$checkOptions$20();
                break;
            case 2:
                this.f$0.lambda$checkOptions$18();
                break;
            case 3:
                this.f$0.lambda$enableEditMode$50();
                break;
            default:
                this.f$0.lambda$onSubItemClick$25();
                break;
        }
    }
}
