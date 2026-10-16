package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gr0 implements org.telegram.ui.Components.nn0 {
    public final kr0 f36297a;

    public gr0(kr0 kr0Var) {
        this.f36297a = kr0Var;
    }

    @Override
    public final void f(int i10, boolean z10) {
        boolean z11;
        kr0 kr0Var = this.f36297a;
        if (kr0Var.f37495n[0].e == i10) {
            return;
        }
        if (i10 == kr0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        kr0Var.e = z11;
        ir0 ir0Var = kr0Var.f37495n[1];
        ir0Var.e = i10;
        ir0Var.setVisibility(0);
        kr0Var.j0(true);
        kr0Var.v = z10;
        if (i10 == 0) {
            kr0Var.f37493c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            kr0Var.f37493c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final boolean n1(int i10, View view) {
        return false;
    }

    @Override
    public final void w0(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        kr0 kr0Var = this.f36297a;
        if (i10 != 0 || kr0Var.f37495n[1].getVisibility() == 0) {
            if (kr0Var.v) {
                ir0 ir0Var = kr0Var.f37495n[0];
                ir0Var.setTranslationX((-f7) * ir0Var.getMeasuredWidth());
                ir0[] ir0VarArr = kr0Var.f37495n;
                ir0VarArr[1].setTranslationX(ir0VarArr[0].getMeasuredWidth() - (f7 * kr0Var.f37495n[0].getMeasuredWidth()));
            } else {
                ir0 ir0Var2 = kr0Var.f37495n[0];
                ir0Var2.setTranslationX(ir0Var2.getMeasuredWidth() * f7);
                ir0[] ir0VarArr2 = kr0Var.f37495n;
                ir0VarArr2[1].setTranslationX((f7 * ir0VarArr2[0].getMeasuredWidth()) - kr0Var.f37495n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                ir0[] ir0VarArr3 = kr0Var.f37495n;
                ir0 ir0Var3 = ir0VarArr3[0];
                ir0VarArr3[0] = ir0VarArr3[1];
                ir0VarArr3[1] = ir0Var3;
                ir0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void A() {
    }
}
