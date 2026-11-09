package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
public final class sq0 extends rl0 {
    public final zs0 I;

    public sq0(zs0 zs0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, long j3, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, f2Var, i7, j3, g6Var);
        this.I = zs0Var;
    }

    @Override
    public final void b(boolean z9) {
        vq0 vq0Var = this.I.K0;
        vq0Var.setAlpha(1.0f - this.E);
        vq0Var.setPivotX(vq0Var.getWidth() / 2.0f);
        vq0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        vq0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        vq0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ch.o0 o0Var) {
        boolean z9;
        gr0 gr0Var;
        boolean z10;
        zs0 zs0Var = this.I;
        org.telegram.ui.ActionBar.r0 r0Var = zs0Var.f41103p0;
        if (r0Var == null) {
            return false;
        }
        zs0Var.Y0 = o0Var;
        String obj = r0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && zs0Var.Y0 == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        zs0Var.W0 = z9;
        zs0Var.B1(false);
        int i7 = zs0Var.m0[0].E;
        if (i7 == 11) {
            ls0 ls0Var = zs0Var.U;
            if (ls0Var != null) {
                ls0Var.E(zs0Var.Y0, obj);
            }
            org.telegram.messenger.g0.v1(r0Var.getSearchField());
            return true;
        }
        if (i7 == 12 && (gr0Var = zs0Var.V) != null) {
            org.telegram.ui.dn dnVar = gr0Var.f45471a;
            org.telegram.ui.ck ckVar = dnVar.C1;
            if (ckVar != null) {
                ckVar.e(o0Var, true);
            }
            if (TextUtils.isEmpty(dnVar.H3) && dnVar.E3 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            dnVar.G3 = z10;
            dnVar.f44584q0 = z10;
            dnVar.Oc(false);
            dnVar.pd();
        }
        return true;
    }

    @Override
    public final void h(boolean z9) {
        boolean z10;
        int i7;
        int i10;
        super.h(z9);
        zs0 zs0Var = this.I;
        sq0 sq0Var = zs0Var.L0;
        if (zs0Var.X0 && ((zs0Var.getSelectedTab() == 11 || zs0Var.getSelectedTab() == 12) && sq0Var.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(z10);
        org.telegram.ui.ActionBar.r0 r0Var = zs0Var.f41100o0;
        if (r0Var != null) {
            if (a() && zs0Var.f41127x1.getUserConfig().q()) {
                i10 = 2131232443;
            } else {
                i10 = 2131232486;
            }
            dh0 dh0Var = r0Var.f28456y;
            if (dh0Var != null && r0Var.D != i10) {
                if (z9) {
                    r0Var.D = i10;
                    org.telegram.messenger.g0.R3(dh0Var, i10);
                } else {
                    r0Var.D = i10;
                    dh0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = zs0Var.f41103p0;
        if (r0Var2 != null) {
            if (sq0Var != null && sq0Var.a() && zs0Var.getSelectedTab() == 11) {
                i7 = 2131745868;
            } else {
                i7 = 2131745836;
            }
            r0Var2.setSearchFieldHint(org.telegram.messenger.id.M0(i7, null));
        }
    }
}
