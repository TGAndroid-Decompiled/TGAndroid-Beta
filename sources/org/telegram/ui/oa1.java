package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class oa1 implements Runnable {
    public final int f42142a;
    public final ThemeActivity f42143b;

    public oa1(ThemeActivity themeActivity, int i10) {
        this.f42142a = i10;
        this.f42143b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f42142a) {
            case 0:
                ThemeActivity themeActivity = this.f42143b;
                themeActivity.f36262b.e1(new ka1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f42143b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.y6.f23722x, org.telegram.ui.ActionBar.y6.f23740y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new fy0(26, themeActivity2, str));
                return;
        }
    }
}
