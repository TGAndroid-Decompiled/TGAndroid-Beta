package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
import org.telegram.ui.Adapters.LocationActivityAdapter;

public final class ChatAttachAlertLocationLayout$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertLocationLayout f$0;

    public ChatAttachAlertLocationLayout$$ExternalSyntheticLambda2(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertLocationLayout;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.$r8$classId) {
            case 0:
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = this.f$0;
                double[] dArr = chatAttachAlertLocationLayout.parentAlert.storyLocationPickerLatLong;
                chatAttachAlertLocationLayout.resetMapPosition(dArr[0], dArr[1]);
                break;
            case 1:
                this.f$0.lambda$onShow$33();
                break;
            case 2:
                this.f$0.openShareLiveLocation();
                break;
            case 3:
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout2 = this.f$0;
                chatAttachAlertLocationLayout2.getClass();
                AndroidUtilities.runOnUIThread(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda2(chatAttachAlertLocationLayout2, 4));
                break;
            case 4:
                View view = this.f$0.loadingMapView;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout3 = this.f$0;
                if (!chatAttachAlertLocationLayout3.ignoreIdleCamera) {
                    IMapsProvider.IMap iMap = chatAttachAlertLocationLayout3.map;
                    if (iMap != null && (location = chatAttachAlertLocationLayout3.userLocation) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        chatAttachAlertLocationLayout3.userLocation.setLongitude(chatAttachAlertLocationLayout3.map.getCameraPosition().target.longitude);
                    }
                    LocationActivityAdapter locationActivityAdapter = chatAttachAlertLocationLayout3.adapter;
                    locationActivityAdapter.customLocation = chatAttachAlertLocationLayout3.userLocation;
                    locationActivityAdapter.fetchLocationAddress();
                    locationActivityAdapter.updateCell();
                    locationActivityAdapter.fetchLocationAddress();
                } else {
                    chatAttachAlertLocationLayout3.ignoreIdleCamera = false;
                }
                break;
            case 6:
                ChatAttachAlertLocationLayout.MapOverlayView mapOverlayView = this.f$0.overlayView;
                if (mapOverlayView != null) {
                    mapOverlayView.updatePositions();
                }
                break;
            case 7:
                View view2 = this.f$0.loadingMapView;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                }
                break;
            default:
                this.f$0.resetMapPosition(0.0d, 0.0d);
                break;
        }
    }
}
