package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dv implements Runnable {
    public final int f36727a;
    public final Context f36728b;

    public dv(Context context, int i10) {
        this.f36727a = i10;
        this.f36728b = context;
    }

    @Override
    public final void run() {
        switch (this.f36727a) {
            case 0:
                org.telegram.ui.ActionBar.k6.J(this.f36728b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f36728b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.I1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                pf.d.r(this.f36728b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                pf.d.r(this.f36728b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                pf.d.r(this.f36728b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                pf.d.r(this.f36728b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                pf.d.r(this.f36728b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                pf.d.r(this.f36728b, "https://promote.telegram.org/guidelines");
                return;
            default:
                pf.d.r(this.f36728b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
