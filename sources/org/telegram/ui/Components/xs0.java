package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xs0 extends vn0 {
    public final kv0 I;

    public xs0(int i10, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var, kv0 kv0Var) {
        super(i10, j3, context, m2Var, d6Var);
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
        org.telegram.ui.ActionBar.u0 u0Var = kv0Var.f25847n0;
        if (u0Var == null) {
            return false;
        }
        kv0Var.W0 = o0Var;
        String obj = u0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && kv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        kv0Var.U0 = z10;
        kv0Var.m1(false);
        int i10 = kv0Var.f25842k0[0].F;
        if (i10 == 11) {
            vu0 vu0Var = kv0Var.S;
            if (vu0Var != null) {
                vu0Var.E(kv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (qt0Var = kv0Var.T) != null) {
            org.telegram.ui.xn xnVar = qt0Var.f40192a;
            org.telegram.ui.vk vkVar = xnVar.f39580o1;
            if (vkVar != null) {
                vkVar.e(o0Var, true);
            }
            if (TextUtils.isEmpty(xnVar.f39646t3) && xnVar.f39606q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            xnVar.f39633s3 = z11;
            xnVar.f39579o0 = z11;
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
        kv0 kv0Var = this.I;
        xs0 xs0Var = kv0Var.J0;
        if (kv0Var.V0 && ((kv0Var.getSelectedTab() == 11 || kv0Var.getSelectedTab() == 12) && xs0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.u0 u0Var = kv0Var.m0;
        if (u0Var != null) {
            if (a() && kv0Var.f25866v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            mj0 mj0Var = u0Var.f19814x;
            if (mj0Var != null && u0Var.f19815y != i11) {
                if (z10) {
                    u0Var.f19815y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(mj0Var, i11);
                } else {
                    u0Var.f19815y = i11;
                    mj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = kv0Var.f25847n0;
        if (u0Var2 != null) {
            if (xs0Var != null && xs0Var.a() && kv0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
