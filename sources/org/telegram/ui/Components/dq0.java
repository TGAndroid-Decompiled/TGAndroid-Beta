package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dq0 implements Runnable {
    public final int f25573a = 0;
    public final au0 f25574b;
    public final org.telegram.ui.ActionBar.p6 f25575c;
    public final org.telegram.messenger.kj d;
    public final int e;

    public dq0(au0 au0Var, org.telegram.ui.ActionBar.p6 p6Var, int i10, org.telegram.messenger.kj kjVar) {
        this.f25574b = au0Var;
        this.f25575c = p6Var;
        this.e = i10;
        this.d = kjVar;
    }

    @Override
    public final void run() {
        switch (this.f25573a) {
            case 0:
                org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, this.f25574b.getContext(), this.f25575c)};
                int i10 = this.e;
                int w02 = org.telegram.messenger.rz.C(i10).w0(this.d, null, new as(x1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.i0.h3(new oq0(x1VarArr, i10, w02, 0), 500L);
                    return;
                }
                return;
            default:
                au0 au0Var = this.f25574b;
                Context context = au0Var.getContext();
                org.telegram.ui.ActionBar.p6 p6Var = this.f25575c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R0 = false;
                org.telegram.messenger.kj kjVar = this.d;
                if (kjVar.c4()) {
                    x1Var.R = org.telegram.messenger.dd.L0(2131744842, null);
                    x1Var.T = org.telegram.messenger.dd.L0(2131744843, null);
                } else {
                    x1Var.R = org.telegram.messenger.dd.L0(2131744847, null);
                    x1Var.T = org.telegram.messenger.dd.L0(2131744848, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131744859, null), new mg.i0(au0Var, p6Var, kjVar, this.e, 5));
                i0.a.s(null, 2131752589, alertDialog$Builder, null);
                return;
        }
    }

    public dq0(au0 au0Var, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.messenger.kj kjVar, int i10) {
        this.f25574b = au0Var;
        this.f25575c = p6Var;
        this.d = kjVar;
        this.e = i10;
    }
}
