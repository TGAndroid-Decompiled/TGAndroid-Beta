package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bp0 implements Runnable {
    public final int f32358a = 0;
    public final zs0 f32359b;
    public final org.telegram.ui.ActionBar.g6 f32360c;
    public final org.telegram.messenger.ij d;
    public final int f32361e;

    public bp0(zs0 zs0Var, org.telegram.ui.ActionBar.g6 g6Var, int i7, org.telegram.messenger.ij ijVar) {
        this.f32359b = zs0Var;
        this.f32360c = g6Var;
        this.f32361e = i7;
        this.d = ijVar;
    }

    @Override
    public final void run() {
        switch (this.f32358a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, this.f32359b.getContext(), this.f32360c)};
                int i7 = this.f32361e;
                int w02 = org.telegram.messenger.gz.C(i7).w0(this.d, null, new qr(u1VarArr, 1));
                if (w02 != 0) {
                    org.telegram.messenger.g0.i3(new mp0(u1VarArr, i7, w02, 0), 500L);
                    return;
                }
                return;
            default:
                zs0 zs0Var = this.f32359b;
                Context context = zs0Var.getContext();
                org.telegram.ui.ActionBar.g6 g6Var = this.f32360c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.P0 = false;
                org.telegram.messenger.ij ijVar = this.d;
                if (ijVar.c4()) {
                    u1Var.R = org.telegram.messenger.id.M0(2131744824, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131744825, null);
                } else {
                    u1Var.R = org.telegram.messenger.id.M0(2131744829, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131744830, null);
                }
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744841, null), new bg.f0(zs0Var, g6Var, ijVar, this.f32361e, 5));
                jg.g.w(null, 2131752589, alertDialog$Builder, null);
                return;
        }
    }

    public bp0(zs0 zs0Var, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.messenger.ij ijVar, int i7) {
        this.f32359b = zs0Var;
        this.f32360c = g6Var;
        this.d = ijVar;
        this.f32361e = i7;
    }
}
