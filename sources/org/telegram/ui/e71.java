package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
public final class e71 implements Runnable {
    public final int f36764a;
    public final ThemeActivity f36765b;

    public e71(ThemeActivity themeActivity, int i10) {
        this.f36764a = i10;
        this.f36765b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f36764a) {
            case 0:
                ThemeActivity themeActivity = this.f36765b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.w0.f18945b, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.t6.f21289x, org.telegram.ui.ActionBar.t6.f21306y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.g3(new y01(7, themeActivity, str));
                return;
            default:
                ThemeActivity themeActivity2 = this.f36765b;
                themeActivity2.f34096b.e1(new d71(themeActivity2, 0), 700, true);
                return;
        }
    }
}
