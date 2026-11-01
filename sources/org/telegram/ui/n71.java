package org.telegram.ui;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
public final class n71 implements LocationListener {
    public final ThemeActivity f39739a;

    public n71(ThemeActivity themeActivity) {
        this.f39739a = themeActivity;
    }

    @Override
    public final void onLocationChanged(Location location) {
        ThemeActivity themeActivity = this.f39739a;
        if (location == null) {
            return;
        }
        themeActivity.K0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.w0.f18945b.getSystemService("location");
        locationManager.removeUpdates(themeActivity.Q0);
        locationManager.removeUpdates(themeActivity.R0);
        themeActivity.G0(location, false);
    }

    @Override
    public final void onProviderDisabled(String str) {
    }

    @Override
    public final void onProviderEnabled(String str) {
    }

    @Override
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
