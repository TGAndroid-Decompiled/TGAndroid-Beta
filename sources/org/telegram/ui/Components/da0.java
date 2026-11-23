package org.telegram.ui.Components;

import android.content.Context;
public final class da0 implements Runnable {
    public final int f34253a;
    public final na0 f34254b;
    public final Context f34255c;

    public da0(na0 na0Var, Context context, int i7) {
        this.f34253a = i7;
        this.f34254b = na0Var;
        this.f34255c = context;
    }

    @Override
    public final void run() {
        switch (this.f34253a) {
            case 0:
                na0 na0Var = this.f34254b;
                na0Var.f37742d0.a(false);
                org.telegram.messenger.g0.g3(new da0(na0Var, this.f34255c, 1));
                return;
            default:
                Context context = this.f34255c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.y0(43, context, this.f34254b.f37742d0.G).show();
                    return;
                }
                return;
        }
    }
}
