package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jt0 extends io0 {
    public final wv0 I;

    public jt0(int i10, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var, wv0 wv0Var) {
        super(i10, j10, context, o2Var, g6Var);
        this.I = wv0Var;
    }

    @Override
    public final void b(boolean z10) {
        mt0 mt0Var = this.I.I0;
        mt0Var.setAlpha(1.0f - this.E);
        mt0Var.setPivotX(mt0Var.getWidth() / 2.0f);
        mt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        mt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        mt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ah.i1 i1Var) {
        boolean z10;
        cu0 cu0Var;
        boolean z11;
        wv0 wv0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = wv0Var.f32391n0;
        if (u0Var == null) {
            return false;
        }
        wv0Var.W0 = i1Var;
        String obj = u0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && wv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        wv0Var.U0 = z10;
        wv0Var.p1(false);
        int i10 = wv0Var.f32386k0[0].F;
        if (i10 == 11) {
            hv0 hv0Var = wv0Var.S;
            if (hv0Var != null) {
                hv0Var.E(wv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (cu0Var = wv0Var.T) != null) {
            org.telegram.ui.tn tnVar = cu0Var.f42454a;
            org.telegram.ui.rk rkVar = tnVar.A1;
            if (rkVar != null) {
                rkVar.e(i1Var, true);
            }
            if (TextUtils.isEmpty(tnVar.F3) && tnVar.C3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            tnVar.E3 = z11;
            tnVar.f41620o0 = z11;
            tnVar.oc(false);
            tnVar.Pc();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        wv0 wv0Var = this.I;
        jt0 jt0Var = wv0Var.J0;
        if (wv0Var.V0 && ((wv0Var.getSelectedTab() == 11 || wv0Var.getSelectedTab() == 12) && jt0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.u0 u0Var = wv0Var.m0;
        if (u0Var != null) {
            if (a() && wv0Var.f32410v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            ak0 ak0Var = u0Var.f21903x;
            if (ak0Var != null && u0Var.f21904y != i11) {
                if (z10) {
                    u0Var.f21904y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(ak0Var, i11);
                } else {
                    u0Var.f21904y = i11;
                    ak0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = wv0Var.f32391n0;
        if (u0Var2 != null) {
            if (jt0Var != null && jt0Var.a() && wv0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
