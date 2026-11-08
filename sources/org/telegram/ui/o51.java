package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
public final class o51 implements Runnable {
    public final int f48277a;
    public final ThemeActivity f48278b;

    public o51(ThemeActivity themeActivity, int i7) {
        this.f48277a = i7;
        this.f48278b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f48277a) {
            case 0:
                ThemeActivity themeActivity = this.f48278b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.f25566b, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.k6.f28218x, org.telegram.ui.ActionBar.k6.f28237y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new by0(13, themeActivity, str));
                return;
            default:
                ThemeActivity themeActivity2 = this.f48278b;
                themeActivity2.f42013b.e1(new n51(themeActivity2, 0), 700, true);
                return;
        }
    }
}
