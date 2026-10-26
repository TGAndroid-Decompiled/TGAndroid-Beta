package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class oa1 implements Runnable {
    public final int f42145a;
    public final ThemeActivity f42146b;

    public oa1(ThemeActivity themeActivity, int i10) {
        this.f42145a = i10;
        this.f42146b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f42145a) {
            case 0:
                ThemeActivity themeActivity = this.f42146b;
                themeActivity.f36265b.e1(new ka1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f42146b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.y6.f23724x, org.telegram.ui.ActionBar.y6.f23742y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new fy0(26, themeActivity2, str));
                return;
        }
    }
}
