package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
public final class qq0 extends ql0 {
    public final xs0 I;

    public qq0(xs0 xs0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f2Var, i7, j3, f6Var);
        this.I = xs0Var;
    }

    @Override
    public final void b(boolean z9) {
        tq0 tq0Var = this.I.K0;
        tq0Var.setAlpha(1.0f - this.E);
        tq0Var.setPivotX(tq0Var.getWidth() / 2.0f);
        tq0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        tq0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        tq0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ch.o0 o0Var) {
        boolean z9;
        er0 er0Var;
        boolean z10;
        xs0 xs0Var = this.I;
        org.telegram.ui.ActionBar.r0 r0Var = xs0Var.f40416p0;
        if (r0Var == null) {
            return false;
        }
        xs0Var.Y0 = o0Var;
        String obj = r0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && xs0Var.Y0 == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        xs0Var.W0 = z9;
        xs0Var.z1(false);
        int i7 = xs0Var.m0[0].E;
        if (i7 == 11) {
            js0 js0Var = xs0Var.U;
            if (js0Var != null) {
                js0Var.E(xs0Var.Y0, obj);
            }
            org.telegram.messenger.g0.v1(r0Var.getSearchField());
            return true;
        }
        if (i7 == 12 && (er0Var = xs0Var.V) != null) {
            org.telegram.ui.bn bnVar = er0Var.f44857a;
            org.telegram.ui.ak akVar = bnVar.C1;
            if (akVar != null) {
                akVar.e(o0Var, true);
            }
            if (TextUtils.isEmpty(bnVar.H3) && bnVar.E3 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            bnVar.G3 = z10;
            bnVar.f43921q0 = z10;
            bnVar.Lc(false);
            bnVar.md();
        }
        return true;
    }

    @Override
    public final void h(boolean z9) {
        boolean z10;
        int i7;
        int i10;
        super.h(z9);
        xs0 xs0Var = this.I;
        qq0 qq0Var = xs0Var.L0;
        if (xs0Var.X0 && ((xs0Var.getSelectedTab() == 11 || xs0Var.getSelectedTab() == 12) && qq0Var.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(z10);
        org.telegram.ui.ActionBar.r0 r0Var = xs0Var.f40413o0;
        if (r0Var != null) {
            if (a() && xs0Var.f40440x1.getUserConfig().q()) {
                i10 = 2131232443;
            } else {
                i10 = 2131232486;
            }
            ch0 ch0Var = r0Var.f28452y;
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
        org.telegram.ui.ActionBar.r0 r0Var2 = xs0Var.f40416p0;
        if (r0Var2 != null) {
            if (qq0Var != null && qq0Var.a() && xs0Var.getSelectedTab() == 11) {
                i7 = 2131745869;
            } else {
                i7 = 2131745837;
            }
            r0Var2.setSearchFieldHint(org.telegram.messenger.hd.M0(i7, null));
        }
    }
}
