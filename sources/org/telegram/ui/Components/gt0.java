package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gt0 extends fo0 {
    public final tv0 I;

    public gt0(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, tv0 tv0Var) {
        super(i10, j10, context, n2Var, d6Var);
        this.I = tv0Var;
    }

    @Override
    public final void b(boolean z10) {
        jt0 jt0Var = this.I.I0;
        jt0Var.setAlpha(1.0f - this.E);
        jt0Var.setPivotX(jt0Var.getWidth() / 2.0f);
        jt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        jt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        jt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ah.i1 i1Var) {
        boolean z10;
        zt0 zt0Var;
        boolean z11;
        tv0 tv0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = tv0Var.f30713n0;
        if (u0Var == null) {
            return false;
        }
        tv0Var.W0 = i1Var;
        String obj = u0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && tv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        tv0Var.U0 = z10;
        tv0Var.o1(false);
        int i10 = tv0Var.f30708k0[0].F;
        if (i10 == 11) {
            ev0 ev0Var = tv0Var.S;
            if (ev0Var != null) {
                ev0Var.E(tv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (zt0Var = tv0Var.T) != null) {
            org.telegram.ui.rn rnVar = zt0Var.f41490a;
            org.telegram.ui.qk qkVar = rnVar.f40782o1;
            if (qkVar != null) {
                qkVar.e(i1Var, true);
            }
            if (TextUtils.isEmpty(rnVar.f40846t3) && rnVar.f40806q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            rnVar.f40833s3 = z11;
            rnVar.f40781o0 = z11;
            rnVar.lc(false);
            rnVar.Mc();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        tv0 tv0Var = this.I;
        gt0 gt0Var = tv0Var.J0;
        if (tv0Var.V0 && ((tv0Var.getSelectedTab() == 11 || tv0Var.getSelectedTab() == 12) && gt0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.u0 u0Var = tv0Var.m0;
        if (u0Var != null) {
            if (a() && tv0Var.f30732v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            xj0 xj0Var = u0Var.f21755x;
            if (xj0Var != null && u0Var.f21756y != i11) {
                if (z10) {
                    u0Var.f21756y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(xj0Var, i11);
                } else {
                    u0Var.f21756y = i11;
                    xj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = tv0Var.f30713n0;
        if (u0Var2 != null) {
            if (gt0Var != null && gt0Var.a() && tv0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
