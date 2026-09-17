package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pv implements Runnable {
    public final int f39669a;
    public final Context f39670b;

    public pv(Context context, int i10) {
        this.f39669a = i10;
        this.f39670b = context;
    }

    @Override
    public final void run() {
        switch (this.f39669a) {
            case 0:
                org.telegram.ui.ActionBar.j6.J(this.f39670b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f39670b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                of.f.s(this.f39670b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                of.f.s(this.f39670b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                of.f.s(this.f39670b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                of.f.s(this.f39670b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                of.f.s(this.f39670b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                of.f.s(this.f39670b, "https://promote.telegram.org/guidelines");
                return;
            default:
                of.f.s(this.f39670b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
