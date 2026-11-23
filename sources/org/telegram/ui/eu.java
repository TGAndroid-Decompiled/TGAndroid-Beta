package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class eu implements Runnable {
    public final int f47624a;
    public final Context f47625b;

    public eu(Context context, int i7) {
        this.f47624a = i7;
        this.f47625b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f47624a;
        Context context = this.f47625b;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.n6.K(context, false);
                return;
            case 1:
                Activity W = org.telegram.messenger.g0.W(context);
                if (W == null) {
                    W = LaunchActivity.H1;
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
                vf.c.t(context, org.telegram.messenger.gd.N0(2131742672, null));
                return;
        }
    }
}
