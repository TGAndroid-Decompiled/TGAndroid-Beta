package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class sr0 extends um0 {
    public final hu0 E;

    public sr0(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var, hu0 hu0Var) {
        super(i10, j10, context, n2Var, c6Var);
        this.E = hu0Var;
    }

    @Override
    public final void b(boolean z10) {
        vr0 vr0Var = this.E.E0;
        vr0Var.setAlpha(1.0f - this.A);
        vr0Var.setPivotX(vr0Var.getWidth() / 2.0f);
        vr0Var.setScaleX(((1.0f - this.A) * 0.2f) + 0.8f);
        vr0Var.setPivotY(AndroidUtilities.dp(48.0f));
        vr0Var.setScaleY(((1.0f - this.A) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ig.q0 q0Var) {
        ms0 ms0Var;
        hu0 hu0Var = this.E;
        org.telegram.ui.ActionBar.v0 v0Var = hu0Var.f29128j0;
        if (v0Var == null) {
            return false;
        }
        hu0Var.S0 = q0Var;
        String string = v0Var.getSearchField().getText().toString();
        hu0Var.Q0 = (string.length() == 0 && hu0Var.S0 == null) ? false : true;
        hu0Var.m1(false);
        int i10 = hu0Var.f29122g0[0].B;
        if (i10 == 11) {
            st0 st0Var = hu0Var.O;
            if (st0Var != null) {
                st0Var.E(hu0Var.S0, string);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (ms0Var = hu0Var.P) != null) {
            org.telegram.ui.sn snVar = ms0Var.f42977a;
            org.telegram.ui.ok okVar = snVar.f42104k1;
            if (okVar != null) {
                okVar.e(q0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(snVar.f42167p3) && snVar.f42128m3 == null) ? false : true;
            snVar.f42154o3 = z10;
            snVar.f42103k0 = z10;
            snVar.hc(false);
            snVar.Ic();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        super.h(z10);
        hu0 hu0Var = this.E;
        sr0 sr0Var = hu0Var.F0;
        g(hu0Var.R0 && (hu0Var.getSelectedTab() == 11 || hu0Var.getSelectedTab() == 12) && sr0Var.a());
        org.telegram.ui.ActionBar.v0 v0Var = hu0Var.f29126i0;
        if (v0Var != null) {
            int i10 = (a() && hu0Var.f29145r1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            ri0 ri0Var = v0Var.f23877x;
            if (ri0Var != null && v0Var.f23878y != i10) {
                if (z10) {
                    v0Var.f23878y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(ri0Var, i10);
                } else {
                    v0Var.f23878y = i10;
                    ri0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = hu0Var.f29128j0;
        if (v0Var2 != null) {
            v0Var2.setSearchFieldHint(LocaleController.getString((sr0Var != null && sr0Var.a() && hu0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
