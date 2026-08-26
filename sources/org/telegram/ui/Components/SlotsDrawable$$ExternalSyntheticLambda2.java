package org.telegram.ui.Components;

public final class SlotsDrawable$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final SlotsDrawable f$0;

    public SlotsDrawable$$ExternalSyntheticLambda2(SlotsDrawable slotsDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = slotsDrawable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SlotsDrawable slotsDrawable = this.f$0;
                slotsDrawable.secondLoadingInBackground = false;
                if (!slotsDrawable.loadingInBackground && slotsDrawable.destroyAfterLoading) {
                    slotsDrawable.recycle(true);
                    break;
                }
                break;
            case 1:
                this.f$0.secondLoadingInBackground = false;
                break;
            case 2:
                SlotsDrawable slotsDrawable2 = this.f$0;
                slotsDrawable2.loadingInBackground = false;
                if (!slotsDrawable2.secondLoadingInBackground && slotsDrawable2.destroyAfterLoading) {
                    slotsDrawable2.recycle(true);
                    break;
                }
                break;
            default:
                this.f$0.loadingInBackground = false;
                break;
        }
    }
}
