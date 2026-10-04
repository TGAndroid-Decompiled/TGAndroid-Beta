package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ct0 extends ao0 {
    public final pv0 I;

    public ct0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, pv0 pv0Var) {
        super(i10, j3, context, n2Var, d6Var);
        this.I = pv0Var;
    }

    @Override
    public final void b(boolean z10) {
        ft0 ft0Var = this.I.I0;
        ft0Var.setAlpha(1.0f - this.E);
        ft0Var.setPivotX(ft0Var.getWidth() / 2.0f);
        ft0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        ft0Var.setPivotY(AndroidUtilities.dp(48.0f));
        ft0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(zg.o0 o0Var) {
        boolean z10;
        vt0 vt0Var;
        boolean z11;
        pv0 pv0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = pv0Var.f29781n0;
        if (v0Var == null) {
            return false;
        }
        pv0Var.W0 = o0Var;
        String obj = v0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && pv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        pv0Var.U0 = z10;
        pv0Var.m1(false);
        int i10 = pv0Var.f29776k0[0].F;
        if (i10 == 11) {
            av0 av0Var = pv0Var.S;
            if (av0Var != null) {
                av0Var.E(pv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (vt0Var = pv0Var.T) != null) {
            org.telegram.ui.zn znVar = vt0Var.f34865a;
            org.telegram.ui.vk vkVar = znVar.f43412m1;
            if (vkVar != null) {
                vkVar.e(o0Var, true);
            }
            if (TextUtils.isEmpty(znVar.f43476r3) && znVar.f43439o3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            znVar.f43463q3 = z11;
            znVar.m0 = z11;
            znVar.gc(false);
            znVar.Hc();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        pv0 pv0Var = this.I;
        ct0 ct0Var = pv0Var.J0;
        if (pv0Var.V0 && ((pv0Var.getSelectedTab() == 11 || pv0Var.getSelectedTab() == 12) && ct0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.v0 v0Var = pv0Var.m0;
        if (v0Var != null) {
            if (a() && pv0Var.f29800v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            nj0 nj0Var = v0Var.f21597x;
            if (nj0Var != null && v0Var.f21598y != i11) {
                if (z10) {
                    v0Var.f21598y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(nj0Var, i11);
                } else {
                    v0Var.f21598y = i11;
                    nj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = pv0Var.f29781n0;
        if (v0Var2 != null) {
            if (ct0Var != null && ct0Var.a() && pv0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            v0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
