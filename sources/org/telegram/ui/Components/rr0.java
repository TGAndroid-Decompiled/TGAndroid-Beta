package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rr0 extends sm0 {
    public final eu0 E;

    public rr0(int i9, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var, eu0 eu0Var) {
        super(i9, j10, context, o2Var, b6Var);
        this.E = eu0Var;
    }

    @Override
    public final void b(boolean z10) {
        ur0 ur0Var = this.E.E0;
        ur0Var.setAlpha(1.0f - this.A);
        ur0Var.setPivotX(ur0Var.getWidth() / 2.0f);
        ur0Var.setScaleX(((1.0f - this.A) * 0.2f) + 0.8f);
        ur0Var.setPivotY(AndroidUtilities.dp(48.0f));
        ur0Var.setScaleY(((1.0f - this.A) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(hg.r0 r0Var) {
        boolean z10;
        ks0 ks0Var;
        boolean z11;
        eu0 eu0Var = this.E;
        org.telegram.ui.ActionBar.w0 w0Var = eu0Var.f28143j0;
        if (w0Var == null) {
            return false;
        }
        eu0Var.S0 = r0Var;
        String obj = w0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && eu0Var.S0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        eu0Var.Q0 = z10;
        eu0Var.m1(false);
        int i9 = eu0Var.f28137g0[0].B;
        if (i9 == 11) {
            pt0 pt0Var = eu0Var.O;
            if (pt0Var != null) {
                pt0Var.E(eu0Var.S0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i9 == 12 && (ks0Var = eu0Var.P) != null) {
            org.telegram.ui.rn rnVar = ks0Var.f42731a;
            org.telegram.ui.mk mkVar = rnVar.f41967k1;
            if (mkVar != null) {
                mkVar.e(r0Var, true);
            }
            if (TextUtils.isEmpty(rnVar.f42028p3) && rnVar.f41992m3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            rnVar.f42018o3 = z11;
            rnVar.f41966k0 = z11;
            rnVar.hc(false);
            rnVar.Ic();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i9;
        int i10;
        super.h(z10);
        eu0 eu0Var = this.E;
        rr0 rr0Var = eu0Var.F0;
        if (eu0Var.R0 && ((eu0Var.getSelectedTab() == 11 || eu0Var.getSelectedTab() == 12) && rr0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.w0 w0Var = eu0Var.f28141i0;
        if (w0Var != null) {
            if (a() && eu0Var.f28160r1.getUserConfig().isPremium()) {
                i10 = R.drawable.navbar_search_tag;
            } else {
                i10 = R.drawable.outline_header_search;
            }
            pi0 pi0Var = w0Var.f23924x;
            if (pi0Var != null && w0Var.f23925y != i10) {
                if (z10) {
                    w0Var.f23925y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(pi0Var, i10);
                } else {
                    w0Var.f23925y = i10;
                    pi0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = eu0Var.f28143j0;
        if (w0Var2 != null) {
            if (rr0Var != null && rr0Var.a() && eu0Var.getSelectedTab() == 11) {
                i9 = R.string.SavedTagSearchHint;
            } else {
                i9 = R.string.Search;
            }
            w0Var2.setSearchFieldHint(LocaleController.getString(i9));
        }
    }
}
