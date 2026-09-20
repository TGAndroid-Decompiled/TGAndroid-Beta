package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ws0 extends un0 {
    public final jv0 I;

    public ws0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var, jv0 jv0Var) {
        super(i10, j3, context, n2Var, f6Var);
        this.I = jv0Var;
    }

    @Override
    public final void b(boolean z10) {
        zs0 zs0Var = this.I.I0;
        zs0Var.setAlpha(1.0f - this.E);
        zs0Var.setPivotX(zs0Var.getWidth() / 2.0f);
        zs0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        zs0Var.setPivotY(AndroidUtilities.dp(48.0f));
        zs0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(zg.o0 o0Var) {
        boolean z10;
        pt0 pt0Var;
        boolean z11;
        jv0 jv0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = jv0Var.f25509n0;
        if (v0Var == null) {
            return false;
        }
        jv0Var.W0 = o0Var;
        String obj = v0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && jv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        jv0Var.U0 = z10;
        jv0Var.m1(false);
        int i10 = jv0Var.f25504k0[0].F;
        if (i10 == 11) {
            uu0 uu0Var = jv0Var.S;
            if (uu0Var != null) {
                uu0Var.E(jv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (pt0Var = jv0Var.T) != null) {
            org.telegram.ui.ao aoVar = pt0Var.f32501a;
            org.telegram.ui.xk xkVar = aoVar.f40416o1;
            if (xkVar != null) {
                xkVar.e(o0Var, true);
            }
            if (TextUtils.isEmpty(aoVar.f40482t3) && aoVar.f40442q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            aoVar.f40469s3 = z11;
            aoVar.f40415o0 = z11;
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
        jv0 jv0Var = this.I;
        ws0 ws0Var = jv0Var.J0;
        if (jv0Var.V0 && ((jv0Var.getSelectedTab() == 11 || jv0Var.getSelectedTab() == 12) && ws0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.v0 v0Var = jv0Var.m0;
        if (v0Var != null) {
            if (a() && jv0Var.f25528v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            kj0 kj0Var = v0Var.f19823x;
            if (kj0Var != null && v0Var.f19824y != i11) {
                if (z10) {
                    v0Var.f19824y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(kj0Var, i11);
                } else {
                    v0Var.f19824y = i11;
                    kj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = jv0Var.f25509n0;
        if (v0Var2 != null) {
            if (ws0Var != null && ws0Var.a() && jv0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            v0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
