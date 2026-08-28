package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class aq0 implements org.telegram.ui.Components.wl0 {
    public final eq0 f36537a;

    public aq0(eq0 eq0Var) {
        this.f36537a = eq0Var;
    }

    @Override
    public final void b(int i9, boolean z10) {
        boolean z11;
        eq0 eq0Var = this.f36537a;
        if (eq0Var.f38013n[0].f37291e == i9) {
            return;
        }
        if (i9 == eq0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        eq0Var.f38011e = z11;
        cq0 cq0Var = eq0Var.f38013n[1];
        cq0Var.f37291e = i9;
        cq0Var.setVisibility(0);
        eq0Var.i0(true);
        eq0Var.v = z10;
        if (i9 == 0) {
            eq0Var.f38010c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            eq0Var.f38010c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final boolean k1(int i9, View view) {
        return false;
    }

    @Override
    public final void v0(float f10) {
        eq0 eq0Var = this.f36537a;
        int i9 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i9 != 0 || eq0Var.f38013n[1].getVisibility() == 0) {
            if (eq0Var.v) {
                cq0 cq0Var = eq0Var.f38013n[0];
                cq0Var.setTranslationX((-f10) * cq0Var.getMeasuredWidth());
                cq0[] cq0VarArr = eq0Var.f38013n;
                cq0VarArr[1].setTranslationX(cq0VarArr[0].getMeasuredWidth() - (f10 * eq0Var.f38013n[0].getMeasuredWidth()));
            } else {
                cq0 cq0Var2 = eq0Var.f38013n[0];
                cq0Var2.setTranslationX(cq0Var2.getMeasuredWidth() * f10);
                cq0[] cq0VarArr2 = eq0Var.f38013n;
                cq0VarArr2[1].setTranslationX((f10 * cq0VarArr2[0].getMeasuredWidth()) - eq0Var.f38013n[0].getMeasuredWidth());
            }
            if (i9 == 0) {
                cq0[] cq0VarArr3 = eq0Var.f38013n;
                cq0 cq0Var3 = cq0VarArr3[0];
                cq0VarArr3[0] = cq0VarArr3[1];
                cq0VarArr3[1] = cq0Var3;
                cq0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void p() {
    }
}
