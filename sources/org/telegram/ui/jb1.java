package org.telegram.ui;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import org.telegram.messenger.ApplicationLoader;
public final class jb1 implements LocationListener {
    public final ThemeActivity f37939a;

    public jb1(ThemeActivity themeActivity) {
        this.f37939a = themeActivity;
    }

    @Override
    public final void onLocationChanged(Location location) {
        ThemeActivity themeActivity = this.f37939a;
        if (location == null) {
            return;
        }
        themeActivity.H0 = false;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        locationManager.removeUpdates(themeActivity.N0);
        locationManager.removeUpdates(themeActivity.O0);
        themeActivity.B0(location, false);
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
