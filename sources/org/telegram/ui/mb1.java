package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class mb1 implements Runnable {
    public final int f38559a;
    public final ThemeActivity f38560b;

    public mb1(ThemeActivity themeActivity, int i10) {
        this.f38559a = i10;
        this.f38560b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f38559a) {
            case 0:
                ThemeActivity themeActivity = this.f38560b;
                themeActivity.f34541b.e1(new ib1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f38560b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.i6.f21190x, org.telegram.ui.ActionBar.i6.f21208y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new e91(3, themeActivity2, str));
                return;
        }
    }
}
