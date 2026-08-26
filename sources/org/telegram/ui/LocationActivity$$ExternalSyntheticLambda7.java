package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;

public final class LocationActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final LocationActivity f$0;
    public final IMapsProvider.IMapView f$1;

    public LocationActivity$$ExternalSyntheticLambda7(LocationActivity locationActivity, IMapsProvider.IMapView iMapView, int i) {
        this.$r8$classId = i;
        this.f$0 = locationActivity;
        this.f$1 = iMapView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                IMapsProvider.IMapView iMapView = this.f$1;
                LocationActivity locationActivity = this.f$0;
                try {
                    iMapView.onCreate(null);
                    break;
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new LocationActivity$$ExternalSyntheticLambda7(locationActivity, iMapView, 1));
                break;
            default:
                LocationActivity locationActivity2 = this.f$0;
                IMapsProvider.IMapView iMapView2 = this.f$1;
                if (locationActivity2.mapView != null && locationActivity2.getParentActivity() != null) {
                    try {
                        iMapView2.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        locationActivity2.mapView.getMapAsync(new LocationActivity$$ExternalSyntheticLambda38(locationActivity2, 0));
                        locationActivity2.mapsInitialized = true;
                        if (locationActivity2.onResumeCalled) {
                            locationActivity2.mapView.onResume();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    break;
                }
                break;
        }
    }
}
