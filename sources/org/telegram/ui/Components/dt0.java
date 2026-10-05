package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dt0 extends ao0 {
    public final qv0 I;

    public dt0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, qv0 qv0Var) {
        super(i10, j3, context, n2Var, d6Var);
        this.I = qv0Var;
    }

    @Override
    public final void b(boolean z10) {
        gt0 gt0Var = this.I.I0;
        gt0Var.setAlpha(1.0f - this.E);
        gt0Var.setPivotX(gt0Var.getWidth() / 2.0f);
        gt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        gt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        gt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(zg.m0 m0Var) {
        boolean z10;
        wt0 wt0Var;
        boolean z11;
        qv0 qv0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = qv0Var.f30244n0;
        if (v0Var == null) {
            return false;
        }
        qv0Var.W0 = m0Var;
        String obj = v0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && qv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        qv0Var.U0 = z10;
        qv0Var.m1(false);
        int i10 = qv0Var.f30239k0[0].F;
        if (i10 == 11) {
            bv0 bv0Var = qv0Var.S;
            if (bv0Var != null) {
                bv0Var.E(qv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (wt0Var = qv0Var.T) != null) {
            org.telegram.ui.zn znVar = wt0Var.f34922a;
            org.telegram.ui.vk vkVar = znVar.f43413m1;
            if (vkVar != null) {
                vkVar.e(m0Var, true);
            }
            if (TextUtils.isEmpty(znVar.f43477r3) && znVar.f43440o3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            znVar.f43464q3 = z11;
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
        qv0 qv0Var = this.I;
        dt0 dt0Var = qv0Var.J0;
        if (qv0Var.V0 && ((qv0Var.getSelectedTab() == 11 || qv0Var.getSelectedTab() == 12) && dt0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.v0 v0Var = qv0Var.m0;
        if (v0Var != null) {
            if (a() && qv0Var.f30263v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            nj0 nj0Var = v0Var.f21606x;
            if (nj0Var != null && v0Var.f21607y != i11) {
                if (z10) {
                    v0Var.f21607y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(nj0Var, i11);
                } else {
                    v0Var.f21607y = i11;
                    nj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = qv0Var.f30244n0;
        if (v0Var2 != null) {
            if (dt0Var != null && dt0Var.a() && qv0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            v0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
