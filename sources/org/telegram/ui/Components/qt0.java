package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qt0 extends po0 {
    public final dw0 I;

    public qt0(int i10, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var, dw0 dw0Var) {
        super(i10, j3, context, m2Var, d6Var);
        this.I = dw0Var;
    }

    @Override
    public final void b(boolean z10) {
        tt0 tt0Var = this.I.I0;
        tt0Var.setAlpha(1.0f - this.E);
        tt0Var.setPivotX(tt0Var.getWidth() / 2.0f);
        tt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        tt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        tt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(zg.n0 n0Var) {
        boolean z10;
        ju0 ju0Var;
        boolean z11;
        dw0 dw0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = dw0Var.f25716n0;
        if (u0Var == null) {
            return false;
        }
        dw0Var.W0 = n0Var;
        String obj = u0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && dw0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        dw0Var.U0 = z10;
        dw0Var.m1(false);
        int i10 = dw0Var.f25711k0[0].F;
        if (i10 == 11) {
            ov0 ov0Var = dw0Var.S;
            if (ov0Var != null) {
                ov0Var.E(dw0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (ju0Var = dw0Var.T) != null) {
            org.telegram.ui.ao aoVar = ju0Var.f36419a;
            org.telegram.ui.zk zkVar = aoVar.f44874o1;
            if (zkVar != null) {
                zkVar.e(n0Var, true);
            }
            if (TextUtils.isEmpty(aoVar.f44940t3) && aoVar.f44900q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            aoVar.f44927s3 = z11;
            aoVar.f44873o0 = z11;
            aoVar.lc(false);
            aoVar.Mc();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        dw0 dw0Var = this.I;
        qt0 qt0Var = dw0Var.J0;
        if (dw0Var.V0 && ((dw0Var.getSelectedTab() == 11 || dw0Var.getSelectedTab() == 12) && qt0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.u0 u0Var = dw0Var.m0;
        if (u0Var != null) {
            if (a() && dw0Var.f25735v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            hk0 hk0Var = u0Var.f21562x;
            if (hk0Var != null && u0Var.f21563y != i11) {
                if (z10) {
                    u0Var.f21563y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(hk0Var, i11);
                } else {
                    u0Var.f21563y = i11;
                    hk0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = dw0Var.f25716n0;
        if (u0Var2 != null) {
            if (qt0Var != null && qt0Var.a() && dw0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
