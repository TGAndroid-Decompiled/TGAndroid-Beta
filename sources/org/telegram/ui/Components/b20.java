package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class b20 implements Runnable {
    public final int f33511a;
    public final Context f33512b;

    public b20(Context context, int i7) {
        this.f33511a = i7;
        this.f33512b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f33511a;
        Context context = this.f33512b;
        switch (i7) {
            case 0:
                z10.k(context);
                return;
            case 1:
                vf.c.t(context, org.telegram.messenger.gd.M0(2131744731, null));
                return;
            case 2:
                Activity W = org.telegram.messenger.g0.W(context);
                if (W instanceof LaunchActivity) {
                    ((LaunchActivity) W).t0(new PremiumPreviewFragment(0, ug.l0.v1(10)));
                    return;
                }
                return;
            default:
                Activity W2 = org.telegram.messenger.g0.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, ug.l0.v1(9)));
                    return;
                }
                return;
        }
    }
}
