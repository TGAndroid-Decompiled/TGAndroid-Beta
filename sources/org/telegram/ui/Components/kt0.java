package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kt0 extends ko0 {
    public final xv0 I;

    public kt0(int i10, long j10, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var, xv0 xv0Var) {
        super(i10, j10, context, m2Var, c6Var);
        this.I = xv0Var;
    }

    @Override
    public final void b(boolean z10) {
        nt0 nt0Var = this.I.I0;
        nt0Var.setAlpha(1.0f - this.E);
        nt0Var.setPivotX(nt0Var.getWidth() / 2.0f);
        nt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        nt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        nt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ah.i1 i1Var) {
        boolean z10;
        du0 du0Var;
        boolean z11;
        xv0 xv0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = xv0Var.f31369n0;
        if (u0Var == null) {
            return false;
        }
        xv0Var.W0 = i1Var;
        String obj = u0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && xv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        xv0Var.U0 = z10;
        xv0Var.m1(false);
        int i10 = xv0Var.f31364k0[0].F;
        if (i10 == 11) {
            iv0 iv0Var = xv0Var.S;
            if (iv0Var != null) {
                iv0Var.E(xv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (du0Var = xv0Var.T) != null) {
            org.telegram.ui.go goVar = du0Var.f36887a;
            org.telegram.ui.dl dlVar = goVar.f36047o1;
            if (dlVar != null) {
                dlVar.e(i1Var, true);
            }
            if (TextUtils.isEmpty(goVar.f36111t3) && goVar.f36071q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            goVar.f36098s3 = z11;
            goVar.f36046o0 = z11;
            goVar.lc(false);
            goVar.Mc();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        xv0 xv0Var = this.I;
        kt0 kt0Var = xv0Var.J0;
        if (xv0Var.V0 && ((xv0Var.getSelectedTab() == 11 || xv0Var.getSelectedTab() == 12) && kt0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.u0 u0Var = xv0Var.m0;
        if (u0Var != null) {
            if (a() && xv0Var.f31388v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            bk0 bk0Var = u0Var.f20701x;
            if (bk0Var != null && u0Var.f20702y != i11) {
                if (z10) {
                    u0Var.f20702y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(bk0Var, i11);
                } else {
                    u0Var.f20702y = i11;
                    bk0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = xv0Var.f31369n0;
        if (u0Var2 != null) {
            if (kt0Var != null && kt0Var.a() && xv0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
