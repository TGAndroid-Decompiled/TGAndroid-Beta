package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
public final class sq0 extends ul0 {
    public final ys0 J;

    public sq0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.e2 e2Var, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e2Var, i7, j3, e6Var);
        this.J = ys0Var;
    }

    @Override
    public final void b(boolean z10) {
        vq0 vq0Var = this.J.L0;
        vq0Var.setAlpha(1.0f - this.F);
        vq0Var.setPivotX(vq0Var.getWidth() / 2.0f);
        vq0Var.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        vq0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        vq0Var.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ch.p0 p0Var) {
        boolean z10;
        gr0 gr0Var;
        boolean z11;
        ys0 ys0Var = this.J;
        org.telegram.ui.ActionBar.q0 q0Var = ys0Var.f42127q0;
        if (q0Var == null) {
            return false;
        }
        ys0Var.Z0 = p0Var;
        String obj = q0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && ys0Var.Z0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ys0Var.X0 = z10;
        ys0Var.B1(false);
        int i7 = ys0Var.f42119n0[0].F;
        if (i7 == 11) {
            ks0 ks0Var = ys0Var.V;
            if (ks0Var != null) {
                ks0Var.E(ys0Var.Z0, obj);
            }
            org.telegram.messenger.g0.v1(q0Var.getSearchField());
            return true;
        }
        if (i7 == 12 && (gr0Var = ys0Var.W) != null) {
            org.telegram.ui.bn bnVar = gr0Var.f46179a;
            org.telegram.ui.ak akVar = bnVar.D1;
            if (akVar != null) {
                akVar.e(p0Var, true);
            }
            if (TextUtils.isEmpty(bnVar.I3) && bnVar.F3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            bnVar.H3 = z11;
            bnVar.f45339r0 = z11;
            bnVar.Pc(false);
            bnVar.qd();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i7;
        int i10;
        super.h(z10);
        ys0 ys0Var = this.J;
        sq0 sq0Var = ys0Var.M0;
        if (ys0Var.Y0 && ((ys0Var.getSelectedTab() == 11 || ys0Var.getSelectedTab() == 12) && sq0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.q0 q0Var = ys0Var.f42124p0;
        if (q0Var != null) {
            if (a() && ys0Var.f42152y1.getUserConfig().q()) {
                i10 = 2131232444;
            } else {
                i10 = 2131232487;
            }
            fh0 fh0Var = q0Var.f29528y;
            if (fh0Var != null && q0Var.E != i10) {
                if (z10) {
                    q0Var.E = i10;
                    org.telegram.messenger.g0.Q3(fh0Var, i10);
                } else {
                    q0Var.E = i10;
                    fh0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = ys0Var.f42127q0;
        if (q0Var2 != null) {
            if (sq0Var != null && sq0Var.a() && ys0Var.getSelectedTab() == 11) {
                i7 = 2131745868;
            } else {
                i7 = 2131745836;
            }
            q0Var2.setSearchFieldHint(org.telegram.messenger.hd.M0(i7, null));
        }
    }
}
