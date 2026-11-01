package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class dv implements Runnable {
    public final int f36683a;
    public final Context f36684b;

    public dv(Context context, int i10) {
        this.f36683a = i10;
        this.f36684b = context;
    }

    @Override
    public final void run() {
        int i10 = this.f36683a;
        Context context = this.f36684b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.t6.K(context, false);
                return;
            case 1:
                Activity W = org.telegram.messenger.i0.W(context);
                if (W == null) {
                    W = LaunchActivity.I1;
                }
                if (W != null && !W.isFinishing()) {
                    W.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                gf.f.r(context, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                gf.f.r(context, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                gf.f.r(context, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                gf.f.r(context, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                gf.f.r(context, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                gf.f.r(context, "https://promote.telegram.org/guidelines");
                return;
            default:
                gf.f.r(context, org.telegram.messenger.dd.L0(2131742969, null));
                return;
        }
    }
}
