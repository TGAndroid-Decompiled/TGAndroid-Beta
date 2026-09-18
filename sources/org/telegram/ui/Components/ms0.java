package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ms0 extends jn0 {
    public final zu0 I;

    public ms0(int i10, long j3, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f6 f6Var, zu0 zu0Var) {
        super(i10, j3, context, o2Var, f6Var);
        this.I = zu0Var;
    }

    @Override
    public final void b(boolean z10) {
        ps0 ps0Var = this.I.I0;
        ps0Var.setAlpha(1.0f - this.E);
        ps0Var.setPivotX(ps0Var.getWidth() / 2.0f);
        ps0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        ps0Var.setPivotY(AndroidUtilities.dp(48.0f));
        ps0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(zg.p0 p0Var) {
        boolean z10;
        ft0 ft0Var;
        boolean z11;
        zu0 zu0Var = this.I;
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.f30640n0;
        if (w0Var == null) {
            return false;
        }
        zu0Var.W0 = p0Var;
        String obj = w0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && zu0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        zu0Var.U0 = z10;
        zu0Var.m1(false);
        int i10 = zu0Var.f30635k0[0].F;
        if (i10 == 11) {
            ku0 ku0Var = zu0Var.S;
            if (ku0Var != null) {
                ku0Var.E(zu0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (ft0Var = zu0Var.T) != null) {
            org.telegram.ui.co coVar = ft0Var.f33448a;
            org.telegram.ui.zk zkVar = coVar.f32392o1;
            if (zkVar != null) {
                zkVar.e(p0Var, true);
            }
            if (TextUtils.isEmpty(coVar.f32458t3) && coVar.f32418q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            coVar.f32445s3 = z11;
            coVar.f32391o0 = z11;
            coVar.hc(false);
            coVar.Ic();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        zu0 zu0Var = this.I;
        ms0 ms0Var = zu0Var.J0;
        if (zu0Var.V0 && ((zu0Var.getSelectedTab() == 11 || zu0Var.getSelectedTab() == 12) && ms0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.m0;
        if (w0Var != null) {
            if (a() && zu0Var.f30659v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            bj0 bj0Var = w0Var.f19632x;
            if (bj0Var != null && w0Var.f19633y != i11) {
                if (z10) {
                    w0Var.f19633y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(bj0Var, i11);
                } else {
                    w0Var.f19633y = i11;
                    bj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = zu0Var.f30640n0;
        if (w0Var2 != null) {
            if (ms0Var != null && ms0Var.a() && zu0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
