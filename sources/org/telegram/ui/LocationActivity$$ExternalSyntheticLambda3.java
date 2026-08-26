package org.telegram.ui;

public final class LocationActivity$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final LocationActivity f$0;

    public LocationActivity$$ExternalSyntheticLambda3(LocationActivity locationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = locationActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$21();
                break;
            case 1:
                this.f$0.lambda$onMapInit$40();
                break;
            case 2:
                this.f$0.lambda$getRecentLocations$44();
                break;
            case 3:
                this.f$0.lambda$createView$22();
                break;
            case 4:
                this.f$0.lambda$createView$10();
                break;
            case 5:
                this.f$0.lambda$createView$6();
                break;
            default:
                this.f$0.lambda$openProximityAlert$33();
                break;
        }
    }
}
