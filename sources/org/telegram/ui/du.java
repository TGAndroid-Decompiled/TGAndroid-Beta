package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class du implements Runnable {
    public final int f46489a;
    public final Context f46490b;

    public du(Context context, int i7) {
        this.f46489a = i7;
        this.f46490b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f46489a;
        Context context = this.f46490b;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.j6.K(context, false);
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
                vf.c.t(context, org.telegram.messenger.hd.M0(2131742943, null));
                return;
        }
    }
}
