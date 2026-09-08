package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ks0 extends hn0 {
    public final xu0 I;

    public ks0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var, xu0 xu0Var) {
        super(i10, j3, context, n2Var, f6Var);
        this.I = xu0Var;
    }

    @Override
    public final void b(boolean z10) {
        ns0 ns0Var = this.I.I0;
        ns0Var.setAlpha(1.0f - this.E);
        ns0Var.setPivotX(ns0Var.getWidth() / 2.0f);
        ns0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        ns0Var.setPivotY(AndroidUtilities.dp(48.0f));
        ns0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ah.j1 j1Var) {
        boolean z10;
        dt0 dt0Var;
        boolean z11;
        xu0 xu0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = xu0Var.f32734n0;
        if (v0Var == null) {
            return false;
        }
        xu0Var.W0 = j1Var;
        String obj = v0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && xu0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        xu0Var.U0 = z10;
        xu0Var.m1(false);
        int i10 = xu0Var.f32729k0[0].F;
        if (i10 == 11) {
            iu0 iu0Var = xu0Var.S;
            if (iu0Var != null) {
                iu0Var.E(xu0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (dt0Var = xu0Var.T) != null) {
            org.telegram.ui.eo eoVar = dt0Var.f36464a;
            org.telegram.ui.yk ykVar = eoVar.f35386o1;
            if (ykVar != null) {
                ykVar.e(j1Var, true);
            }
            if (TextUtils.isEmpty(eoVar.f35452t3) && eoVar.f35412q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            eoVar.f35439s3 = z11;
            eoVar.f35385o0 = z11;
            eoVar.hc(false);
            eoVar.Ic();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        xu0 xu0Var = this.I;
        ks0 ks0Var = xu0Var.J0;
        if (xu0Var.V0 && ((xu0Var.getSelectedTab() == 11 || xu0Var.getSelectedTab() == 12) && ks0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.v0 v0Var = xu0Var.m0;
        if (v0Var != null) {
            if (a() && xu0Var.f32753v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            aj0 aj0Var = v0Var.f21432x;
            if (aj0Var != null && v0Var.f21433y != i11) {
                if (z10) {
                    v0Var.f21433y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(aj0Var, i11);
                } else {
                    v0Var.f21433y = i11;
                    aj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = xu0Var.f32734n0;
        if (v0Var2 != null) {
            if (ks0Var != null && ks0Var.a() && xu0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            v0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
