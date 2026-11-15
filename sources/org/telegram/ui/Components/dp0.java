package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dp0 implements Runnable {
    public final int f34025a = 0;
    public final ys0 f34026b;
    public final org.telegram.ui.ActionBar.e6 f34027c;
    public final org.telegram.messenger.gj d;
    public final int f34028e;

    public dp0(ys0 ys0Var, org.telegram.ui.ActionBar.e6 e6Var, int i7, org.telegram.messenger.gj gjVar) {
        this.f34026b = ys0Var;
        this.f34027c = e6Var;
        this.f34028e = i7;
        this.d = gjVar;
    }

    @Override
    public final void run() {
        switch (this.f34025a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, this.f34026b.getContext(), this.f34027c)};
                int i7 = this.f34028e;
                int w02 = org.telegram.messenger.ez.C(i7).w0(this.d, null, new wr(t1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.i3(new op0(t1VarArr, i7, w02, 0), 500L);
                    return;
                }
                return;
            default:
                ys0 ys0Var = this.f34026b;
                Context context = ys0Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.f34027c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.Q0 = false;
                org.telegram.messenger.gj gjVar = this.d;
                if (gjVar.c4()) {
                    t1Var.S = org.telegram.messenger.hd.M0(2131744824, null);
                    t1Var.U = org.telegram.messenger.hd.M0(2131744825, null);
                } else {
                    t1Var.S = org.telegram.messenger.hd.M0(2131744829, null);
                    t1Var.U = org.telegram.messenger.hd.M0(2131744830, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744841, null), new bg.f0(ys0Var, e6Var, gjVar, this.f34028e, 5));
                i5.c.x(null, 2131752589, alertDialog$Builder, null);
                return;
        }
    }

    public dp0(ys0 ys0Var, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.gj gjVar, int i7) {
        this.f34026b = ys0Var;
        this.f34027c = e6Var;
        this.d = gjVar;
        this.f34028e = i7;
    }
}
