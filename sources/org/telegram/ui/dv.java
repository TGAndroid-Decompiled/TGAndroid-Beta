package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dv implements Runnable {
    public final int f37635a;
    public final Context f37636b;

    public dv(Context context, int i10) {
        this.f37635a = i10;
        this.f37636b = context;
    }

    @Override
    public final void run() {
        switch (this.f37635a) {
            case 0:
                org.telegram.ui.ActionBar.g6.J(this.f37636b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f37636b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.C1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                ye.d.s(this.f37636b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                ye.d.s(this.f37636b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                ye.d.s(this.f37636b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                ye.d.s(this.f37636b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                ye.d.s(this.f37636b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                ye.d.s(this.f37636b, "https://promote.telegram.org/guidelines");
                return;
            default:
                ye.d.s(this.f37636b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
