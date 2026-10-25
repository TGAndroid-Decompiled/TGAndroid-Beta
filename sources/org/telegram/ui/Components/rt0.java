package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rt0 extends oo0 {
    public final aw0 I;

    public rt0(int i10, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, aw0 aw0Var) {
        super(i10, j10, context, r2Var, u6Var);
        this.I = aw0Var;
    }

    @Override
    public final void b(boolean z10) {
        ut0 ut0Var = this.I.K0;
        ut0Var.setAlpha(1.0f - this.E);
        ut0Var.setPivotX(ut0Var.getWidth() / 2.0f);
        ut0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        ut0Var.setPivotY(AndroidUtilities.dp(48.0f));
        ut0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(bh.x0 x0Var) {
        boolean z10;
        fu0 fu0Var;
        boolean z11;
        aw0 aw0Var = this.I;
        org.telegram.ui.ActionBar.w0 w0Var = aw0Var.f26681p0;
        if (w0Var == null) {
            return false;
        }
        aw0Var.Y0 = x0Var;
        String obj = w0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && aw0Var.Y0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        aw0Var.W0 = z10;
        aw0Var.v1(false);
        int i10 = aw0Var.m0[0].E;
        if (i10 == 11) {
            mv0 mv0Var = aw0Var.U;
            if (mv0Var != null) {
                mv0Var.E(aw0Var.Y0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (fu0Var = aw0Var.V) != null) {
            org.telegram.ui.vn vnVar = fu0Var.f45518a;
            org.telegram.ui.sk skVar = vnVar.A1;
            if (skVar != null) {
                skVar.e(x0Var, true);
            }
            if (TextUtils.isEmpty(vnVar.F3) && vnVar.C3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            vnVar.E3 = z11;
            vnVar.f44353o0 = z11;
            vnVar.uc(false);
            vnVar.Vc();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        aw0 aw0Var = this.I;
        rt0 rt0Var = aw0Var.L0;
        if (aw0Var.X0 && ((aw0Var.getSelectedTab() == 11 || aw0Var.getSelectedTab() == 12) && rt0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.w0 w0Var = aw0Var.f26678o0;
        if (w0Var != null) {
            if (a() && aw0Var.f26702x1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            ak0 ak0Var = w0Var.f23202x;
            if (ak0Var != null && w0Var.f23203y != i11) {
                if (z10) {
                    w0Var.f23203y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(ak0Var, i11);
                } else {
                    w0Var.f23203y = i11;
                    ak0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = aw0Var.f26681p0;
        if (w0Var2 != null) {
            if (rt0Var != null && rt0Var.a() && aw0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
