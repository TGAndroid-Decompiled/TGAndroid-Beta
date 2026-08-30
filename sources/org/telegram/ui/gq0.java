package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gq0 implements org.telegram.ui.Components.tm0 {
    public final kq0 f34663a;

    public gq0(kq0 kq0Var) {
        this.f34663a = kq0Var;
    }

    @Override
    public final void f(int i10, boolean z4) {
        boolean z10;
        kq0 kq0Var = this.f34663a;
        if (kq0Var.f35792n[0].e == i10) {
            return;
        }
        if (i10 == kq0Var.h.getFirstTabId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        kq0Var.e = z10;
        iq0 iq0Var = kq0Var.f35792n[1];
        iq0Var.e = i10;
        iq0Var.setVisibility(0);
        kq0Var.j0(true);
        kq0Var.v = z4;
        if (i10 == 0) {
            kq0Var.f35790c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            kq0Var.f35790c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final boolean m1(int i10, View view) {
        return false;
    }

    @Override
    public final void v0(float f10) {
        kq0 kq0Var = this.f34663a;
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i10 != 0 || kq0Var.f35792n[1].getVisibility() == 0) {
            if (kq0Var.v) {
                iq0 iq0Var = kq0Var.f35792n[0];
                iq0Var.setTranslationX((-f10) * iq0Var.getMeasuredWidth());
                iq0[] iq0VarArr = kq0Var.f35792n;
                iq0VarArr[1].setTranslationX(iq0VarArr[0].getMeasuredWidth() - (f10 * kq0Var.f35792n[0].getMeasuredWidth()));
            } else {
                iq0 iq0Var2 = kq0Var.f35792n[0];
                iq0Var2.setTranslationX(iq0Var2.getMeasuredWidth() * f10);
                iq0[] iq0VarArr2 = kq0Var.f35792n;
                iq0VarArr2[1].setTranslationX((f10 * iq0VarArr2[0].getMeasuredWidth()) - kq0Var.f35792n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                iq0[] iq0VarArr3 = kq0Var.f35792n;
                iq0 iq0Var3 = iq0VarArr3[0];
                iq0VarArr3[0] = iq0VarArr3[1];
                iq0VarArr3[1] = iq0Var3;
                iq0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void C() {
    }
}
