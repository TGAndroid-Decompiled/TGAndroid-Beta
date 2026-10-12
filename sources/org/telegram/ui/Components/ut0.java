package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ut0 extends to0 {
    public final hw0 I;

    public ut0(int i10, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var, hw0 hw0Var) {
        super(i10, j3, context, m2Var, c6Var);
        this.I = hw0Var;
    }

    @Override
    public final void b(boolean z10) {
        xt0 xt0Var = this.I.I0;
        xt0Var.setAlpha(1.0f - this.E);
        xt0Var.setPivotX(xt0Var.getWidth() / 2.0f);
        xt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        xt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        xt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(zg.n0 n0Var) {
        boolean z10;
        nu0 nu0Var;
        boolean z11;
        hw0 hw0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = hw0Var.f26938n0;
        if (u0Var == null) {
            return false;
        }
        hw0Var.W0 = n0Var;
        String obj = u0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && hw0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        hw0Var.U0 = z10;
        hw0Var.m1(false);
        int i10 = hw0Var.f26933k0[0].F;
        if (i10 == 11) {
            sv0 sv0Var = hw0Var.S;
            if (sv0Var != null) {
                sv0Var.E(hw0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (nu0Var = hw0Var.T) != null) {
            org.telegram.ui.fo foVar = nu0Var.f38109a;
            org.telegram.ui.dl dlVar = foVar.f37368o1;
            if (dlVar != null) {
                dlVar.e(n0Var, true);
            }
            if (TextUtils.isEmpty(foVar.f37434t3) && foVar.f37394q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            foVar.f37421s3 = z11;
            foVar.f37367o0 = z11;
            foVar.lc(false);
            foVar.Mc();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        hw0 hw0Var = this.I;
        ut0 ut0Var = hw0Var.J0;
        if (hw0Var.V0 && ((hw0Var.getSelectedTab() == 11 || hw0Var.getSelectedTab() == 12) && ut0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.u0 u0Var = hw0Var.m0;
        if (u0Var != null) {
            if (a() && hw0Var.f26957v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            ik0 ik0Var = u0Var.f21337x;
            if (ik0Var != null && u0Var.f21338y != i11) {
                if (z10) {
                    u0Var.f21338y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(ik0Var, i11);
                } else {
                    u0Var.f21338y = i11;
                    ik0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = hw0Var.f26938n0;
        if (u0Var2 != null) {
            if (ut0Var != null && ut0Var.a() && hw0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
