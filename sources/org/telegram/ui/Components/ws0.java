package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ws0 extends un0 {
    public final jv0 I;

    public ws0(int i10, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var, jv0 jv0Var) {
        super(i10, j3, context, m2Var, d6Var);
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
        org.telegram.ui.ActionBar.u0 u0Var = jv0Var.f25524n0;
        if (u0Var == null) {
            return false;
        }
        jv0Var.W0 = o0Var;
        String obj = u0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && jv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        jv0Var.U0 = z10;
        jv0Var.m1(false);
        int i10 = jv0Var.f25519k0[0].F;
        if (i10 == 11) {
            uu0 uu0Var = jv0Var.S;
            if (uu0Var != null) {
                uu0Var.E(jv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (pt0Var = jv0Var.T) != null) {
            org.telegram.ui.xn xnVar = pt0Var.f40177a;
            org.telegram.ui.vk vkVar = xnVar.f39566o1;
            if (vkVar != null) {
                vkVar.e(o0Var, true);
            }
            if (TextUtils.isEmpty(xnVar.f39632t3) && xnVar.f39592q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            xnVar.f39619s3 = z11;
            xnVar.f39565o0 = z11;
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
        jv0 jv0Var = this.I;
        ws0 ws0Var = jv0Var.J0;
        if (jv0Var.V0 && ((jv0Var.getSelectedTab() == 11 || jv0Var.getSelectedTab() == 12) && ws0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.u0 u0Var = jv0Var.m0;
        if (u0Var != null) {
            if (a() && jv0Var.f25543v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            lj0 lj0Var = u0Var.f19800x;
            if (lj0Var != null && u0Var.f19801y != i11) {
                if (z10) {
                    u0Var.f19801y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(lj0Var, i11);
                } else {
                    u0Var.f19801y = i11;
                    lj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = jv0Var.f25524n0;
        if (u0Var2 != null) {
            if (ws0Var != null && ws0Var.a() && jv0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
