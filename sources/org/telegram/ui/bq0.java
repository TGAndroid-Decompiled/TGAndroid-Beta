package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class bq0 implements org.telegram.ui.Components.zl0 {

    public final fq0 f36868a;

    public bq0(fq0 fq0Var) {
        this.f36868a = fq0Var;
    }

    @Override
    public final void b(int i10, boolean z10) {
        fq0 fq0Var = this.f36868a;
        if (fq0Var.f38190n[0].f37529e == i10) {
            return;
        }
        fq0Var.f38188e = i10 == fq0Var.h.getFirstTabId();
        dq0 dq0Var = fq0Var.f38190n[1];
        dq0Var.f37529e = i10;
        dq0Var.setVisibility(0);
        fq0Var.j0(true);
        fq0Var.v = z10;
        if (i10 == 0) {
            fq0Var.f38187c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            fq0Var.f38187c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final boolean l1(int i10, View view) {
        return false;
    }

    @Override
    public final void o0(float f10) {
        fq0 fq0Var = this.f36868a;
        if (f10 != 1.0f || fq0Var.f38190n[1].getVisibility() == 0) {
            if (fq0Var.v) {
                dq0 dq0Var = fq0Var.f38190n[0];
                dq0Var.setTranslationX((-f10) * dq0Var.getMeasuredWidth());
                dq0[] dq0VarArr = fq0Var.f38190n;
                dq0VarArr[1].setTranslationX(dq0VarArr[0].getMeasuredWidth() - (f10 * fq0Var.f38190n[0].getMeasuredWidth()));
            } else {
                dq0 dq0Var2 = fq0Var.f38190n[0];
                dq0Var2.setTranslationX(dq0Var2.getMeasuredWidth() * f10);
                dq0[] dq0VarArr2 = fq0Var.f38190n;
                dq0VarArr2[1].setTranslationX((f10 * dq0VarArr2[0].getMeasuredWidth()) - fq0Var.f38190n[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                dq0[] dq0VarArr3 = fq0Var.f38190n;
                dq0 dq0Var3 = dq0VarArr3[0];
                dq0VarArr3[0] = dq0VarArr3[1];
                dq0VarArr3[1] = dq0Var3;
                dq0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void w() {
    }
}
