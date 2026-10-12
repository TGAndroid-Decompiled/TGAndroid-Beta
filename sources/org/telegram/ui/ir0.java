package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ir0 implements org.telegram.ui.Components.nn0 {
    public final mr0 f37197a;

    public ir0(mr0 mr0Var) {
        this.f37197a = mr0Var;
    }

    @Override
    public final void B0(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        mr0 mr0Var = this.f37197a;
        if (i10 != 0 || mr0Var.f38322n[1].getVisibility() == 0) {
            if (mr0Var.v) {
                kr0 kr0Var = mr0Var.f38322n[0];
                kr0Var.setTranslationX((-f7) * kr0Var.getMeasuredWidth());
                kr0[] kr0VarArr = mr0Var.f38322n;
                kr0VarArr[1].setTranslationX(kr0VarArr[0].getMeasuredWidth() - (f7 * mr0Var.f38322n[0].getMeasuredWidth()));
            } else {
                kr0 kr0Var2 = mr0Var.f38322n[0];
                kr0Var2.setTranslationX(kr0Var2.getMeasuredWidth() * f7);
                kr0[] kr0VarArr2 = mr0Var.f38322n;
                kr0VarArr2[1].setTranslationX((f7 * kr0VarArr2[0].getMeasuredWidth()) - mr0Var.f38322n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                kr0[] kr0VarArr3 = mr0Var.f38322n;
                kr0 kr0Var3 = kr0VarArr3[0];
                kr0VarArr3[0] = kr0VarArr3[1];
                kr0VarArr3[1] = kr0Var3;
                kr0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void e(int i10, boolean z10) {
        boolean z11;
        mr0 mr0Var = this.f37197a;
        if (mr0Var.f38322n[0].e == i10) {
            return;
        }
        if (i10 == mr0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        mr0Var.e = z11;
        kr0 kr0Var = mr0Var.f38322n[1];
        kr0Var.e = i10;
        kr0Var.setVisibility(0);
        mr0Var.j0(true);
        mr0Var.v = z10;
        if (i10 == 0) {
            mr0Var.f38320c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            mr0Var.f38320c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final boolean n1(int i10, View view) {
        return false;
    }

    @Override
    public final void C() {
    }
}
