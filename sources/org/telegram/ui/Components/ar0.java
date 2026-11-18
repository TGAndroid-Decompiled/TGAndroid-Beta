package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
public final class ar0 extends cm0 {
    public final gt0 J;

    public ar0(gt0 gt0Var, Context context, org.telegram.ui.ActionBar.h2 h2Var, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, h2Var, i7, j3, i6Var);
        this.J = gt0Var;
    }

    @Override
    public final void b(boolean z10) {
        dr0 dr0Var = this.J.L0;
        dr0Var.setAlpha(1.0f - this.F);
        dr0Var.setPivotX(dr0Var.getWidth() / 2.0f);
        dr0Var.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        dr0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        dr0Var.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ch.p0 p0Var) {
        boolean z10;
        or0 or0Var;
        boolean z11;
        gt0 gt0Var = this.J;
        org.telegram.ui.ActionBar.r0 r0Var = gt0Var.f35617q0;
        if (r0Var == null) {
            return false;
        }
        gt0Var.Z0 = p0Var;
        String obj = r0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && gt0Var.Z0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        gt0Var.X0 = z10;
        gt0Var.B1(false);
        int i7 = gt0Var.f35609n0[0].F;
        if (i7 == 11) {
            ss0 ss0Var = gt0Var.V;
            if (ss0Var != null) {
                ss0Var.E(gt0Var.Z0, obj);
            }
            org.telegram.messenger.g0.v1(r0Var.getSearchField());
            return true;
        }
        if (i7 == 12 && (or0Var = gt0Var.W) != null) {
            org.telegram.ui.cn cnVar = or0Var.f46944a;
            org.telegram.ui.bk bkVar = cnVar.D1;
            if (bkVar != null) {
                bkVar.e(p0Var, true);
            }
            if (TextUtils.isEmpty(cnVar.I3) && cnVar.F3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            cnVar.H3 = z11;
            cnVar.f46146r0 = z11;
            cnVar.Pc(false);
            cnVar.qd();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i7;
        int i10;
        super.h(z10);
        gt0 gt0Var = this.J;
        ar0 ar0Var = gt0Var.M0;
        if (gt0Var.Y0 && ((gt0Var.getSelectedTab() == 11 || gt0Var.getSelectedTab() == 12) && ar0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.r0 r0Var = gt0Var.f35614p0;
        if (r0Var != null) {
            if (a() && gt0Var.f35642y1.getUserConfig().q()) {
                i10 = 2131232445;
            } else {
                i10 = 2131232488;
            }
            ph0 ph0Var = r0Var.f29947y;
            if (ph0Var != null && r0Var.E != i10) {
                if (z10) {
                    r0Var.E = i10;
                    org.telegram.messenger.g0.P3(ph0Var, i10);
                } else {
                    r0Var.E = i10;
                    ph0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = gt0Var.f35617q0;
        if (r0Var2 != null) {
            if (ar0Var != null && ar0Var.a() && gt0Var.getSelectedTab() == 11) {
                i7 = 2131745673;
            } else {
                i7 = 2131745641;
            }
            r0Var2.setSearchFieldHint(org.telegram.messenger.gd.M0(i7, null));
        }
    }
}
