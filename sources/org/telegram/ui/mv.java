package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mv implements Runnable {
    public final int f39087a;
    public final Context f39088b;

    public mv(Context context, int i10) {
        this.f39087a = i10;
        this.f39088b = context;
    }

    @Override
    public final void run() {
        switch (this.f39087a) {
            case 0:
                org.telegram.ui.ActionBar.k6.J(this.f39088b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f39088b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.D1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                af.g.s(this.f39088b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                af.g.s(this.f39088b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                af.g.s(this.f39088b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                af.g.s(this.f39088b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                af.g.s(this.f39088b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                af.g.s(this.f39088b, "https://promote.telegram.org/guidelines");
                return;
            default:
                af.g.s(this.f39088b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
