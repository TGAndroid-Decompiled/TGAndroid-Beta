package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class br0 implements org.telegram.ui.Components.tn0 {
    public final fr0 f36445a;

    public br0(fr0 fr0Var) {
        this.f36445a = fr0Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        boolean z11;
        fr0 fr0Var = this.f36445a;
        if (fr0Var.f37751n[0].f37075e == i10) {
            return;
        }
        if (i10 == fr0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        fr0Var.f37749e = z11;
        dr0 dr0Var = fr0Var.f37751n[1];
        dr0Var.f37075e = i10;
        dr0Var.setVisibility(0);
        fr0Var.j0(true);
        fr0Var.v = z10;
        if (i10 == 0) {
            fr0Var.f37748c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            fr0Var.f37748c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final boolean k1(int i10, View view) {
        return false;
    }

    @Override
    public final void u0(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        fr0 fr0Var = this.f36445a;
        if (i10 != 0 || fr0Var.f37751n[1].getVisibility() == 0) {
            if (fr0Var.v) {
                dr0 dr0Var = fr0Var.f37751n[0];
                dr0Var.setTranslationX((-f7) * dr0Var.getMeasuredWidth());
                dr0[] dr0VarArr = fr0Var.f37751n;
                dr0VarArr[1].setTranslationX(dr0VarArr[0].getMeasuredWidth() - (f7 * fr0Var.f37751n[0].getMeasuredWidth()));
            } else {
                dr0 dr0Var2 = fr0Var.f37751n[0];
                dr0Var2.setTranslationX(dr0Var2.getMeasuredWidth() * f7);
                dr0[] dr0VarArr2 = fr0Var.f37751n;
                dr0VarArr2[1].setTranslationX((f7 * dr0VarArr2[0].getMeasuredWidth()) - fr0Var.f37751n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                dr0[] dr0VarArr3 = fr0Var.f37751n;
                dr0 dr0Var3 = dr0VarArr3[0];
                dr0VarArr3[0] = dr0VarArr3[1];
                dr0VarArr3[1] = dr0Var3;
                dr0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void C() {
    }
}
