package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bv implements Runnable {
    public final int f35745a;
    public final Context f35746b;

    public bv(Context context, int i10) {
        this.f35745a = i10;
        this.f35746b = context;
    }

    @Override
    public final void run() {
        switch (this.f35745a) {
            case 0:
                org.telegram.ui.ActionBar.h6.J(this.f35746b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f35746b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.H1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                pf.d.r(this.f35746b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                pf.d.r(this.f35746b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                pf.d.r(this.f35746b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                pf.d.r(this.f35746b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                pf.d.r(this.f35746b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                pf.d.r(this.f35746b, "https://promote.telegram.org/guidelines");
                return;
            default:
                pf.d.r(this.f35746b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
