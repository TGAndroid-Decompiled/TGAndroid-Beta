package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ap0 implements Runnable {
    public final int f31878a = 0;
    public final xs0 f31879b;
    public final org.telegram.ui.ActionBar.f6 f31880c;
    public final org.telegram.messenger.ij d;
    public final int f31881e;

    public ap0(xs0 xs0Var, org.telegram.ui.ActionBar.f6 f6Var, int i7, org.telegram.messenger.ij ijVar) {
        this.f31879b = xs0Var;
        this.f31880c = f6Var;
        this.f31881e = i7;
        this.d = ijVar;
    }

    @Override
    public final void run() {
        switch (this.f31878a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, this.f31879b.getContext(), this.f31880c)};
                int i7 = this.f31881e;
                int w02 = org.telegram.messenger.gz.C(i7).w0(this.d, null, new qr(u1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.i3(new lp0(u1VarArr, i7, w02, 0), 500L);
                    return;
                }
                return;
            default:
                xs0 xs0Var = this.f31879b;
                Context context = xs0Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.f31880c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.P0 = false;
                org.telegram.messenger.ij ijVar = this.d;
                if (ijVar.d4()) {
                    u1Var.R = org.telegram.messenger.hd.M0(2131744825, null);
                    u1Var.T = org.telegram.messenger.hd.M0(2131744826, null);
                } else {
                    u1Var.R = org.telegram.messenger.hd.M0(2131744830, null);
                    u1Var.T = org.telegram.messenger.hd.M0(2131744831, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744842, null), new bg.f0(xs0Var, f6Var, ijVar, this.f31881e, 5));
                jg.g.w(null, 2131752589, alertDialog$Builder, null);
                return;
        }
    }

    public ap0(xs0 xs0Var, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.messenger.ij ijVar, int i7) {
        this.f31879b = xs0Var;
        this.f31880c = f6Var;
        this.d = ijVar;
        this.f31881e = i7;
    }
}
