package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lv implements Runnable {
    public final int f35095a;
    public final Context f35096b;

    public lv(Context context, int i10) {
        this.f35095a = i10;
        this.f35096b = context;
    }

    @Override
    public final void run() {
        switch (this.f35095a) {
            case 0:
                org.telegram.ui.ActionBar.h6.J(this.f35096b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f35096b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                nf.f.s(this.f35096b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                nf.f.s(this.f35096b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                nf.f.s(this.f35096b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                nf.f.s(this.f35096b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                nf.f.s(this.f35096b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                nf.f.s(this.f35096b, "https://promote.telegram.org/guidelines");
                return;
            default:
                nf.f.s(this.f35096b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
