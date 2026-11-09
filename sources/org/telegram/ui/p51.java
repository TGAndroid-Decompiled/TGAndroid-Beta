package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
public final class p51 implements Runnable {
    public final int f48636a;
    public final ThemeActivity f48637b;

    public p51(ThemeActivity themeActivity, int i7) {
        this.f48636a = i7;
        this.f48637b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f48636a) {
            case 0:
                ThemeActivity themeActivity = this.f48637b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.f25566b, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.l6.f28231x, org.telegram.ui.ActionBar.l6.f28250y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new ax0(14, themeActivity, str));
                return;
            default:
                ThemeActivity themeActivity2 = this.f48637b;
                themeActivity2.f42020b.e1(new o51(themeActivity2, 0), 700, true);
                return;
        }
    }
}
