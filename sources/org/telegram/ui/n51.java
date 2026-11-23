package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
public final class n51 implements Runnable {
    public final int f50232a;
    public final ThemeActivity f50233b;

    public n51(ThemeActivity themeActivity, int i7) {
        this.f50232a = i7;
        this.f50233b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f50232a) {
            case 0:
                ThemeActivity themeActivity = this.f50233b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.f27013b, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.n6.f29817x, org.telegram.ui.ActionBar.n6.f29836y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new iy0(11, themeActivity, str));
                return;
            default:
                ThemeActivity themeActivity2 = this.f50233b;
                themeActivity2.f43958b.e1(new m51(themeActivity2, 0), 700, true);
                return;
        }
    }
}
