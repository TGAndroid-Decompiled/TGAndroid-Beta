package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class i20 implements Runnable {
    public final int f26868a;
    public final Context f26869b;

    public i20(Context context, int i10) {
        this.f26868a = i10;
        this.f26869b = context;
    }

    @Override
    public final void run() {
        int i10 = this.f26868a;
        Context context = this.f26869b;
        switch (i10) {
            case 0:
                g20.j(context);
                return;
            case 1:
                gf.f.r(context, org.telegram.messenger.cd.L0(2131744984, null));
                return;
            case 2:
                Activity W = org.telegram.messenger.i0.W(context);
                if (W instanceof LaunchActivity) {
                    ((LaunchActivity) W).t0(new PremiumPreviewFragment(0, kg.q0.u1(10)));
                    return;
                }
                return;
            default:
                Activity W2 = org.telegram.messenger.i0.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, kg.q0.u1(9)));
                    return;
                }
                return;
        }
    }
}
