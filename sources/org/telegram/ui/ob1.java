package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ob1 implements Runnable {
    public final int f39160a;
    public final ThemeActivity f39161b;

    public ob1(ThemeActivity themeActivity, int i10) {
        this.f39160a = i10;
        this.f39161b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f39160a) {
            case 0:
                ThemeActivity themeActivity = this.f39161b;
                themeActivity.f34528b.f1(new kb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f39161b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.i6.f21185x, org.telegram.ui.ActionBar.i6.f21203y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new g91(3, themeActivity2, str));
                return;
        }
    }
}
