package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cp0 implements Runnable {
    public final int f32792a = 0;
    public final ws0 f32793b;
    public final org.telegram.ui.ActionBar.e6 f32794c;
    public final org.telegram.messenger.zi d;
    public final int f32795e;

    public cp0(ws0 ws0Var, org.telegram.ui.ActionBar.e6 e6Var, int i3, org.telegram.messenger.zi ziVar) {
        this.f32793b = ws0Var;
        this.f32794c = e6Var;
        this.f32795e = i3;
        this.d = ziVar;
    }

    @Override
    public final void run() {
        switch (this.f32792a) {
            case 0:
                org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, this.f32793b.getContext(), this.f32794c)};
                int i3 = this.f32795e;
                int w02 = org.telegram.messenger.yy.C(i3).w0(this.d, null, new qr(s1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.i3(new mp0(s1VarArr, i3, w02, 0), 500L);
                    return;
                }
                return;
            default:
                ws0 ws0Var = this.f32793b;
                Context context = ws0Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.f32794c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S0 = false;
                org.telegram.messenger.zi ziVar = this.d;
                if (ziVar.d4()) {
                    s1Var.S = org.telegram.messenger.bd.M0(2131744834, null);
                    s1Var.U = org.telegram.messenger.bd.M0(2131744835, null);
                } else {
                    s1Var.S = org.telegram.messenger.bd.M0(2131744839, null);
                    s1Var.U = org.telegram.messenger.bd.M0(2131744840, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744851, null), new cg.e0(ws0Var, e6Var, ziVar, this.f32795e, 5));
                k2.p1.v(null, 2131752589, alertDialog$Builder, null);
                return;
        }
    }

    public cp0(ws0 ws0Var, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.zi ziVar, int i3) {
        this.f32793b = ws0Var;
        this.f32794c = e6Var;
        this.d = ziVar;
        this.f32795e = i3;
    }
}
