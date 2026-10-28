package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cv implements Runnable {
    public final int f38463a;
    public final Context f38464b;

    public cv(Context context, int i10) {
        this.f38463a = i10;
        this.f38464b = context;
    }

    @Override
    public final void run() {
        switch (this.f38463a) {
            case 0:
                org.telegram.ui.ActionBar.y6.J(this.f38464b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f38464b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.I1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                qf.d.r(this.f38464b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                qf.d.r(this.f38464b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                qf.d.r(this.f38464b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                qf.d.r(this.f38464b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                qf.d.r(this.f38464b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                qf.d.r(this.f38464b, "https://promote.telegram.org/guidelines");
                return;
            default:
                qf.d.r(this.f38464b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
