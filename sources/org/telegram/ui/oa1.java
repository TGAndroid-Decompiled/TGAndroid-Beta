package org.telegram.ui;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import org.telegram.messenger.ApplicationLoader;
public final class oa1 implements LocationListener {
    public final ThemeActivity f41037a;

    public oa1(ThemeActivity themeActivity) {
        this.f41037a = themeActivity;
    }

    @Override
    public final void onLocationChanged(Location location) {
        ThemeActivity themeActivity = this.f41037a;
        if (location == null) {
            return;
        }
        themeActivity.G0 = false;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        locationManager.removeUpdates(themeActivity.M0);
        locationManager.removeUpdates(themeActivity.N0);
        themeActivity.A0(location, false);
    }

    @Override
    public final void onProviderDisabled(String str) {
    }

    @Override
    public final void onProviderEnabled(String str) {
    }

    @Override
    public final void onStatusChanged(String str, int i9, Bundle bundle) {
    }
}
