package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class op0 implements Runnable {
    public final int f38239a = 0;
    public final it0 f38240b;
    public final org.telegram.ui.ActionBar.i6 f38241c;
    public final org.telegram.messenger.fj d;
    public final int f38242e;

    public op0(it0 it0Var, org.telegram.ui.ActionBar.i6 i6Var, int i7, org.telegram.messenger.fj fjVar) {
        this.f38240b = it0Var;
        this.f38241c = i6Var;
        this.f38242e = i7;
        this.d = fjVar;
    }

    @Override
    public final void run() {
        switch (this.f38239a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, this.f38240b.getContext(), this.f38241c)};
                int i7 = this.f38242e;
                int w02 = org.telegram.messenger.zy.C(i7).w0(this.d, null, new cs(t1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.h3(new zp0(t1VarArr, i7, w02, 0), 500L);
                    return;
                }
                return;
            default:
                it0 it0Var = this.f38240b;
                Context context = it0Var.getContext();
                org.telegram.ui.ActionBar.i6 i6Var = this.f38241c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.Q0 = false;
                org.telegram.messenger.fj fjVar = this.d;
                if (fjVar.c4()) {
                    t1Var.S = org.telegram.messenger.gd.N0(2131744583, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131744584, null);
                } else {
                    t1Var.S = org.telegram.messenger.gd.N0(2131744588, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131744589, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131744600, null), new bg.g0(it0Var, i6Var, fjVar, this.f38242e, 5));
                i5.c.y(null, 2131752577, alertDialog$Builder, null);
                return;
        }
    }

    public op0(it0 it0Var, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.messenger.fj fjVar, int i7) {
        this.f38240b = it0Var;
        this.f38241c = i6Var;
        this.d = fjVar;
        this.f38242e = i7;
    }
}
