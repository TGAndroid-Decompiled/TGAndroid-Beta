package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class lb1 implements Runnable {
    public final int f35292a;
    public final ThemeActivity f35293b;

    public lb1(ThemeActivity themeActivity, int i10) {
        this.f35292a = i10;
        this.f35293b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f35292a) {
            case 0:
                ThemeActivity themeActivity = this.f35293b;
                themeActivity.f31837b.e1(new hb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f35293b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.h6.f19418x, org.telegram.ui.ActionBar.h6.f19436y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new p81(5, themeActivity2, str));
                return;
        }
    }
}
