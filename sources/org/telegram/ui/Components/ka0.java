package org.telegram.ui.Components;

import android.content.Context;
public final class ka0 implements Runnable {
    public final int f27795a;
    public final ua0 f27796b;
    public final Context f27797c;

    public ka0(ua0 ua0Var, Context context, int i10) {
        this.f27795a = i10;
        this.f27796b = ua0Var;
        this.f27797c = context;
    }

    @Override
    public final void run() {
        switch (this.f27795a) {
            case 0:
                ua0 ua0Var = this.f27796b;
                ua0Var.f30915c0.a(false);
                org.telegram.messenger.i0.g3(new ka0(ua0Var, this.f27797c, 1));
                return;
            default:
                Context context = this.f27797c;
                if (org.telegram.messenger.i0.E1(context)) {
                    new kg.i1(43, context, this.f27796b.f30915c0.F).show();
                    return;
                }
                return;
        }
    }
}
