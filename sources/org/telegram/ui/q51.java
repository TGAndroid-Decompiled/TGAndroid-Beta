package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
public final class q51 implements Runnable {
    public final int f48964a;
    public final ThemeActivity f48965b;

    public q51(ThemeActivity themeActivity, int i7) {
        this.f48964a = i7;
        this.f48965b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f48964a) {
            case 0:
                ThemeActivity themeActivity = this.f48965b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.f25570b, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.m6.f28256x, org.telegram.ui.ActionBar.m6.f28275y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new rw0(15, themeActivity, str));
                return;
            default:
                ThemeActivity themeActivity2 = this.f48965b;
                themeActivity2.f42011b.e1(new p51(themeActivity2, 0), 700, true);
                return;
        }
    }
}
