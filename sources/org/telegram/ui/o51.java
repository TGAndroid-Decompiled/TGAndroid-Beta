package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
public final class o51 implements Runnable {
    public final int f50482a;
    public final ThemeActivity f50483b;

    public o51(ThemeActivity themeActivity, int i7) {
        this.f50482a = i7;
        this.f50483b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f50482a) {
            case 0:
                ThemeActivity themeActivity = this.f50483b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.f26941b, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.m6.f29744x, org.telegram.ui.ActionBar.m6.f29763y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new mz0(7, themeActivity, str));
                return;
            default:
                ThemeActivity themeActivity2 = this.f50483b;
                themeActivity2.f43873b.e1(new n51(themeActivity2, 0), 700, true);
                return;
        }
    }
}
