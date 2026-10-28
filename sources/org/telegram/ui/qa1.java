package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class qa1 implements Runnable {
    public final int f42659a;
    public final ThemeActivity f42660b;

    public qa1(ThemeActivity themeActivity, int i10) {
        this.f42659a = i10;
        this.f42660b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f42659a) {
            case 0:
                ThemeActivity themeActivity = this.f42660b;
                themeActivity.f36289b.e1(new ma1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f42660b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.y6.f23725x, org.telegram.ui.ActionBar.y6.f23743y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new by0(27, themeActivity2, str));
                return;
        }
    }
}
