package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ActionBar.Theme;

public final class ThemeActivity$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final ThemeActivity f$0;

    public ThemeActivity$$ExternalSyntheticLambda4(ThemeActivity themeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = themeActivity;
    }

    @Override
    public final void run() {
        String locality;
        switch (this.$r8$classId) {
            case 0:
                ThemeActivity themeActivity = this.f$0;
                themeActivity.listView.highlightRowInternal(new ThemeActivity$$ExternalSyntheticLambda6(themeActivity, 1), 700, true);
                break;
            default:
                ThemeActivity themeActivity2 = this.f$0;
                themeActivity2.getClass();
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(Theme.autoNightLocationLatitude, Theme.autoNightLocationLongitude, 1);
                    locality = fromLocation.size() > 0 ? fromLocation.get(0).getLocality() : null;
                    break;
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(9, themeActivity2, locality));
                break;
        }
    }
}
