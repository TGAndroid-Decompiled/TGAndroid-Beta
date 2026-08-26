package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

public final class LocationActivity$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final LocationActivity f$0;

    public LocationActivity$$ExternalSyntheticLambda6(LocationActivity locationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = locationActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new LocationActivity$$ExternalSyntheticLambda6(this.f$0, 2));
                break;
            case 1:
                LocationActivity locationActivity = this.f$0;
                locationActivity.getLocationController().setProximityLocation(locationActivity.dialogId, 0, true);
                locationActivity.canUndo = false;
                break;
            case 2:
                LocationActivity locationActivity2 = this.f$0;
                IMapsProvider.ICameraUpdate iCameraUpdate = locationActivity2.moveToBounds;
                if (iCameraUpdate != null) {
                    locationActivity2.map.moveCamera(iCameraUpdate);
                    locationActivity2.moveToBounds = null;
                }
                break;
            case 3:
                LocationActivity locationActivity3 = this.f$0;
                IMapsProvider.IMap iMap = locationActivity3.map;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!locationActivity3.proximitySheet.getRadiusSet()) {
                    double d = locationActivity3.previousRadius;
                    if (d > 0.0d) {
                        locationActivity3.proximityCircle.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = locationActivity3.proximityCircle;
                        if (iCircle != null) {
                            iCircle.remove();
                            locationActivity3.proximityCircle = null;
                        }
                    }
                }
                locationActivity3.proximitySheet = null;
                break;
            case 4:
                LocationActivity.MapOverlayView mapOverlayView = this.f$0.overlayView;
                if (mapOverlayView != null) {
                    mapOverlayView.updatePositions();
                }
                break;
            default:
                this.f$0.lambda$getRecentLocations$44();
                break;
        }
    }
}
