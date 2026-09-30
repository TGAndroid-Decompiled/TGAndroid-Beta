package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kv implements Runnable {
    public final int f35266a;
    public final Context f35267b;

    public kv(Context context, int i10) {
        this.f35266a = i10;
        this.f35267b = context;
    }

    @Override
    public final void run() {
        switch (this.f35266a) {
            case 0:
                org.telegram.ui.ActionBar.h6.J(this.f35267b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f35267b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                nf.f.s(this.f35267b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                nf.f.s(this.f35267b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                nf.f.s(this.f35267b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                nf.f.s(this.f35267b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                nf.f.s(this.f35267b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                nf.f.s(this.f35267b, "https://promote.telegram.org/guidelines");
                return;
            default:
                nf.f.s(this.f35267b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
