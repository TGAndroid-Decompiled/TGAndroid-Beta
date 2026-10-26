package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class av implements Runnable {
    public final int f37906a;
    public final Context f37907b;

    public av(Context context, int i10) {
        this.f37906a = i10;
        this.f37907b = context;
    }

    @Override
    public final void run() {
        switch (this.f37906a) {
            case 0:
                org.telegram.ui.ActionBar.y6.J(this.f37907b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f37907b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.I1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                qf.d.r(this.f37907b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                qf.d.r(this.f37907b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                qf.d.r(this.f37907b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                qf.d.r(this.f37907b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                qf.d.r(this.f37907b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                qf.d.r(this.f37907b, "https://promote.telegram.org/guidelines");
                return;
            default:
                qf.d.r(this.f37907b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
