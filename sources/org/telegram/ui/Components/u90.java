package org.telegram.ui.Components;

import android.content.Context;
public final class u90 implements Runnable {
    public final int f39980a;
    public final ea0 f39981b;
    public final Context f39982c;

    public u90(ea0 ea0Var, Context context, int i7) {
        this.f39980a = i7;
        this.f39981b = ea0Var;
        this.f39982c = context;
    }

    @Override
    public final void run() {
        switch (this.f39980a) {
            case 0:
                ea0 ea0Var = this.f39981b;
                ea0Var.f34260d0.a(false);
                org.telegram.messenger.g0.h3(new u90(ea0Var, this.f39982c, 1));
                return;
            default:
                Context context = this.f39982c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.x0(43, context, this.f39981b.f34260d0.G).show();
                    return;
                }
                return;
        }
    }
}
