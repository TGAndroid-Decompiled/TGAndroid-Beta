package org.telegram.ui;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
public final class n51 implements LocationListener {
    public final ThemeActivity f47893a;

    public n51(ThemeActivity themeActivity) {
        this.f47893a = themeActivity;
    }

    @Override
    public final void onLocationChanged(Location location) {
        ThemeActivity themeActivity = this.f47893a;
        if (location == null) {
            return;
        }
        themeActivity.L0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f25457b.getSystemService("location");
        locationManager.removeUpdates(themeActivity.R0);
        locationManager.removeUpdates(themeActivity.S0);
        themeActivity.G0(location, false);
    }

    @Override
    public final void onProviderDisabled(String str) {
    }

    @Override
    public final void onProviderEnabled(String str) {
    }

    @Override
    public final void onStatusChanged(String str, int i3, Bundle bundle) {
    }
}
