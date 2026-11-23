package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class e20 implements Runnable {
    public final int f34654a;
    public final Context f34655b;

    public e20(Context context, int i7) {
        this.f34654a = i7;
        this.f34655b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f34654a;
        Context context = this.f34655b;
        switch (i7) {
            case 0:
                c20.k(context);
                return;
            case 1:
                vf.c.t(context, org.telegram.messenger.hd.N0(2131744725, null));
                return;
            case 2:
                Activity W = org.telegram.messenger.g0.W(context);
                if (W instanceof LaunchActivity) {
                    ((LaunchActivity) W).t0(new PremiumPreviewFragment(0, ug.k0.v1(10)));
                    return;
                }
                return;
            default:
                Activity W2 = org.telegram.messenger.g0.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, ug.k0.v1(9)));
                    return;
                }
                return;
        }
    }
}
