package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
public final class g71 implements Runnable {
    public final int f37448a;
    public final ThemeActivity f37449b;

    public g71(ThemeActivity themeActivity, int i10) {
        this.f37448a = i10;
        this.f37449b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f37448a) {
            case 0:
                ThemeActivity themeActivity = this.f37449b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.w0.f19025b, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.t6.f21288x, org.telegram.ui.ActionBar.t6.f21305y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.g3(new t11(6, themeActivity, str));
                return;
            default:
                ThemeActivity themeActivity2 = this.f37449b;
                themeActivity2.f34089b.e1(new f71(themeActivity2, 0), 700, true);
                return;
        }
    }
}
