package org.telegram.ui.Business;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class LocationActivity$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId = 1;
    public final LocationActivity f$0;
    public final org.telegram.ui.LocationActivity f$1;
    public final AlertDialog f$2;

    public LocationActivity$$ExternalSyntheticLambda8(LocationActivity locationActivity, AlertDialog alertDialog, org.telegram.ui.LocationActivity locationActivity2) {
        this.f$0 = locationActivity;
        this.f$2 = alertDialog;
        this.f$1 = locationActivity2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                org.telegram.ui.LocationActivity locationActivity = this.f$1;
                LocationActivity locationActivity2 = this.f$0;
                try {
                    List<Address> fromLocationName = new Geocoder(locationActivity2.getContext(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(locationActivity2.address, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = locationActivity2.address;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        locationActivity.setInitialLocation(tL_channelLocation);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new LocationActivity$$ExternalSyntheticLambda8(locationActivity2, this.f$2, locationActivity));
                break;
            default:
                LocationActivity locationActivity3 = this.f$0;
                locationActivity3.getClass();
                this.f$2.dismiss();
                locationActivity3.presentFragment(this.f$1);
                break;
        }
    }

    public LocationActivity$$ExternalSyntheticLambda8(LocationActivity locationActivity, org.telegram.ui.LocationActivity locationActivity2, AlertDialog alertDialog) {
        this.f$0 = locationActivity;
        this.f$1 = locationActivity2;
        this.f$2 = alertDialog;
    }
}
