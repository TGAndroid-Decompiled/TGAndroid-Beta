package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cv implements Runnable {
    public final int f37328a;
    public final Context f37329b;

    public cv(Context context, int i9) {
        this.f37328a = i9;
        this.f37329b = context;
    }

    @Override
    public final void run() {
        switch (this.f37328a) {
            case 0:
                org.telegram.ui.ActionBar.f6.J(this.f37329b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f37329b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.C1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                ve.e.s(this.f37329b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                ve.e.s(this.f37329b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                ve.e.s(this.f37329b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                ve.e.s(this.f37329b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                ve.e.s(this.f37329b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                ve.e.s(this.f37329b, "https://promote.telegram.org/guidelines");
                return;
            default:
                ve.e.s(this.f37329b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
