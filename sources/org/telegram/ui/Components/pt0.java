package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pt0 extends oo0 {
    public final cw0 I;

    public pt0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, cw0 cw0Var) {
        super(i10, j3, context, n2Var, e6Var);
        this.I = cw0Var;
    }

    @Override
    public final void b(boolean z10) {
        st0 st0Var = this.I.I0;
        st0Var.setAlpha(1.0f - this.E);
        st0Var.setPivotX(st0Var.getWidth() / 2.0f);
        st0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        st0Var.setPivotY(AndroidUtilities.dp(48.0f));
        st0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(zg.n0 n0Var) {
        boolean z10;
        iu0 iu0Var;
        boolean z11;
        cw0 cw0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = cw0Var.f25455n0;
        if (v0Var == null) {
            return false;
        }
        cw0Var.W0 = n0Var;
        String obj = v0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && cw0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        cw0Var.U0 = z10;
        cw0Var.m1(false);
        int i10 = cw0Var.f25450k0[0].F;
        if (i10 == 11) {
            nv0 nv0Var = cw0Var.S;
            if (nv0Var != null) {
                nv0Var.E(cw0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (iu0Var = cw0Var.T) != null) {
            org.telegram.ui.ao aoVar = iu0Var.f36403a;
            org.telegram.ui.zk zkVar = aoVar.f44919o1;
            if (zkVar != null) {
                zkVar.e(n0Var, true);
            }
            if (TextUtils.isEmpty(aoVar.f44985t3) && aoVar.f44945q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            aoVar.f44972s3 = z11;
            aoVar.f44918o0 = z11;
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
        cw0 cw0Var = this.I;
        pt0 pt0Var = cw0Var.J0;
        if (cw0Var.V0 && ((cw0Var.getSelectedTab() == 11 || cw0Var.getSelectedTab() == 12) && pt0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.v0 v0Var = cw0Var.m0;
        if (v0Var != null) {
            if (a() && cw0Var.f25474v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            gk0 gk0Var = v0Var.f21610x;
            if (gk0Var != null && v0Var.f21611y != i11) {
                if (z10) {
                    v0Var.f21611y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(gk0Var, i11);
                } else {
                    v0Var.f21611y = i11;
                    gk0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = cw0Var.f25455n0;
        if (v0Var2 != null) {
            if (pt0Var != null && pt0Var.a() && cw0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            v0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
