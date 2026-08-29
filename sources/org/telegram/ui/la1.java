package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class la1 implements Runnable {
    public final int f40150a;
    public final ThemeActivity f40151b;

    public la1(ThemeActivity themeActivity, int i10) {
        this.f40150a = i10;
        this.f40151b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f40150a) {
            case 0:
                ThemeActivity themeActivity = this.f40151b;
                themeActivity.f36292b.e1(new ha1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f40151b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.g6.f23412x, org.telegram.ui.ActionBar.g6.f23426y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new t31(9, themeActivity2, str));
                return;
        }
    }
}
