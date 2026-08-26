package org.telegram.ui.Components;

public final class StickersAlert$$ExternalSyntheticLambda30 implements Runnable {
    public final int $r8$classId;
    public final StickersAlert f$0;

    public StickersAlert$$ExternalSyntheticLambda30(StickersAlert stickersAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = stickersAlert;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.adapter.notifyDataSetChanged();
                break;
            case 1:
                this.f$0.lambda$onSubItemClick$25();
                break;
            case 2:
                this.f$0.adapter.notifyDataSetChanged();
                break;
            case 3:
                this.f$0.lambda$checkOptions$20();
                break;
            default:
                this.f$0.lambda$checkOptions$18();
                break;
        }
    }
}
