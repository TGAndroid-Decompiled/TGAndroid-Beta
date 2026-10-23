package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bv implements Runnable {
    public final int f35749a;
    public final Context f35750b;

    public bv(Context context, int i10) {
        this.f35749a = i10;
        this.f35750b = context;
    }

    @Override
    public final void run() {
        switch (this.f35749a) {
            case 0:
                org.telegram.ui.ActionBar.h6.J(this.f35750b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f35750b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.H1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                pf.d.r(this.f35750b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                pf.d.r(this.f35750b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                pf.d.r(this.f35750b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                pf.d.r(this.f35750b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                pf.d.r(this.f35750b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                pf.d.r(this.f35750b, "https://promote.telegram.org/guidelines");
                return;
            default:
                pf.d.r(this.f35750b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
