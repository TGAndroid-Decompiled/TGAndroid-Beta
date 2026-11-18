package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class np0 implements Runnable {
    public final int f37838a = 0;
    public final gt0 f37839b;
    public final org.telegram.ui.ActionBar.i6 f37840c;
    public final org.telegram.messenger.fj d;
    public final int f37841e;

    public np0(gt0 gt0Var, org.telegram.ui.ActionBar.i6 i6Var, int i7, org.telegram.messenger.fj fjVar) {
        this.f37839b = gt0Var;
        this.f37840c = i6Var;
        this.f37841e = i7;
        this.d = fjVar;
    }

    @Override
    public final void run() {
        switch (this.f37838a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, this.f37839b.getContext(), this.f37840c)};
                int i7 = this.f37841e;
                int w02 = org.telegram.messenger.zy.C(i7).w0(this.d, null, new ds(u1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.h3(new yp0(u1VarArr, i7, w02, 0), 500L);
                    return;
                }
                return;
            default:
                gt0 gt0Var = this.f37839b;
                Context context = gt0Var.getContext();
                org.telegram.ui.ActionBar.i6 i6Var = this.f37840c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.Q0 = false;
                org.telegram.messenger.fj fjVar = this.d;
                if (fjVar.c4()) {
                    u1Var.S = org.telegram.messenger.gd.M0(2131744589, null);
                    u1Var.U = org.telegram.messenger.gd.M0(2131744590, null);
                } else {
                    u1Var.S = org.telegram.messenger.gd.M0(2131744594, null);
                    u1Var.U = org.telegram.messenger.gd.M0(2131744595, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131744606, null), new bg.g0(gt0Var, i6Var, fjVar, this.f37841e, 5));
                i5.c.y(null, 2131752578, alertDialog$Builder, null);
                return;
        }
    }

    public np0(gt0 gt0Var, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.messenger.fj fjVar, int i7) {
        this.f37839b = gt0Var;
        this.f37840c = i6Var;
        this.d = fjVar;
        this.f37841e = i7;
    }
}
