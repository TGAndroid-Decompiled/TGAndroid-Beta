package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
public final class qq0 extends tl0 {
    public final ws0 J;

    public qq0(ws0 ws0Var, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, d2Var, i3, j10, e6Var);
        this.J = ws0Var;
    }

    @Override
    public final void b(boolean z10) {
        tq0 tq0Var = this.J.L0;
        tq0Var.setAlpha(1.0f - this.F);
        tq0Var.setPivotX(tq0Var.getWidth() / 2.0f);
        tq0Var.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        tq0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        tq0Var.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(dh.n0 n0Var) {
        boolean z10;
        er0 er0Var;
        boolean z11;
        ws0 ws0Var = this.J;
        org.telegram.ui.ActionBar.q0 q0Var = ws0Var.f40117q0;
        if (q0Var == null) {
            return false;
        }
        ws0Var.Z0 = n0Var;
        String obj = q0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && ws0Var.Z0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ws0Var.X0 = z10;
        ws0Var.z1(false);
        int i3 = ws0Var.f40108n0[0].F;
        if (i3 == 11) {
            is0 is0Var = ws0Var.V;
            if (is0Var != null) {
                is0Var.E(ws0Var.Z0, obj);
            }
            org.telegram.messenger.g0.v1(q0Var.getSearchField());
            return true;
        }
        if (i3 == 12 && (er0Var = ws0Var.W) != null) {
            org.telegram.ui.xm xmVar = er0Var.f52363a;
            org.telegram.ui.wj wjVar = xmVar.D1;
            if (wjVar != null) {
                wjVar.e(n0Var, true);
            }
            if (TextUtils.isEmpty(xmVar.I3) && xmVar.F3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            xmVar.H3 = z11;
            xmVar.f51459r0 = z11;
            xmVar.Lc(false);
            xmVar.md();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i3;
        int i10;
        super.h(z10);
        ws0 ws0Var = this.J;
        qq0 qq0Var = ws0Var.M0;
        if (ws0Var.Y0 && ((ws0Var.getSelectedTab() == 11 || ws0Var.getSelectedTab() == 12) && qq0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.q0 q0Var = ws0Var.f40114p0;
        if (q0Var != null) {
            if (a() && ws0Var.f40142y1.getUserConfig().q()) {
                i10 = 2131232443;
            } else {
                i10 = 2131232486;
            }
            fh0 fh0Var = q0Var.f28471y;
            if (fh0Var != null && q0Var.E != i10) {
                if (z10) {
                    q0Var.E = i10;
                    org.telegram.messenger.g0.R3(fh0Var, i10);
                } else {
                    q0Var.E = i10;
                    fh0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = ws0Var.f40117q0;
        if (q0Var2 != null) {
            if (qq0Var != null && qq0Var.a() && ws0Var.getSelectedTab() == 11) {
                i3 = 2131745878;
            } else {
                i3 = 2131745846;
            }
            q0Var2.setSearchFieldHint(org.telegram.messenger.bd.M0(i3, null));
        }
    }
}
