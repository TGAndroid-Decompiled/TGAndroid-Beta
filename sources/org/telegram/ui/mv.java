package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mv implements Runnable {
    public final int f40115a;
    public final Context f40116b;

    public mv(Context context, int i10) {
        this.f40115a = i10;
        this.f40116b = context;
    }

    @Override
    public final void run() {
        switch (this.f40115a) {
            case 0:
                org.telegram.ui.ActionBar.h6.J(this.f40116b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f40116b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                of.f.s(this.f40116b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                of.f.s(this.f40116b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                of.f.s(this.f40116b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                of.f.s(this.f40116b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                of.f.s(this.f40116b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                of.f.s(this.f40116b, "https://promote.telegram.org/guidelines");
                return;
            default:
                of.f.s(this.f40116b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
