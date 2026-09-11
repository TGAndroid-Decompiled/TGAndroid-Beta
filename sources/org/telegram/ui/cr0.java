package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cr0 implements org.telegram.ui.Components.lm0 {
    public final gr0 f35526a;

    public cr0(gr0 gr0Var) {
        this.f35526a = gr0Var;
    }

    @Override
    public final void D0(float f7) {
        gr0 gr0Var = this.f35526a;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 != 0 || gr0Var.f36757n[1].getVisibility() == 0) {
            if (gr0Var.v) {
                er0 er0Var = gr0Var.f36757n[0];
                er0Var.setTranslationX((-f7) * er0Var.getMeasuredWidth());
                er0[] er0VarArr = gr0Var.f36757n;
                er0VarArr[1].setTranslationX(er0VarArr[0].getMeasuredWidth() - (f7 * gr0Var.f36757n[0].getMeasuredWidth()));
            } else {
                er0 er0Var2 = gr0Var.f36757n[0];
                er0Var2.setTranslationX(er0Var2.getMeasuredWidth() * f7);
                er0[] er0VarArr2 = gr0Var.f36757n;
                er0VarArr2[1].setTranslationX((f7 * er0VarArr2[0].getMeasuredWidth()) - gr0Var.f36757n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                er0[] er0VarArr3 = gr0Var.f36757n;
                er0 er0Var3 = er0VarArr3[0];
                er0VarArr3[0] = er0VarArr3[1];
                er0VarArr3[1] = er0Var3;
                er0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void b(int i10, boolean z10) {
        boolean z11;
        gr0 gr0Var = this.f35526a;
        if (gr0Var.f36757n[0].f36157e == i10) {
            return;
        }
        if (i10 == gr0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        gr0Var.f36755e = z11;
        er0 er0Var = gr0Var.f36757n[1];
        er0Var.f36157e = i10;
        er0Var.setVisibility(0);
        gr0Var.j0(true);
        gr0Var.v = z10;
        if (i10 == 0) {
            gr0Var.f36754c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            gr0Var.f36754c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
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
