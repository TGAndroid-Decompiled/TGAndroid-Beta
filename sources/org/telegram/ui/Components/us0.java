package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class us0 extends rn0 {
    public final iv0 I;

    public us0(int i10, long j3, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, iv0 iv0Var) {
        super(i10, j3, context, p2Var, f6Var);
        this.I = iv0Var;
    }

    @Override
    public final void b(boolean z10) {
        xs0 xs0Var = this.I.I0;
        xs0Var.setAlpha(1.0f - this.E);
        xs0Var.setPivotX(xs0Var.getWidth() / 2.0f);
        xs0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        xs0Var.setPivotY(AndroidUtilities.dp(48.0f));
        xs0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(yg.p0 p0Var) {
        boolean z10;
        nt0 nt0Var;
        boolean z11;
        iv0 iv0Var = this.I;
        org.telegram.ui.ActionBar.w0 w0Var = iv0Var.f24112n0;
        if (w0Var == null) {
            return false;
        }
        iv0Var.W0 = p0Var;
        String obj = w0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && iv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        iv0Var.U0 = z10;
        iv0Var.m1(false);
        int i10 = iv0Var.f24107k0[0].F;
        if (i10 == 11) {
            tu0 tu0Var = iv0Var.S;
            if (tu0Var != null) {
                tu0Var.E(iv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (nt0Var = iv0Var.T) != null) {
            org.telegram.ui.fo foVar = nt0Var.f33142a;
            org.telegram.ui.al alVar = foVar.f32428o1;
            if (alVar != null) {
                alVar.e(p0Var, true);
            }
            if (TextUtils.isEmpty(foVar.f32494t3) && foVar.f32454q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            foVar.f32481s3 = z11;
            foVar.f32427o0 = z11;
            foVar.hc(false);
            foVar.Ic();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        iv0 iv0Var = this.I;
        us0 us0Var = iv0Var.J0;
        if (iv0Var.V0 && ((iv0Var.getSelectedTab() == 11 || iv0Var.getSelectedTab() == 12) && us0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.w0 w0Var = iv0Var.m0;
        if (w0Var != null) {
            if (a() && iv0Var.f24131v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            kj0 kj0Var = w0Var.f18712x;
            if (kj0Var != null && w0Var.f18713y != i11) {
                if (z10) {
                    w0Var.f18713y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(kj0Var, i11);
                } else {
                    w0Var.f18713y = i11;
                    kj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = iv0Var.f24112n0;
        if (w0Var2 != null) {
            if (us0Var != null && us0Var.a() && iv0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
