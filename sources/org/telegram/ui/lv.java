package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lv implements Runnable {
    public final int f36143a;
    public final Context f36144b;

    public lv(Context context, int i10) {
        this.f36143a = i10;
        this.f36144b = context;
    }

    @Override
    public final void run() {
        switch (this.f36143a) {
            case 0:
                org.telegram.ui.ActionBar.j6.J(this.f36144b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f36144b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.D1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                af.g.s(this.f36144b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                af.g.s(this.f36144b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                af.g.s(this.f36144b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                af.g.s(this.f36144b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                af.g.s(this.f36144b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                af.g.s(this.f36144b, "https://promote.telegram.org/guidelines");
                return;
            default:
                af.g.s(this.f36144b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
