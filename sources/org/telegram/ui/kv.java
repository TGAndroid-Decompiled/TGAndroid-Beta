package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kv implements Runnable {
    public final int f35160a;
    public final Context f35161b;

    public kv(Context context, int i10) {
        this.f35160a = i10;
        this.f35161b = context;
    }

    @Override
    public final void run() {
        switch (this.f35160a) {
            case 0:
                org.telegram.ui.ActionBar.h6.J(this.f35161b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f35161b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                nf.f.s(this.f35161b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                nf.f.s(this.f35161b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                nf.f.s(this.f35161b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                nf.f.s(this.f35161b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                nf.f.s(this.f35161b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                nf.f.s(this.f35161b, "https://promote.telegram.org/guidelines");
                return;
            default:
                nf.f.s(this.f35161b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
