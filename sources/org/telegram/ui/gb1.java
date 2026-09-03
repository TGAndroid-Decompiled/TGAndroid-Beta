package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class gb1 implements Runnable {
    public final int f34404a;
    public final ThemeActivity f34405b;

    public gb1(ThemeActivity themeActivity, int i10) {
        this.f34404a = i10;
        this.f34405b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f34404a) {
            case 0:
                ThemeActivity themeActivity = this.f34405b;
                themeActivity.f32307b.d1(new cb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f34405b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.j6.f20231x, org.telegram.ui.ActionBar.j6.f20249y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new b11(17, themeActivity2, str));
                return;
        }
    }
}
