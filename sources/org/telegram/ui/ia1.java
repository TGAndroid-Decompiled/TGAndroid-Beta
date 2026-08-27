package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;

public final class ia1 implements Runnable {

    public final int f39019a;

    public final ThemeActivity f39020b;

    public ia1(ThemeActivity themeActivity, int i10) {
        this.f39019a = i10;
        this.f39020b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f39019a) {
            case 0:
                ThemeActivity themeActivity = this.f39020b;
                themeActivity.f36230b.e1(new ea1(themeActivity, 0), 700, true);
                break;
            default:
                ThemeActivity themeActivity2 = this.f39020b;
                String locality = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.g6.f23399x, org.telegram.ui.ActionBar.g6.f23416y, 1);
                    if (fromLocation.size() > 0) {
                        locality = fromLocation.get(0).getLocality();
                    }
                    break;
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new m21(12, themeActivity2, locality));
                break;
        }
    }
}
