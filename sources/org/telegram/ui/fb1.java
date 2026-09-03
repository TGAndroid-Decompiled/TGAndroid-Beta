package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class fb1 implements Runnable {
    public final int f36758a;
    public final ThemeActivity f36759b;

    public fb1(ThemeActivity themeActivity, int i10) {
        this.f36758a = i10;
        this.f36759b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f36758a) {
            case 0:
                ThemeActivity themeActivity = this.f36759b;
                themeActivity.f34872b.d1(new bb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f36759b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.k6.f22012x, org.telegram.ui.ActionBar.k6.f22031y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new h21(16, themeActivity2, str));
                return;
        }
    }
}
