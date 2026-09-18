package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dr0 implements org.telegram.ui.Components.mm0 {
    public final ir0 f33218a;

    public dr0(ir0 ir0Var) {
        this.f33218a = ir0Var;
    }

    @Override
    public final void C0(float f7) {
        ir0 ir0Var = this.f33218a;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 != 0 || ir0Var.f34666n[1].getVisibility() == 0) {
            if (ir0Var.v) {
                gr0 gr0Var = ir0Var.f34666n[0];
                gr0Var.setTranslationX((-f7) * gr0Var.getMeasuredWidth());
                gr0[] gr0VarArr = ir0Var.f34666n;
                gr0VarArr[1].setTranslationX(gr0VarArr[0].getMeasuredWidth() - (f7 * ir0Var.f34666n[0].getMeasuredWidth()));
            } else {
                gr0 gr0Var2 = ir0Var.f34666n[0];
                gr0Var2.setTranslationX(gr0Var2.getMeasuredWidth() * f7);
                gr0[] gr0VarArr2 = ir0Var.f34666n;
                gr0VarArr2[1].setTranslationX((f7 * gr0VarArr2[0].getMeasuredWidth()) - ir0Var.f34666n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                gr0[] gr0VarArr3 = ir0Var.f34666n;
                gr0 gr0Var3 = gr0VarArr3[0];
                gr0VarArr3[0] = gr0VarArr3[1];
                gr0VarArr3[1] = gr0Var3;
                gr0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void d(int i10, boolean z10) {
        boolean z11;
        ir0 ir0Var = this.f33218a;
        if (ir0Var.f34666n[0].e == i10) {
            return;
        }
        if (i10 == ir0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ir0Var.e = z11;
        gr0 gr0Var = ir0Var.f34666n[1];
        gr0Var.e = i10;
        gr0Var.setVisibility(0);
        ir0Var.j0(true);
        ir0Var.v = z10;
        if (i10 == 0) {
            ir0Var.f34664c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            ir0Var.f34664c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
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
