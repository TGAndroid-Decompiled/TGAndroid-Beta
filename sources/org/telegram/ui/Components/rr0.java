package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
public final class rr0 extends rm0 {
    public final zt0 I;

    public rr0(zt0 zt0Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, k2Var, i10, j10, p6Var);
        this.I = zt0Var;
    }

    @Override
    public final void b(boolean z10) {
        ur0 ur0Var = this.I.K0;
        ur0Var.setAlpha(1.0f - this.E);
        ur0Var.setPivotX(ur0Var.getWidth() / 2.0f);
        ur0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        ur0Var.setPivotY(org.telegram.messenger.i0.L(48.0f));
        ur0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(sg.o0 o0Var) {
        boolean z10;
        fs0 fs0Var;
        boolean z11;
        zt0 zt0Var = this.I;
        org.telegram.ui.ActionBar.t0 t0Var = zt0Var.f33216p0;
        if (t0Var == null) {
            return false;
        }
        zt0Var.Y0 = o0Var;
        String obj = t0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && zt0Var.Y0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        zt0Var.W0 = z10;
        zt0Var.w1(false);
        int i10 = zt0Var.m0[0].E;
        if (i10 == 11) {
            lt0 lt0Var = zt0Var.U;
            if (lt0Var != null) {
                lt0Var.E(obj, zt0Var.Y0);
            }
            org.telegram.messenger.i0.v1(t0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (fs0Var = zt0Var.V) != null) {
            org.telegram.ui.vn vnVar = fs0Var.f43336a;
            org.telegram.ui.wk wkVar = vnVar.C1;
            if (wkVar != null) {
                wkVar.e(o0Var, true);
            }
            if (TextUtils.isEmpty(vnVar.H3) && vnVar.E3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            vnVar.G3 = z11;
            vnVar.f42378q0 = z11;
            vnVar.Bc(false);
            vnVar.cd();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        zt0 zt0Var = this.I;
        rr0 rr0Var = zt0Var.L0;
        if (zt0Var.X0 && ((zt0Var.getSelectedTab() == 11 || zt0Var.getSelectedTab() == 12) && rr0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.t0 t0Var = zt0Var.f33213o0;
        if (t0Var != null) {
            if (a() && zt0Var.f33240x1.getUserConfig().q()) {
                i11 = 2131232442;
            } else {
                i11 = 2131232485;
            }
            ei0 ei0Var = t0Var.f20856y;
            if (ei0Var != null && t0Var.D != i11) {
                if (z10) {
                    t0Var.D = i11;
                    org.telegram.messenger.i0.Q3(ei0Var, i11);
                } else {
                    t0Var.D = i11;
                    ei0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var2 = zt0Var.f33216p0;
        if (t0Var2 != null) {
            if (rr0Var != null && rr0Var.a() && zt0Var.getSelectedTab() == 11) {
                i10 = 2131745885;
            } else {
                i10 = 2131745853;
            }
            t0Var2.setSearchFieldHint(org.telegram.messenger.cd.L0(i10, null));
        }
    }
}
