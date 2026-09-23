package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class lb1 implements Runnable {
    public final int f34909a;
    public final ThemeActivity f34910b;

    public lb1(ThemeActivity themeActivity, int i10) {
        this.f34909a = i10;
        this.f34910b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f34909a) {
            case 0:
                ThemeActivity themeActivity = this.f34910b;
                themeActivity.f31522b.e1(new gb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f34910b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.h6.f19146x, org.telegram.ui.ActionBar.h6.f19164y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new hb1(0, themeActivity2, str));
                return;
        }
    }
}
