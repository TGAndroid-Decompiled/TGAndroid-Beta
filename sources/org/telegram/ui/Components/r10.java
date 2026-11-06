package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class r10 implements Runnable {
    public final int f37478a;
    public final Context f37479b;

    public r10(Context context, int i7) {
        this.f37478a = i7;
        this.f37479b = context;
    }

    @Override
    public final void run() {
        int i7 = this.f37478a;
        Context context = this.f37479b;
        switch (i7) {
            case 0:
                p10.k(context);
                return;
            case 1:
                vf.c.t(context, org.telegram.messenger.hd.M0(2131744967, null));
                return;
            case 2:
                Activity W = org.telegram.messenger.g0.W(context);
                if (W instanceof LaunchActivity) {
                    ((LaunchActivity) W).t0(new PremiumPreviewFragment(0, ug.i0.u1(10)));
                    return;
                }
                return;
            default:
                Activity W2 = org.telegram.messenger.g0.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, ug.i0.u1(9)));
                    return;
                }
                return;
        }
    }
}
