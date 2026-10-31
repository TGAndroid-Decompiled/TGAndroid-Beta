package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ev implements Runnable {
    public final int f37115a;
    public final Context f37116b;

    public ev(Context context, int i10) {
        this.f37115a = i10;
        this.f37116b = context;
    }

    @Override
    public final void run() {
        int i10 = this.f37115a;
        Context context = this.f37116b;
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
                gf.f.r(context, org.telegram.messenger.cd.L0(2131742969, null));
                return;
        }
    }
}
