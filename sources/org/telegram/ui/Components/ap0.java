package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ap0 implements Runnable {
    public final int f31874a = 0;
    public final xs0 f31875b;
    public final org.telegram.ui.ActionBar.f6 f31876c;
    public final org.telegram.messenger.ij d;
    public final int f31877e;

    public ap0(xs0 xs0Var, org.telegram.ui.ActionBar.f6 f6Var, int i7, org.telegram.messenger.ij ijVar) {
        this.f31875b = xs0Var;
        this.f31876c = f6Var;
        this.f31877e = i7;
        this.d = ijVar;
    }

    @Override
    public final void run() {
        switch (this.f31874a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, this.f31875b.getContext(), this.f31876c)};
                int i7 = this.f31877e;
                int w02 = org.telegram.messenger.gz.C(i7).w0(this.d, null, new qr(u1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.i3(new lp0(u1VarArr, i7, w02, 0), 500L);
                    return;
                }
                return;
            default:
                xs0 xs0Var = this.f31875b;
                Context context = xs0Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.f31876c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.P0 = false;
                org.telegram.messenger.ij ijVar = this.d;
                if (ijVar.d4()) {
                    u1Var.R = org.telegram.messenger.hd.M0(2131744825, null);
                    u1Var.T = org.telegram.messenger.hd.M0(2131744826, null);
                } else {
                    u1Var.R = org.telegram.messenger.hd.M0(2131744830, null);
                    u1Var.T = org.telegram.messenger.hd.M0(2131744831, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744842, null), new bg.f0(xs0Var, f6Var, ijVar, this.f31877e, 5));
                jg.g.w(null, 2131752589, alertDialog$Builder, null);
                return;
        }
    }

    public ap0(xs0 xs0Var, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.messenger.ij ijVar, int i7) {
        this.f31875b = xs0Var;
        this.f31876c = f6Var;
        this.d = ijVar;
        this.f31877e = i7;
    }
}
