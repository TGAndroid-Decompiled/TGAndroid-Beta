package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ht0 extends go0 {
    public final uv0 I;

    public ht0(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, uv0 uv0Var) {
        super(i10, j10, context, n2Var, d6Var);
        this.I = uv0Var;
    }

    @Override
    public final void b(boolean z10) {
        kt0 kt0Var = this.I.I0;
        kt0Var.setAlpha(1.0f - this.E);
        kt0Var.setPivotX(kt0Var.getWidth() / 2.0f);
        kt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        kt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        kt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override
    public final boolean f(ah.i1 i1Var) {
        boolean z10;
        au0 au0Var;
        boolean z11;
        uv0 uv0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = uv0Var.f31052n0;
        if (u0Var == null) {
            return false;
        }
        uv0Var.W0 = i1Var;
        String obj = u0Var.getSearchField().getText().toString();
        if (obj.length() == 0 && uv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        uv0Var.U0 = z10;
        uv0Var.o1(false);
        int i10 = uv0Var.f31047k0[0].F;
        if (i10 == 11) {
            fv0 fv0Var = uv0Var.S;
            if (fv0Var != null) {
                fv0Var.E(uv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (au0Var = uv0Var.T) != null) {
            org.telegram.ui.rn rnVar = au0Var.f41496a;
            org.telegram.ui.qk qkVar = rnVar.f40788o1;
            if (qkVar != null) {
                qkVar.e(i1Var, true);
            }
            if (TextUtils.isEmpty(rnVar.f40852t3) && rnVar.f40812q3 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            rnVar.f40839s3 = z11;
            rnVar.f40787o0 = z11;
            rnVar.mc(false);
            rnVar.Nc();
        }
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        super.h(z10);
        uv0 uv0Var = this.I;
        ht0 ht0Var = uv0Var.J0;
        if (uv0Var.V0 && ((uv0Var.getSelectedTab() == 11 || uv0Var.getSelectedTab() == 12) && ht0Var.a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
        org.telegram.ui.ActionBar.u0 u0Var = uv0Var.m0;
        if (u0Var != null) {
            if (a() && uv0Var.f31071v1.getUserConfig().isPremium()) {
                i11 = R.drawable.navbar_search_tag;
            } else {
                i11 = R.drawable.outline_header_search;
            }
            yj0 yj0Var = u0Var.f21758x;
            if (yj0Var != null && u0Var.f21759y != i11) {
                if (z10) {
                    u0Var.f21759y = i11;
                    AndroidUtilities.updateImageViewImageAnimated(yj0Var, i11);
                } else {
                    u0Var.f21759y = i11;
                    yj0Var.setImageResource(i11);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = uv0Var.f31052n0;
        if (u0Var2 != null) {
            if (ht0Var != null && ht0Var.a() && uv0Var.getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var2.setSearchFieldHint(LocaleController.getString(i10));
        }
    }
}
