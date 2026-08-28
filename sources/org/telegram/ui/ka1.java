package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ka1 implements Runnable {
    public final int f39785a;
    public final ThemeActivity f39786b;

    public ka1(ThemeActivity themeActivity, int i9) {
        this.f39785a = i9;
        this.f39786b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f39785a) {
            case 0:
                ThemeActivity themeActivity = this.f39786b;
                themeActivity.f36227b.e1(new ga1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f39786b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.f6.f23344x, org.telegram.ui.ActionBar.f6.f23362y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new n21(12, themeActivity2, str));
                return;
        }
    }
}
