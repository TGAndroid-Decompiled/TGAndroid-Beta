package org.telegram.ui;

public final class LocationActivity$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final LocationActivity f$0;
    public final boolean f$1;

    public LocationActivity$$ExternalSyntheticLambda14(LocationActivity locationActivity, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = locationActivity;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showShowAllButton$29(this.f$1);
                break;
            default:
                this.f$0.lambda$openShareLiveLocation$34(this.f$1);
                break;
        }
    }
}
