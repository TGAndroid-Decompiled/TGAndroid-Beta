package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ls0 extends in0 {
    public final yu0 I;

    public ls0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, yu0 yu0Var) {
        super(i10, j3, context, n2Var, e6Var);
        this.I = yu0Var;
    }

    @Override
    public final void b(boolean z10) {
        os0 os0Var = this.I.I0;
        os0Var.setAlpha(1.0f - this.E);
        os0Var.setPivotX(os0Var.getWidth() / 2.0f);
        os0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        os0Var.setPivotY(AndroidUtilities.dp(48.0f));
        os0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(zg.p0 p0Var) {
        boolean z10;
        et0 et0Var;
        boolean z11;
        yu0 yu0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = yu0Var.f30373n0;
        if (v0Var == null) {
            return false;
        }
        yu0Var.W0 = p0Var;
        String obj = v0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && yu0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        yu0Var.U0 = z10;
        yu0Var.m1(false);
        int i10 = yu0Var.f30368k0[0].F;
        if (i10 == 11) {
            ju0 ju0Var = yu0Var.S;
            if (ju0Var != null) {
                ju0Var.E(yu0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (et0Var = yu0Var.T) != null) {
            org.telegram.ui.co coVar = et0Var.f33375a;
            org.telegram.ui.yk ykVar = coVar.f32410o1;
            if (ykVar != null) {
                ykVar.e(p0Var, true);
            }
            if (TextUtils.isEmpty(coVar.f32476t3) && coVar.f32436q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            coVar.f32463s3 = z11;
            coVar.f32409o0 = z11;
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
        yu0 yu0Var = this.I;
        ls0 ls0Var = yu0Var.J0;
        if (yu0Var.V0 && ((yu0Var.getSelectedTab() == 11 || yu0Var.getSelectedTab() == 12) && ls0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.v0 v0Var = yu0Var.m0;
        if (v0Var != null) {
            if (a() && yu0Var.f30392v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            aj0 aj0Var = v0Var.f19604x;
            if (aj0Var != null && v0Var.f19605y != i11) {
                if (z10) {
                    v0Var.f19605y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(aj0Var, i11);
                } else {
                    v0Var.f19605y = i11;
                    aj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = yu0Var.f30373n0;
        if (v0Var2 != null) {
            if (ls0Var != null && ls0Var.a() && yu0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            v0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
