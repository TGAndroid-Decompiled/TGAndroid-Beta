package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zs0 extends xn0 {
    public final mv0 I;

    public zs0(int i10, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var, mv0 mv0Var) {
        super(i10, j3, context, m2Var, d6Var);
        this.I = mv0Var;
    }

    @Override
    public final void b(boolean z10) {
        ct0 ct0Var = this.I.I0;
        ct0Var.setAlpha(1.0f - this.E);
        ct0Var.setPivotX(ct0Var.getWidth() / 2.0f);
        ct0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        ct0Var.setPivotY(AndroidUtilities.dp(48.0f));
        ct0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(zg.o0 o0Var) {
        boolean z10;
        st0 st0Var;
        boolean z11;
        mv0 mv0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = mv0Var.f26430n0;
        if (u0Var == null) {
            return false;
        }
        mv0Var.W0 = o0Var;
        String obj = u0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && mv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        mv0Var.U0 = z10;
        mv0Var.m1(false);
        int i10 = mv0Var.f26425k0[0].F;
        if (i10 == 11) {
            xu0 xu0Var = mv0Var.S;
            if (xu0Var != null) {
                xu0Var.E(mv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (st0Var = mv0Var.T) != null) {
            org.telegram.ui.xn xnVar = st0Var.f40301a;
            org.telegram.ui.vk vkVar = xnVar.f39674o1;
            if (vkVar != null) {
                vkVar.e(o0Var, true);
            }
            if (TextUtils.isEmpty(xnVar.f39740t3) && xnVar.f39700q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            xnVar.f39727s3 = z11;
            xnVar.f39673o0 = z11;
            xnVar.hc(false);
            xnVar.Ic();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        mv0 mv0Var = this.I;
        zs0 zs0Var = mv0Var.J0;
        if (mv0Var.V0 && ((mv0Var.getSelectedTab() == 11 || mv0Var.getSelectedTab() == 12) && zs0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.u0 u0Var = mv0Var.m0;
        if (u0Var != null) {
            if (a() && mv0Var.f26449v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            oj0 oj0Var = u0Var.f19831x;
            if (oj0Var != null && u0Var.f19832y != i11) {
                if (z10) {
                    u0Var.f19832y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(oj0Var, i11);
                } else {
                    u0Var.f19832y = i11;
                    oj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = mv0Var.f26430n0;
        if (u0Var2 != null) {
            if (zs0Var != null && zs0Var.a() && mv0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
