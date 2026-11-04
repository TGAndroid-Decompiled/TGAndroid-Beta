package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class n10 implements Runnable {
    public final int f36327a;
    public final Context f36328b;

    public n10(Context context, int i3) {
        this.f36327a = i3;
        this.f36328b = context;
    }

    @Override
    public final void run() {
        int i3 = this.f36327a;
        Context context = this.f36328b;
        switch (i3) {
            case 0:
                l10.j(context);
                return;
            case 1:
                sf.c.t(context, org.telegram.messenger.bd.M0(2131744976, null));
                return;
            case 2:
                Activity W = org.telegram.messenger.g0.W(context);
                if (W instanceof LaunchActivity) {
                    ((LaunchActivity) W).t0(new PremiumPreviewFragment(0, vg.i0.u1(10)));
                    return;
                }
                return;
            default:
                Activity W2 = org.telegram.messenger.g0.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, vg.i0.u1(9)));
                    return;
                }
                return;
        }
    }
}
