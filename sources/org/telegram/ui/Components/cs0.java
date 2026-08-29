package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cs0 extends en0 {
    public final qu0 E;

    public cs0(int i10, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var, qu0 qu0Var) {
        super(i10, j10, context, o2Var, c6Var);
        this.E = qu0Var;
    }

    @Override
    public final void b(boolean z10) {
        fs0 fs0Var = this.E.E0;
        fs0Var.setAlpha(1.0f - this.A);
        fs0Var.setPivotX(fs0Var.getWidth() / 2.0f);
        fs0Var.setScaleX(((1.0f - this.A) * 0.2f) + 0.8f);
        fs0Var.setPivotY(AndroidUtilities.dp(48.0f));
        fs0Var.setScaleY(((1.0f - this.A) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(kg.q0 q0Var) {
        boolean z10;
        vs0 vs0Var;
        boolean z11;
        qu0 qu0Var = this.E;
        org.telegram.ui.ActionBar.w0 w0Var = qu0Var.f32076j0;
        if (w0Var == null) {
            return false;
        }
        qu0Var.S0 = q0Var;
        String obj = w0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && qu0Var.S0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        qu0Var.Q0 = z10;
        qu0Var.m1(false);
        int i10 = qu0Var.f32070g0[0].B;
        if (i10 == 11) {
            bu0 bu0Var = qu0Var.O;
            if (bu0Var != null) {
                bu0Var.E(qu0Var.S0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (vs0Var = qu0Var.P) != null) {
            org.telegram.ui.un unVar = vs0Var.f43683a;
            org.telegram.ui.pk pkVar = unVar.f42865k1;
            if (pkVar != null) {
                pkVar.e(q0Var, true);
            }
            if (TextUtils.isEmpty(unVar.f42927p3) && unVar.f42889m3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            unVar.f42915o3 = z11;
            unVar.f42864k0 = z11;
            unVar.hc(false);
            unVar.Ic();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        qu0 qu0Var = this.E;
        cs0 cs0Var = qu0Var.F0;
        if (qu0Var.R0 && ((qu0Var.getSelectedTab() == 11 || qu0Var.getSelectedTab() == 12) && cs0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.w0 w0Var = qu0Var.f32074i0;
        if (w0Var != null) {
            if (a() && qu0Var.f32093r1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            aj0 aj0Var = w0Var.f23938x;
            if (aj0Var != null && w0Var.f23939y != i11) {
                if (z10) {
                    w0Var.f23939y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(aj0Var, i11);
                } else {
                    w0Var.f23939y = i11;
                    aj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = qu0Var.f32076j0;
        if (w0Var2 != null) {
            if (cs0Var != null && cs0Var.a() && qu0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
