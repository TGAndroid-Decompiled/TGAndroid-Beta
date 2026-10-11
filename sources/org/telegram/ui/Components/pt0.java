package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pt0 extends oo0 {
    public final cw0 I;

    public pt0(int i10, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var, cw0 cw0Var) {
        super(i10, j3, context, m2Var, d6Var);
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
        org.telegram.ui.ActionBar.u0 u0Var = cw0Var.f25517n0;
        if (u0Var == null) {
            return false;
        }
        cw0Var.W0 = n0Var;
        String obj = u0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && cw0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        cw0Var.U0 = z10;
        cw0Var.m1(false);
        int i10 = cw0Var.f25512k0[0].F;
        if (i10 == 11) {
            nv0 nv0Var = cw0Var.S;
            if (nv0Var != null) {
                nv0Var.E(cw0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (iu0Var = cw0Var.T) != null) {
            org.telegram.ui.ao aoVar = iu0Var.f36453a;
            org.telegram.ui.zk zkVar = aoVar.f44908o1;
            if (zkVar != null) {
                zkVar.e(n0Var, true);
            }
            if (TextUtils.isEmpty(aoVar.f44974t3) && aoVar.f44934q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            aoVar.f44961s3 = z11;
            aoVar.f44907o0 = z11;
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
        org.telegram.ui.ActionBar.u0 u0Var = cw0Var.m0;
        if (u0Var != null) {
            if (a() && cw0Var.f25536v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            gk0 gk0Var = u0Var.f21598x;
            if (gk0Var != null && u0Var.f21599y != i11) {
                if (z10) {
                    u0Var.f21599y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(gk0Var, i11);
                } else {
                    u0Var.f21599y = i11;
                    gk0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = cw0Var.f25517n0;
        if (u0Var2 != null) {
            if (pt0Var != null && pt0Var.a() && cw0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
