package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ot0 extends no0 {
    public final bw0 I;

    public ot0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, bw0 bw0Var) {
        super(i10, j3, context, n2Var, e6Var);
        this.I = bw0Var;
    }

    @Override
    public final void b(boolean z10) {
        rt0 rt0Var = this.I.I0;
        rt0Var.setAlpha(1.0f - this.E);
        rt0Var.setPivotX(rt0Var.getWidth() / 2.0f);
        rt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        rt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        rt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(zg.n0 n0Var) {
        boolean z10;
        hu0 hu0Var;
        boolean z11;
        bw0 bw0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = bw0Var.f25147n0;
        if (v0Var == null) {
            return false;
        }
        bw0Var.W0 = n0Var;
        String obj = v0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && bw0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        bw0Var.U0 = z10;
        bw0Var.m1(false);
        int i10 = bw0Var.f25142k0[0].F;
        if (i10 == 11) {
            mv0 mv0Var = bw0Var.S;
            if (mv0Var != null) {
                mv0Var.E(bw0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (hu0Var = bw0Var.T) != null) {
            org.telegram.ui.ao aoVar = hu0Var.f36359a;
            org.telegram.ui.zk zkVar = aoVar.f44875o1;
            if (zkVar != null) {
                zkVar.e(n0Var, true);
            }
            if (TextUtils.isEmpty(aoVar.f44941t3) && aoVar.f44901q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            aoVar.f44928s3 = z11;
            aoVar.f44874o0 = z11;
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
        bw0 bw0Var = this.I;
        ot0 ot0Var = bw0Var.J0;
        if (bw0Var.V0 && ((bw0Var.getSelectedTab() == 11 || bw0Var.getSelectedTab() == 12) && ot0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.v0 v0Var = bw0Var.m0;
        if (v0Var != null) {
            if (a() && bw0Var.f25166v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            fk0 fk0Var = v0Var.f21606x;
            if (fk0Var != null && v0Var.f21607y != i11) {
                if (z10) {
                    v0Var.f21607y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(fk0Var, i11);
                } else {
                    v0Var.f21607y = i11;
                    fk0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = bw0Var.f25147n0;
        if (v0Var2 != null) {
            if (ot0Var != null && ot0Var.a() && bw0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            v0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
