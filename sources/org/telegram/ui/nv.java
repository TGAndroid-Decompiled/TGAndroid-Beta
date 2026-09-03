package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nv implements Runnable {
    public final int f36590a;
    public final Context f36591b;

    public nv(Context context, int i10) {
        this.f36590a = i10;
        this.f36591b = context;
    }

    @Override
    public final void run() {
        switch (this.f36590a) {
            case 0:
                org.telegram.ui.ActionBar.j6.J(this.f36591b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f36591b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.D1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                ze.d.s(this.f36591b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                ze.d.s(this.f36591b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                ze.d.s(this.f36591b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                ze.d.s(this.f36591b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                ze.d.s(this.f36591b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                ze.d.s(this.f36591b, "https://promote.telegram.org/guidelines");
                return;
            default:
                ze.d.s(this.f36591b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
