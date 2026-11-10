package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ap0 implements Runnable {
    public final int f31958a = 0;
    public final ys0 f31959b;
    public final org.telegram.ui.ActionBar.h6 f31960c;
    public final org.telegram.messenger.ij d;
    public final int f31961e;

    public ap0(ys0 ys0Var, org.telegram.ui.ActionBar.h6 h6Var, int i7, org.telegram.messenger.ij ijVar) {
        this.f31959b = ys0Var;
        this.f31960c = h6Var;
        this.f31961e = i7;
        this.d = ijVar;
    }

    @Override
    public final void run() {
        switch (this.f31958a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, this.f31959b.getContext(), this.f31960c)};
                int i7 = this.f31961e;
                int w02 = org.telegram.messenger.gz.C(i7).w0(this.d, null, new pr(u1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.i3(new lp0(u1VarArr, i7, w02, 0), 500L);
                    return;
                }
                return;
            default:
                ys0 ys0Var = this.f31959b;
                Context context = ys0Var.getContext();
                org.telegram.ui.ActionBar.h6 h6Var = this.f31960c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.P0 = false;
                org.telegram.messenger.ij ijVar = this.d;
                if (ijVar.c4()) {
                    u1Var.R = org.telegram.messenger.id.M0(2131744824, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131744825, null);
                } else {
                    u1Var.R = org.telegram.messenger.id.M0(2131744829, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131744830, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744841, null), new bg.f0(ys0Var, h6Var, ijVar, this.f31961e, 5));
                jg.g.w(null, 2131752589, alertDialog$Builder, null);
                return;
        }
    }

    public ap0(ys0 ys0Var, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.messenger.ij ijVar, int i7) {
        this.f31959b = ys0Var;
        this.f31960c = h6Var;
        this.d = ijVar;
        this.f31961e = i7;
    }
}
