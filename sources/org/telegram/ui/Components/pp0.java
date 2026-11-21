package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pp0 implements Runnable {
    public final int f38650a = 0;
    public final jt0 f38651b;
    public final org.telegram.ui.ActionBar.h6 f38652c;
    public final org.telegram.messenger.fj d;
    public final int f38653e;

    public pp0(jt0 jt0Var, org.telegram.ui.ActionBar.h6 h6Var, int i7, org.telegram.messenger.fj fjVar) {
        this.f38651b = jt0Var;
        this.f38652c = h6Var;
        this.f38653e = i7;
        this.d = fjVar;
    }

    @Override
    public final void run() {
        switch (this.f38650a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, this.f38651b.getContext(), this.f38652c)};
                int i7 = this.f38653e;
                int w02 = org.telegram.messenger.zy.C(i7).w0(this.d, null, new fs(t1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.h3(new aq0(t1VarArr, i7, w02, 0), 500L);
                    return;
                }
                return;
            default:
                jt0 jt0Var = this.f38651b;
                Context context = jt0Var.getContext();
                org.telegram.ui.ActionBar.h6 h6Var = this.f38652c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                t1Var.Q0 = false;
                org.telegram.messenger.fj fjVar = this.d;
                if (fjVar.c4()) {
                    t1Var.S = org.telegram.messenger.gd.N0(2131744583, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131744584, null);
                } else {
                    t1Var.S = org.telegram.messenger.gd.N0(2131744588, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131744589, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131744600, null), new bg.g0(jt0Var, h6Var, fjVar, this.f38653e, 5));
                i5.c.y(null, 2131752577, alertDialog$Builder, null);
                return;
        }
    }

    public pp0(jt0 jt0Var, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.messenger.fj fjVar, int i7) {
        this.f38651b = jt0Var;
        this.f38652c = h6Var;
        this.d = fjVar;
        this.f38653e = i7;
    }
}
