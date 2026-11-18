package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
public final class o51 implements Runnable {
    public final int f50477a;
    public final ThemeActivity f50478b;

    public o51(ThemeActivity themeActivity, int i7) {
        this.f50477a = i7;
        this.f50478b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f50477a) {
            case 0:
                ThemeActivity themeActivity = this.f50478b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.f26915b, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.n6.f29762x, org.telegram.ui.ActionBar.n6.f29781y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new b31(5, themeActivity, str));
                return;
            default:
                ThemeActivity themeActivity2 = this.f50478b;
                themeActivity2.f43832b.e1(new n51(themeActivity2, 0), 700, true);
                return;
        }
    }
}
