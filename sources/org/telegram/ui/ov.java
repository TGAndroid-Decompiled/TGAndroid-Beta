package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ov implements Runnable {
    public final int f36354a;
    public final Context f36355b;

    public ov(Context context, int i10) {
        this.f36354a = i10;
        this.f36355b = context;
    }

    @Override
    public final void run() {
        switch (this.f36354a) {
            case 0:
                org.telegram.ui.ActionBar.i6.J(this.f36355b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f36355b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                nf.f.s(this.f36355b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                nf.f.s(this.f36355b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                nf.f.s(this.f36355b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                nf.f.s(this.f36355b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                nf.f.s(this.f36355b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                nf.f.s(this.f36355b, "https://promote.telegram.org/guidelines");
                return;
            default:
                nf.f.s(this.f36355b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
