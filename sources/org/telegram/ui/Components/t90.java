package org.telegram.ui.Components;

import android.content.Context;
public final class t90 implements Runnable {
    public final int f39616a;
    public final da0 f39617b;
    public final Context f39618c;

    public t90(da0 da0Var, Context context, int i7) {
        this.f39616a = i7;
        this.f39617b = da0Var;
        this.f39618c = context;
    }

    @Override
    public final void run() {
        switch (this.f39616a) {
            case 0:
                da0 da0Var = this.f39617b;
                da0Var.f33900d0.a(false);
                org.telegram.messenger.g0.h3(new t90(da0Var, this.f39618c, 1));
                return;
            default:
                Context context = this.f39618c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.x0(43, context, this.f39617b.f33900d0.G).show();
                    return;
                }
                return;
        }
    }
}
