package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ys0 extends wn0 {
    public final lv0 I;

    public ys0(int i10, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var, lv0 lv0Var) {
        super(i10, j3, context, m2Var, d6Var);
        this.I = lv0Var;
    }

    @Override
    public final void b(boolean z10) {
        bt0 bt0Var = this.I.I0;
        bt0Var.setAlpha(1.0f - this.E);
        bt0Var.setPivotX(bt0Var.getWidth() / 2.0f);
        bt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        bt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        bt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(zg.o0 o0Var) {
        boolean z10;
        rt0 rt0Var;
        boolean z11;
        lv0 lv0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = lv0Var.f26135n0;
        if (u0Var == null) {
            return false;
        }
        lv0Var.W0 = o0Var;
        String obj = u0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && lv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        lv0Var.U0 = z10;
        lv0Var.m1(false);
        int i10 = lv0Var.f26130k0[0].F;
        if (i10 == 11) {
            wu0 wu0Var = lv0Var.S;
            if (wu0Var != null) {
                wu0Var.E(lv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (rt0Var = lv0Var.T) != null) {
            org.telegram.ui.xn xnVar = rt0Var.f40193a;
            org.telegram.ui.vk vkVar = xnVar.f39581o1;
            if (vkVar != null) {
                vkVar.e(o0Var, true);
            }
            if (TextUtils.isEmpty(xnVar.f39647t3) && xnVar.f39607q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            xnVar.f39634s3 = z11;
            xnVar.f39580o0 = z11;
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
        lv0 lv0Var = this.I;
        ys0 ys0Var = lv0Var.J0;
        if (lv0Var.V0 && ((lv0Var.getSelectedTab() == 11 || lv0Var.getSelectedTab() == 12) && ys0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.u0 u0Var = lv0Var.m0;
        if (u0Var != null) {
            if (a() && lv0Var.f26154v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            nj0 nj0Var = u0Var.f19816x;
            if (nj0Var != null && u0Var.f19817y != i11) {
                if (z10) {
                    u0Var.f19817y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(nj0Var, i11);
                } else {
                    u0Var.f19817y = i11;
                    nj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = lv0Var.f26135n0;
        if (u0Var2 != null) {
            if (ys0Var != null && ys0Var.a() && lv0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
