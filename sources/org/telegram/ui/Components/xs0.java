package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xs0 extends vn0 {
    public final kv0 I;

    public xs0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, kv0 kv0Var) {
        super(i10, j3, context, n2Var, e6Var);
        this.I = kv0Var;
    }

    @Override
    public final void b(boolean z10) {
        at0 at0Var = this.I.I0;
        at0Var.setAlpha(1.0f - this.E);
        at0Var.setPivotX(at0Var.getWidth() / 2.0f);
        at0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        at0Var.setPivotY(AndroidUtilities.dp(48.0f));
        at0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(zg.o0 o0Var) {
        boolean z10;
        qt0 qt0Var;
        boolean z11;
        kv0 kv0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = kv0Var.f25829n0;
        if (v0Var == null) {
            return false;
        }
        kv0Var.W0 = o0Var;
        String obj = v0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && kv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        kv0Var.U0 = z10;
        kv0Var.m1(false);
        int i10 = kv0Var.f25824k0[0].F;
        if (i10 == 11) {
            vu0 vu0Var = kv0Var.S;
            if (vu0Var != null) {
                vu0Var.E(kv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (qt0Var = kv0Var.T) != null) {
            org.telegram.ui.ao aoVar = qt0Var.f32418a;
            org.telegram.ui.xk xkVar = aoVar.f40374o1;
            if (xkVar != null) {
                xkVar.e(o0Var, true);
            }
            if (TextUtils.isEmpty(aoVar.f40440t3) && aoVar.f40400q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            aoVar.f40427s3 = z11;
            aoVar.f40373o0 = z11;
            aoVar.hc(false);
            aoVar.Ic();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        kv0 kv0Var = this.I;
        xs0 xs0Var = kv0Var.J0;
        if (kv0Var.V0 && ((kv0Var.getSelectedTab() == 11 || kv0Var.getSelectedTab() == 12) && xs0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.v0 v0Var = kv0Var.m0;
        if (v0Var != null) {
            if (a() && kv0Var.f25848v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            lj0 lj0Var = v0Var.f19791x;
            if (lj0Var != null && v0Var.f19792y != i11) {
                if (z10) {
                    v0Var.f19792y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(lj0Var, i11);
                } else {
                    v0Var.f19792y = i11;
                    lj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = kv0Var.f25829n0;
        if (v0Var2 != null) {
            if (xs0Var != null && xs0Var.a() && kv0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            v0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
