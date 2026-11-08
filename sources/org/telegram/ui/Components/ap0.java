package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ap0 implements Runnable {
    public final int f31883a = 0;
    public final xs0 f31884b;
    public final org.telegram.ui.ActionBar.f6 f31885c;
    public final org.telegram.messenger.ij d;
    public final int f31886e;

    public ap0(xs0 xs0Var, org.telegram.ui.ActionBar.f6 f6Var, int i7, org.telegram.messenger.ij ijVar) {
        this.f31884b = xs0Var;
        this.f31885c = f6Var;
        this.f31886e = i7;
        this.d = ijVar;
    }

    @Override
    public final void run() {
        switch (this.f31883a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, this.f31884b.getContext(), this.f31885c)};
                int i7 = this.f31886e;
                int w02 = org.telegram.messenger.gz.C(i7).w0(this.d, null, new qr(u1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.i3(new lp0(u1VarArr, i7, w02, 0), 500L);
                    return;
                }
                return;
            default:
                xs0 xs0Var = this.f31884b;
                Context context = xs0Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.f31885c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.P0 = false;
                org.telegram.messenger.ij ijVar = this.d;
                if (ijVar.d4()) {
                    u1Var.R = org.telegram.messenger.id.M0(2131744827, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131744828, null);
                } else {
                    u1Var.R = org.telegram.messenger.id.M0(2131744832, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131744833, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744844, null), new bg.f0(xs0Var, f6Var, ijVar, this.f31886e, 5));
                jg.g.w(null, 2131752589, alertDialog$Builder, null);
                return;
        }
    }

    public ap0(xs0 xs0Var, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.messenger.ij ijVar, int i7) {
        this.f31884b = xs0Var;
        this.f31885c = f6Var;
        this.d = ijVar;
        this.f31886e = i7;
    }
}
