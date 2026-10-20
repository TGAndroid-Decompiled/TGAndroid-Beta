package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ha1 implements Runnable {
    public final int f37564a;
    public final ThemeActivity f37565b;

    public ha1(ThemeActivity themeActivity, int i10) {
        this.f37564a = i10;
        this.f37565b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f37564a) {
            case 0:
                ThemeActivity themeActivity = this.f37565b;
                themeActivity.f33898b.e1(new da1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f37565b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.h6.f21353x, org.telegram.ui.ActionBar.h6.f21372y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new k71(6, themeActivity2, str));
                return;
        }
    }
}
