package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ov implements Runnable {
    public final int f39280a;
    public final Context f39281b;

    public ov(Context context, int i10) {
        this.f39280a = i10;
        this.f39281b = context;
    }

    @Override
    public final void run() {
        switch (this.f39280a) {
            case 0:
                org.telegram.ui.ActionBar.i6.J(this.f39281b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f39281b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                nf.f.s(this.f39281b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                nf.f.s(this.f39281b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                nf.f.s(this.f39281b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                nf.f.s(this.f39281b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                nf.f.s(this.f39281b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                nf.f.s(this.f39281b, "https://promote.telegram.org/guidelines");
                return;
            default:
                nf.f.s(this.f39281b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
