package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ft0 extends fo0 {
    public final sv0 I;

    public ft0(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, sv0 sv0Var) {
        super(i10, j10, context, n2Var, d6Var);
        this.I = sv0Var;
    }

    @Override
    public final void b(boolean z10) {
        it0 it0Var = this.I.I0;
        it0Var.setAlpha(1.0f - this.E);
        it0Var.setPivotX(it0Var.getWidth() / 2.0f);
        it0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        it0Var.setPivotY(AndroidUtilities.dp(48.0f));
        it0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ah.i1 i1Var) {
        boolean z10;
        yt0 yt0Var;
        boolean z11;
        sv0 sv0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = sv0Var.f30376n0;
        if (u0Var == null) {
            return false;
        }
        sv0Var.W0 = i1Var;
        String obj = u0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && sv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        sv0Var.U0 = z10;
        sv0Var.o1(false);
        int i10 = sv0Var.f30371k0[0].F;
        if (i10 == 11) {
            dv0 dv0Var = sv0Var.S;
            if (dv0Var != null) {
                dv0Var.E(sv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (yt0Var = sv0Var.T) != null) {
            org.telegram.ui.tn tnVar = yt0Var.f42031a;
            org.telegram.ui.sk skVar = tnVar.f41341o1;
            if (skVar != null) {
                skVar.e(i1Var, true);
            }
            if (TextUtils.isEmpty(tnVar.f41405t3) && tnVar.f41365q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            tnVar.f41392s3 = z11;
            tnVar.f41340o0 = z11;
            tnVar.lc(false);
            tnVar.Mc();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        sv0 sv0Var = this.I;
        ft0 ft0Var = sv0Var.J0;
        if (sv0Var.V0 && ((sv0Var.getSelectedTab() == 11 || sv0Var.getSelectedTab() == 12) && ft0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.u0 u0Var = sv0Var.m0;
        if (u0Var != null) {
            if (a() && sv0Var.f30395v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            xj0 xj0Var = u0Var.f21761x;
            if (xj0Var != null && u0Var.f21762y != i11) {
                if (z10) {
                    u0Var.f21762y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(xj0Var, i11);
                } else {
                    u0Var.f21762y = i11;
                    xj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = sv0Var.f30376n0;
        if (u0Var2 != null) {
            if (ft0Var != null && ft0Var.a() && sv0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
