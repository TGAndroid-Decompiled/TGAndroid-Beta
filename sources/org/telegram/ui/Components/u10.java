package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class u10 implements Runnable {
    public final int f39868a;
    public final Context f39869b;

    public u10(Context context, int i7) {
        this.f39868a = i7;
        this.f39869b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f39868a;
        Context context = this.f39869b;
        switch (i7) {
            case 0:
                s10.k(context);
                return;
            case 1:
                vf.c.t(context, org.telegram.messenger.hd.M0(2131744966, null));
                return;
            case 2:
                Activity W = org.telegram.messenger.g0.W(context);
                if (W instanceof LaunchActivity) {
                    ((LaunchActivity) W).t0(new PremiumPreviewFragment(0, ug.j0.u1(10)));
                    return;
                }
                return;
            default:
                Activity W2 = org.telegram.messenger.g0.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, ug.j0.u1(9)));
                    return;
                }
                return;
        }
    }
}
