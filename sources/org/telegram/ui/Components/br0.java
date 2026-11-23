package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
public final class br0 extends em0 {
    public final it0 J;

    public br0(it0 it0Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, g2Var, i7, j3, i6Var);
        this.J = it0Var;
    }

    @Override
    public final void b(boolean z10) {
        er0 er0Var = this.J.L0;
        er0Var.setAlpha(1.0f - this.F);
        er0Var.setPivotX(er0Var.getWidth() / 2.0f);
        er0Var.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        er0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        er0Var.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ch.p0 p0Var) {
        boolean z10;
        pr0 pr0Var;
        boolean z11;
        it0 it0Var = this.J;
        org.telegram.ui.ActionBar.q0 q0Var = it0Var.f36141q0;
        if (q0Var == null) {
            return false;
        }
        it0Var.Z0 = p0Var;
        String obj = q0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && it0Var.Z0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        it0Var.X0 = z10;
        it0Var.B1(false);
        int i7 = it0Var.f36133n0[0].F;
        if (i7 == 11) {
            us0 us0Var = it0Var.V;
            if (us0Var != null) {
                us0Var.E(it0Var.Z0, obj);
            }
            org.telegram.messenger.g0.v1(q0Var.getSearchField());
            return true;
        }
        if (i7 == 12 && (pr0Var = it0Var.W) != null) {
            org.telegram.ui.cn cnVar = pr0Var.f47191a;
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
            cnVar.f46341r0 = z11;
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
        it0 it0Var = this.J;
        br0 br0Var = it0Var.M0;
        if (it0Var.Y0 && ((it0Var.getSelectedTab() == 11 || it0Var.getSelectedTab() == 12) && br0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.q0 q0Var = it0Var.f36138p0;
        if (q0Var != null) {
            if (a() && it0Var.f36166y1.getUserConfig().q()) {
                i10 = 2131232448;
            } else {
                i10 = 2131232491;
            }
            qh0 qh0Var = q0Var.f29990y;
            if (qh0Var != null && q0Var.E != i10) {
                if (z10) {
                    q0Var.E = i10;
                    org.telegram.messenger.g0.P3(qh0Var, i10);
                } else {
                    q0Var.E = i10;
                    qh0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = it0Var.f36141q0;
        if (q0Var2 != null) {
            if (br0Var != null && br0Var.a() && it0Var.getSelectedTab() == 11) {
                i7 = 2131745672;
            } else {
                i7 = 2131745640;
            }
            q0Var2.setSearchFieldHint(org.telegram.messenger.gd.N0(i7, null));
        }
    }
}
