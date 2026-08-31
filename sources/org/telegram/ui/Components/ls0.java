package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ls0 extends pn0 {
    public final zu0 F;

    public ls0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var, zu0 zu0Var) {
        super(i10, j10, context, p2Var, g6Var);
        this.F = zu0Var;
    }

    @Override
    public final void b(boolean z4) {
        os0 os0Var = this.F.F0;
        os0Var.setAlpha(1.0f - this.B);
        os0Var.setPivotX(os0Var.getWidth() / 2.0f);
        os0Var.setScaleX(((1.0f - this.B) * 0.2f) + 0.8f);
        os0Var.setPivotY(AndroidUtilities.dp(48.0f));
        os0Var.setScaleY(((1.0f - this.B) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ng.q0 q0Var) {
        boolean z4;
        et0 et0Var;
        boolean z10;
        zu0 zu0Var = this.F;
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.f33986k0;
        if (w0Var == null) {
            return false;
        }
        zu0Var.T0 = q0Var;
        String obj = w0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && zu0Var.T0 == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        zu0Var.R0 = z4;
        zu0Var.m1(false);
        int i10 = zu0Var.f33980h0[0].C;
        if (i10 == 11) {
            ku0 ku0Var = zu0Var.P;
            if (ku0Var != null) {
                ku0Var.E(zu0Var.T0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (et0Var = zu0Var.Q) != null) {
            org.telegram.ui.yn ynVar = et0Var.f43958a;
            org.telegram.ui.vk vkVar = ynVar.l1;
            if (vkVar != null) {
                vkVar.e(q0Var, true);
            }
            if (TextUtils.isEmpty(ynVar.f43317q3) && ynVar.f43280n3 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            ynVar.f43304p3 = z10;
            ynVar.f43253l0 = z10;
            ynVar.hc(false);
            ynVar.Ic();
        }
        return true;
    }

    @Override
    public final void h(boolean z4) {
        boolean z10;
        int i10;
        int i11;
        super.h(z4);
        zu0 zu0Var = this.F;
        ls0 ls0Var = zu0Var.G0;
        if (zu0Var.S0 && ((zu0Var.getSelectedTab() == 11 || zu0Var.getSelectedTab() == 12) && ls0Var.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(z10);
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.f33984j0;
        if (w0Var != null) {
            if (a() && zu0Var.f34004s1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            lj0 lj0Var = w0Var.f22368x;
            if (lj0Var != null && w0Var.f22369y != i11) {
                if (z4) {
                    w0Var.f22369y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(lj0Var, i11);
                } else {
                    w0Var.f22369y = i11;
                    lj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = zu0Var.f33986k0;
        if (w0Var2 != null) {
            if (ls0Var != null && ls0Var.a() && zu0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
