package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mq0 implements org.telegram.ui.Components.mn0 {
    public final qq0 f39642a;

    public mq0(qq0 qq0Var) {
        this.f39642a = qq0Var;
    }

    @Override
    public final boolean b1(int i10, View view) {
        return false;
    }

    @Override
    public final void d(int i10, boolean z10) {
        boolean z11;
        qq0 qq0Var = this.f39642a;
        if (qq0Var.f40924n[0].e == i10) {
            return;
        }
        if (i10 == qq0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        qq0Var.e = z11;
        oq0 oq0Var = qq0Var.f40924n[1];
        oq0Var.e = i10;
        oq0Var.setVisibility(0);
        qq0Var.j0(true);
        qq0Var.v = z10;
        if (i10 == 0) {
            qq0Var.f40922c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            qq0Var.f40922c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final void k0(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        qq0 qq0Var = this.f39642a;
        if (i10 != 0 || qq0Var.f40924n[1].getVisibility() == 0) {
            if (qq0Var.v) {
                oq0 oq0Var = qq0Var.f40924n[0];
                oq0Var.setTranslationX((-f7) * oq0Var.getMeasuredWidth());
                oq0[] oq0VarArr = qq0Var.f40924n;
                oq0VarArr[1].setTranslationX(oq0VarArr[0].getMeasuredWidth() - (f7 * qq0Var.f40924n[0].getMeasuredWidth()));
            } else {
                oq0 oq0Var2 = qq0Var.f40924n[0];
                oq0Var2.setTranslationX(oq0Var2.getMeasuredWidth() * f7);
                oq0[] oq0VarArr2 = qq0Var.f40924n;
                oq0VarArr2[1].setTranslationX((f7 * oq0VarArr2[0].getMeasuredWidth()) - qq0Var.f40924n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                oq0[] oq0VarArr3 = qq0Var.f40924n;
                oq0 oq0Var3 = oq0VarArr3[0];
                oq0VarArr3[0] = oq0VarArr3[1];
                oq0VarArr3[1] = oq0Var3;
                oq0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void x() {
    }
}
