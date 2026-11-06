package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class bu implements Runnable {
    public final int f44487a;
    public final Context f44488b;

    public bu(Context context, int i7) {
        this.f44487a = i7;
        this.f44488b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f44487a;
        Context context = this.f44488b;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.k6.K(context, false);
                return;
            case 1:
                Activity W = org.telegram.messenger.g0.W(context);
                if (W == null) {
                    W = LaunchActivity.G1;
                }
                if (W != null && !W.isFinishing()) {
                    W.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                vf.c.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                vf.c.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                vf.c.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                vf.c.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                vf.c.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                vf.c.t(context, "https://promote.telegram.org/guidelines");
                return;
            default:
                vf.c.t(context, org.telegram.messenger.hd.M0(2131742944, null));
                return;
        }
    }
}
