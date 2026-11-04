package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
public final class d51 implements Runnable {
    public final int f44567a;
    public final ThemeActivity f44568b;

    public d51(ThemeActivity themeActivity, int i3) {
        this.f44567a = i3;
        this.f44568b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f44567a) {
            case 0:
                ThemeActivity themeActivity = this.f44568b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.f25457b, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.k6.f28247x, org.telegram.ui.ActionBar.k6.f28266y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new qv0(18, themeActivity, str));
                return;
            default:
                ThemeActivity themeActivity2 = this.f44568b;
                themeActivity2.f42043b.e1(new c51(themeActivity2, 0), 700, true);
                return;
        }
    }
}
