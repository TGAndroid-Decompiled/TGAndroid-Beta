package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ov implements Runnable {
    public final int f39286a;
    public final Context f39287b;

    public ov(Context context, int i10) {
        this.f39286a = i10;
        this.f39287b = context;
    }

    @Override
    public final void run() {
        switch (this.f39286a) {
            case 0:
                org.telegram.ui.ActionBar.i6.J(this.f39287b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f39287b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                nf.f.s(this.f39287b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                nf.f.s(this.f39287b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                nf.f.s(this.f39287b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                nf.f.s(this.f39287b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                nf.f.s(this.f39287b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                nf.f.s(this.f39287b, "https://promote.telegram.org/guidelines");
                return;
            default:
                nf.f.s(this.f39287b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
