package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pp0 implements Runnable {
    public final int f38649a = 0;
    public final jt0 f38650b;
    public final org.telegram.ui.ActionBar.h6 f38651c;
    public final org.telegram.messenger.gj d;
    public final int f38652e;

    public pp0(jt0 jt0Var, org.telegram.ui.ActionBar.h6 h6Var, int i7, org.telegram.messenger.gj gjVar) {
        this.f38650b = jt0Var;
        this.f38651c = h6Var;
        this.f38652e = i7;
        this.d = gjVar;
    }

    @Override
    public final void run() {
        switch (this.f38649a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, this.f38650b.getContext(), this.f38651c)};
                int i7 = this.f38652e;
                int w02 = org.telegram.messenger.az.C(i7).w0(this.d, null, new fs(t1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.h3(new aq0(t1VarArr, i7, w02, 0), 500L);
                    return;
                }
                return;
            default:
                jt0 jt0Var = this.f38650b;
                Context context = jt0Var.getContext();
                org.telegram.ui.ActionBar.h6 h6Var = this.f38651c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.Q0 = false;
                org.telegram.messenger.gj gjVar = this.d;
                if (gjVar.c4()) {
                    t1Var.S = org.telegram.messenger.hd.N0(2131744581, null);
                    t1Var.U = org.telegram.messenger.hd.N0(2131744582, null);
                } else {
                    t1Var.S = org.telegram.messenger.hd.N0(2131744586, null);
                    t1Var.U = org.telegram.messenger.hd.N0(2131744587, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131744598, null), new bg.g0(jt0Var, h6Var, gjVar, this.f38652e, 5));
                i5.c.y(null, 2131752577, alertDialog$Builder, null);
                return;
        }
    }

    public pp0(jt0 jt0Var, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.messenger.gj gjVar, int i7) {
        this.f38650b = jt0Var;
        this.f38651c = h6Var;
        this.d = gjVar;
        this.f38652e = i7;
    }
}
