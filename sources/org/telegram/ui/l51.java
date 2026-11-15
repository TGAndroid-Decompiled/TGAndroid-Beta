package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
public final class l51 implements Runnable {
    public final int f48852a;
    public final ThemeActivity f48853b;

    public l51(ThemeActivity themeActivity, int i7) {
        this.f48852a = i7;
        this.f48853b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f48852a) {
            case 0:
                ThemeActivity themeActivity = this.f48853b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.f26609b, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.j6.f29215x, org.telegram.ui.ActionBar.j6.f29234y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new fy0(10, themeActivity, str));
                return;
            default:
                ThemeActivity themeActivity2 = this.f48853b;
                themeActivity2.f43386b.e1(new k51(themeActivity2, 0), 700, true);
                return;
        }
    }
}
