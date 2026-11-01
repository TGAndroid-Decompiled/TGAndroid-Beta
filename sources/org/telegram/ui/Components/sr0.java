package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
public final class sr0 extends sm0 {
    public final au0 I;

    public sr0(au0 au0Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, k2Var, i10, j10, p6Var);
        this.I = au0Var;
    }

    @Override
    public final void b(boolean z10) {
        vr0 vr0Var = this.I.K0;
        vr0Var.setAlpha(1.0f - this.E);
        vr0Var.setPivotX(vr0Var.getWidth() / 2.0f);
        vr0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        vr0Var.setPivotY(org.telegram.messenger.i0.L(48.0f));
        vr0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(sg.o0 o0Var) {
        boolean z10;
        gs0 gs0Var;
        boolean z11;
        au0 au0Var = this.I;
        org.telegram.ui.ActionBar.t0 t0Var = au0Var.f24544p0;
        if (t0Var == null) {
            return false;
        }
        au0Var.Y0 = o0Var;
        String obj = t0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && au0Var.Y0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        au0Var.W0 = z10;
        au0Var.x1(false);
        int i10 = au0Var.m0[0].E;
        if (i10 == 11) {
            mt0 mt0Var = au0Var.U;
            if (mt0Var != null) {
                mt0Var.E(obj, au0Var.Y0);
            }
            org.telegram.messenger.i0.v1(t0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (gs0Var = au0Var.V) != null) {
            org.telegram.ui.vn vnVar = gs0Var.f43128a;
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
            vnVar.f42189q0 = z11;
            vnVar.Gc(false);
            vnVar.hd();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        au0 au0Var = this.I;
        sr0 sr0Var = au0Var.L0;
        if (au0Var.X0 && ((au0Var.getSelectedTab() == 11 || au0Var.getSelectedTab() == 12) && sr0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.t0 t0Var = au0Var.f24541o0;
        if (t0Var != null) {
            if (a() && au0Var.f24568x1.getUserConfig().q()) {
                i11 = 2131232442;
            } else {
                i11 = 2131232485;
            }
            fi0 fi0Var = t0Var.f20857y;
            if (fi0Var != null && t0Var.D != i11) {
                if (z10) {
                    t0Var.D = i11;
                    org.telegram.messenger.i0.Q3(fi0Var, i11);
                } else {
                    t0Var.D = i11;
                    fi0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var2 = au0Var.f24544p0;
        if (t0Var2 != null) {
            if (sr0Var != null && sr0Var.a() && au0Var.getSelectedTab() == 11) {
                i10 = 2131745885;
            } else {
                i10 = 2131745853;
            }
            t0Var2.setSearchFieldHint(org.telegram.messenger.dd.L0(i10, null));
        }
    }
}
