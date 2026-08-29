package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class aq0 implements org.telegram.ui.Components.jm0 {
    public final eq0 f36585a;

    public aq0(eq0 eq0Var) {
        this.f36585a = eq0Var;
    }

    @Override
    public final void e(int i10, boolean z10) {
        boolean z11;
        eq0 eq0Var = this.f36585a;
        if (eq0Var.f37891n[0].f37196e == i10) {
            return;
        }
        if (i10 == eq0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        eq0Var.f37889e = z11;
        cq0 cq0Var = eq0Var.f37891n[1];
        cq0Var.f37196e = i10;
        cq0Var.setVisibility(0);
        eq0Var.j0(true);
        eq0Var.v = z10;
        if (i10 == 0) {
            eq0Var.f37888c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            eq0Var.f37888c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final boolean i1(int i10, View view) {
        return false;
    }

    @Override
    public final void u0(float f9) {
        eq0 eq0Var = this.f36585a;
        int i10 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
        if (i10 != 0 || eq0Var.f37891n[1].getVisibility() == 0) {
            if (eq0Var.v) {
                cq0 cq0Var = eq0Var.f37891n[0];
                cq0Var.setTranslationX((-f9) * cq0Var.getMeasuredWidth());
                cq0[] cq0VarArr = eq0Var.f37891n;
                cq0VarArr[1].setTranslationX(cq0VarArr[0].getMeasuredWidth() - (f9 * eq0Var.f37891n[0].getMeasuredWidth()));
            } else {
                cq0 cq0Var2 = eq0Var.f37891n[0];
                cq0Var2.setTranslationX(cq0Var2.getMeasuredWidth() * f9);
                cq0[] cq0VarArr2 = eq0Var.f37891n;
                cq0VarArr2[1].setTranslationX((f9 * cq0VarArr2[0].getMeasuredWidth()) - eq0Var.f37891n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                cq0[] cq0VarArr3 = eq0Var.f37891n;
                cq0 cq0Var3 = cq0VarArr3[0];
                cq0VarArr3[0] = cq0VarArr3[1];
                cq0VarArr3[1] = cq0Var3;
                cq0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void x() {
    }
}
