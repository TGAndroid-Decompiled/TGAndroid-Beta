package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
public final class cr0 extends em0 {
    public final jt0 J;

    public cr0(jt0 jt0Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, g2Var, i7, j3, h6Var);
        this.J = jt0Var;
    }

    @Override
    public final void b(boolean z10) {
        fr0 fr0Var = this.J.L0;
        fr0Var.setAlpha(1.0f - this.F);
        fr0Var.setPivotX(fr0Var.getWidth() / 2.0f);
        fr0Var.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        fr0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        fr0Var.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ch.p0 p0Var) {
        boolean z10;
        qr0 qr0Var;
        boolean z11;
        jt0 jt0Var = this.J;
        org.telegram.ui.ActionBar.q0 q0Var = jt0Var.f36613q0;
        if (q0Var == null) {
            return false;
        }
        jt0Var.Z0 = p0Var;
        String obj = q0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && jt0Var.Z0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        jt0Var.X0 = z10;
        jt0Var.B1(false);
        int i7 = jt0Var.f36605n0[0].F;
        if (i7 == 11) {
            vs0 vs0Var = jt0Var.V;
            if (vs0Var != null) {
                vs0Var.E(jt0Var.Z0, obj);
            }
            org.telegram.messenger.g0.v1(q0Var.getSearchField());
            return true;
        }
        if (i7 == 12 && (qr0Var = jt0Var.W) != null) {
            org.telegram.ui.cn cnVar = qr0Var.f46973a;
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
            cnVar.f46126r0 = z11;
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
        jt0 jt0Var = this.J;
        cr0 cr0Var = jt0Var.M0;
        if (jt0Var.Y0 && ((jt0Var.getSelectedTab() == 11 || jt0Var.getSelectedTab() == 12) && cr0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.q0 q0Var = jt0Var.f36610p0;
        if (q0Var != null) {
            if (a() && jt0Var.f36638y1.getUserConfig().q()) {
                i10 = 2131232445;
            } else {
                i10 = 2131232488;
            }
            rh0 rh0Var = q0Var.f29899y;
            if (rh0Var != null && q0Var.E != i10) {
                if (z10) {
                    q0Var.E = i10;
                    org.telegram.messenger.g0.P3(rh0Var, i10);
                } else {
                    q0Var.E = i10;
                    rh0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = jt0Var.f36613q0;
        if (q0Var2 != null) {
            if (cr0Var != null && cr0Var.a() && jt0Var.getSelectedTab() == 11) {
                i7 = 2131745672;
            } else {
                i7 = 2131745640;
            }
            q0Var2.setSearchFieldHint(org.telegram.messenger.hd.N0(i7, null));
        }
    }
}
