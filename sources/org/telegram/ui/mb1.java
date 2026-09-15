package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class mb1 implements Runnable {
    public final int f35694a;
    public final ThemeActivity f35695b;

    public mb1(ThemeActivity themeActivity, int i10) {
        this.f35694a = i10;
        this.f35695b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f35694a) {
            case 0:
                ThemeActivity themeActivity = this.f35695b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.i6.f19194x, org.telegram.ui.ActionBar.i6.f19212y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new nb1(0, themeActivity, str));
                return;
            default:
                ThemeActivity themeActivity2 = this.f35695b;
                themeActivity2.f31551b.e1(new jb1(themeActivity2, 1), 700, true);
                return;
        }
    }
}
