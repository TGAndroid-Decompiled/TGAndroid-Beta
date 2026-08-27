package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class fv implements Runnable {

    public final int f38209a;

    public final Context f38210b;

    public fv(Context context, int i10) {
        this.f38209a = i10;
        this.f38210b = context;
    }

    @Override
    public final void run() {
        switch (this.f38209a) {
            case 0:
                org.telegram.ui.ActionBar.g6.J(this.f38210b, false);
                break;
            case 1:
                Activity activityFindActivity = AndroidUtilities.findActivity(this.f38210b);
                if (activityFindActivity == null) {
                    activityFindActivity = LaunchActivity.C1;
                }
                if (activityFindActivity != null && !activityFindActivity.isFinishing()) {
                    activityFindActivity.moveTaskToBack(true);
                    break;
                }
                break;
            case 2:
                we.e.s(this.f38210b, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                we.e.s(this.f38210b, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                we.e.s(this.f38210b, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                we.e.s(this.f38210b, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                we.e.s(this.f38210b, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                we.e.s(this.f38210b, "https://promote.telegram.org/guidelines");
                break;
            default:
                we.e.s(this.f38210b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                break;
        }
    }
}
