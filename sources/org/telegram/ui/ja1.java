package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ja1 implements Runnable {
    public final int f38122a;
    public final ThemeActivity f38123b;

    public ja1(ThemeActivity themeActivity, int i10) {
        this.f38122a = i10;
        this.f38123b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f38122a) {
            case 0:
                ThemeActivity themeActivity = this.f38123b;
                themeActivity.f33891b.e1(new fa1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f38123b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.h6.f21356x, org.telegram.ui.ActionBar.h6.f21375y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new m71(6, themeActivity2, str));
                return;
        }
    }
}
