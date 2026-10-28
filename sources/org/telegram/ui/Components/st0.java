package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class st0 extends po0 {
    public final bw0 I;

    public st0(int i10, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, bw0 bw0Var) {
        super(i10, j10, context, r2Var, u6Var);
        this.I = bw0Var;
    }

    @Override
    public final void b(boolean z10) {
        vt0 vt0Var = this.I.K0;
        vt0Var.setAlpha(1.0f - this.E);
        vt0Var.setPivotX(vt0Var.getWidth() / 2.0f);
        vt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        vt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        vt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(bh.x0 x0Var) {
        boolean z10;
        gu0 gu0Var;
        boolean z11;
        bw0 bw0Var = this.I;
        org.telegram.ui.ActionBar.w0 w0Var = bw0Var.f26971p0;
        if (w0Var == null) {
            return false;
        }
        bw0Var.Y0 = x0Var;
        String obj = w0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && bw0Var.Y0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        bw0Var.W0 = z10;
        bw0Var.v1(false);
        int i10 = bw0Var.m0[0].E;
        if (i10 == 11) {
            nv0 nv0Var = bw0Var.U;
            if (nv0Var != null) {
                nv0Var.E(bw0Var.Y0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (gu0Var = bw0Var.V) != null) {
            org.telegram.ui.xn xnVar = gu0Var.f46049a;
            org.telegram.ui.uk ukVar = xnVar.A1;
            if (ukVar != null) {
                ukVar.e(x0Var, true);
            }
            if (TextUtils.isEmpty(xnVar.F3) && xnVar.C3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            xnVar.E3 = z11;
            xnVar.f45224o0 = z11;
            xnVar.yc(false);
            xnVar.Zc();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        bw0 bw0Var = this.I;
        st0 st0Var = bw0Var.L0;
        if (bw0Var.X0 && ((bw0Var.getSelectedTab() == 11 || bw0Var.getSelectedTab() == 12) && st0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.w0 w0Var = bw0Var.f26968o0;
        if (w0Var != null) {
            if (a() && bw0Var.f26992x1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            bk0 bk0Var = w0Var.f23205x;
            if (bk0Var != null && w0Var.f23206y != i11) {
                if (z10) {
                    w0Var.f23206y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(bk0Var, i11);
                } else {
                    w0Var.f23206y = i11;
                    bk0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = bw0Var.f26971p0;
        if (w0Var2 != null) {
            if (st0Var != null && st0Var.a() && bw0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
