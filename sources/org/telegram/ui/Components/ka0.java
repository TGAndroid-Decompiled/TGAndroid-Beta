package org.telegram.ui.Components;

import android.content.Context;
public final class ka0 implements Runnable {
    public final int f27702a;
    public final ua0 f27703b;
    public final Context f27704c;

    public ka0(ua0 ua0Var, Context context, int i10) {
        this.f27702a = i10;
        this.f27703b = ua0Var;
        this.f27704c = context;
    }

    @Override
    public final void run() {
        switch (this.f27702a) {
            case 0:
                ua0 ua0Var = this.f27703b;
                ua0Var.f30881c0.a(false);
                org.telegram.messenger.i0.g3(new ka0(ua0Var, this.f27704c, 1));
                return;
            default:
                Context context = this.f27704c;
                if (org.telegram.messenger.i0.E1(context)) {
                    new kg.i1(43, context, this.f27703b.f30881c0.F).show();
                    return;
                }
                return;
        }
    }
}
