package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class lb1 implements Runnable {
    public final int f35275a;
    public final ThemeActivity f35276b;

    public lb1(ThemeActivity themeActivity, int i10) {
        this.f35275a = i10;
        this.f35276b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f35275a) {
            case 0:
                ThemeActivity themeActivity = this.f35276b;
                themeActivity.f31839b.e1(new hb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f35276b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.h6.f19420x, org.telegram.ui.ActionBar.h6.f19438y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new n81(6, themeActivity2, str));
                return;
        }
    }
}
