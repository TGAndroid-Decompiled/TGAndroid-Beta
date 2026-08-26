package org.telegram.ui;

import org.telegram.messenger.IMapsProvider;

public final class LocationActivity$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final LocationActivity f$0;
    public final IMapsProvider.IMapView f$1;

    public LocationActivity$$ExternalSyntheticLambda15(LocationActivity locationActivity, IMapsProvider.IMapView iMapView, int i) {
        this.$r8$classId = i;
        this.f$0 = locationActivity;
        this.f$1 = iMapView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$24(this.f$1);
                break;
            default:
                this.f$0.lambda$createView$25(this.f$1);
                break;
        }
    }
}
