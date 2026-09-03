package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ks0 extends nn0 {
    public final yu0 F;

    public ks0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, yu0 yu0Var) {
        super(i10, j10, context, p2Var, f6Var);
        this.F = yu0Var;
    }

    @Override
    public final void b(boolean z4) {
        ns0 ns0Var = this.F.F0;
        ns0Var.setAlpha(1.0f - this.B);
        ns0Var.setPivotX(ns0Var.getWidth() / 2.0f);
        ns0Var.setScaleX(((1.0f - this.B) * 0.2f) + 0.8f);
        ns0Var.setPivotY(AndroidUtilities.dp(48.0f));
        ns0Var.setScaleY(((1.0f - this.B) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(mg.q0 q0Var) {
        boolean z4;
        dt0 dt0Var;
        boolean z10;
        yu0 yu0Var = this.F;
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.f31137k0;
        if (w0Var == null) {
            return false;
        }
        yu0Var.T0 = q0Var;
        String obj = w0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && yu0Var.T0 == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        yu0Var.R0 = z4;
        yu0Var.m1(false);
        int i10 = yu0Var.f31131h0[0].C;
        if (i10 == 11) {
            ju0 ju0Var = yu0Var.P;
            if (ju0Var != null) {
                ju0Var.E(yu0Var.T0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (dt0Var = yu0Var.Q) != null) {
            org.telegram.ui.ao aoVar = dt0Var.f32924a;
            org.telegram.ui.xk xkVar = aoVar.l1;
            if (xkVar != null) {
                xkVar.e(q0Var, true);
            }
            if (TextUtils.isEmpty(aoVar.f40714q3) && aoVar.f40677n3 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            aoVar.f40701p3 = z10;
            aoVar.f40650l0 = z10;
            aoVar.hc(false);
            aoVar.Ic();
        }
        return true;
    }

    @Override
    public final void h(boolean z4) {
        boolean z10;
        int i10;
        int i11;
        super.h(z4);
        yu0 yu0Var = this.F;
        ks0 ks0Var = yu0Var.G0;
        if (yu0Var.S0 && ((yu0Var.getSelectedTab() == 11 || yu0Var.getSelectedTab() == 12) && ks0Var.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(z10);
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.f31135j0;
        if (w0Var != null) {
            if (a() && yu0Var.f31155s1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            jj0 jj0Var = w0Var.f20647x;
            if (jj0Var != null && w0Var.f20648y != i11) {
                if (z4) {
                    w0Var.f20648y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(jj0Var, i11);
                } else {
                    w0Var.f20648y = i11;
                    jj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = yu0Var.f31137k0;
        if (w0Var2 != null) {
            if (ks0Var != null && ks0Var.a() && yu0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
