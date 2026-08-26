package org.telegram.ui;

public final class LocationActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final LocationActivity f$0;
    public final boolean f$1;

    public LocationActivity$$ExternalSyntheticLambda0(LocationActivity locationActivity, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = locationActivity;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LocationActivity locationActivity = this.f$0;
                if (!this.f$1) {
                    locationActivity.showAllButton.setVisibility(8);
                } else {
                    locationActivity.getClass();
                }
                break;
            default:
                this.f$0.openShareLiveLocation(this.f$1);
                break;
        }
    }
}
