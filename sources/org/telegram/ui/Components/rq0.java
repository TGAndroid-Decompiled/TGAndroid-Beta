package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
public final class rq0 extends ql0 {
    public final ys0 I;

    public rq0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, f2Var, i7, j3, h6Var);
        this.I = ys0Var;
    }

    @Override
    public final void b(boolean z9) {
        uq0 uq0Var = this.I.K0;
        uq0Var.setAlpha(1.0f - this.E);
        uq0Var.setPivotX(uq0Var.getWidth() / 2.0f);
        uq0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        uq0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        uq0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ch.o0 o0Var) {
        boolean z9;
        fr0 fr0Var;
        boolean z10;
        ys0 ys0Var = this.I;
        org.telegram.ui.ActionBar.r0 r0Var = ys0Var.f40695p0;
        if (r0Var == null) {
            return false;
        }
        ys0Var.Y0 = o0Var;
        String obj = r0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && ys0Var.Y0 == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        ys0Var.W0 = z9;
        ys0Var.B1(false);
        int i7 = ys0Var.m0[0].E;
        if (i7 == 11) {
            ks0 ks0Var = ys0Var.U;
            if (ks0Var != null) {
                ks0Var.E(ys0Var.Y0, obj);
            }
            org.telegram.messenger.g0.v1(r0Var.getSearchField());
            return true;
        }
        if (i7 == 12 && (fr0Var = ys0Var.V) != null) {
            org.telegram.ui.dn dnVar = fr0Var.f45407a;
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
            dnVar.f44625q0 = z10;
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
        ys0 ys0Var = this.I;
        rq0 rq0Var = ys0Var.L0;
        if (ys0Var.X0 && ((ys0Var.getSelectedTab() == 11 || ys0Var.getSelectedTab() == 12) && rq0Var.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(z10);
        org.telegram.ui.ActionBar.r0 r0Var = ys0Var.f40692o0;
        if (r0Var != null) {
            if (a() && ys0Var.f40719x1.getUserConfig().q()) {
                i10 = 2131232443;
            } else {
                i10 = 2131232486;
            }
            ch0 ch0Var = r0Var.f28461y;
            if (ch0Var != null && r0Var.D != i10) {
                if (z9) {
                    r0Var.D = i10;
                    org.telegram.messenger.g0.R3(ch0Var, i10);
                } else {
                    r0Var.D = i10;
                    ch0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = ys0Var.f40695p0;
        if (r0Var2 != null) {
            if (rq0Var != null && rq0Var.a() && ys0Var.getSelectedTab() == 11) {
                i7 = 2131745868;
            } else {
                i7 = 2131745836;
            }
            r0Var2.setSearchFieldHint(org.telegram.messenger.id.M0(i7, null));
        }
    }
}
