package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kq0 implements org.telegram.ui.Components.jn0 {
    public final oq0 f38650a;

    public kq0(oq0 oq0Var) {
        this.f38650a = oq0Var;
    }

    @Override
    public final boolean b1(int i10, View view) {
        return false;
    }

    @Override
    public final void f(int i10, boolean z10) {
        boolean z11;
        oq0 oq0Var = this.f38650a;
        if (oq0Var.f39967n[0].e == i10) {
            return;
        }
        if (i10 == oq0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        oq0Var.e = z11;
        mq0 mq0Var = oq0Var.f39967n[1];
        mq0Var.e = i10;
        mq0Var.setVisibility(0);
        oq0Var.j0(true);
        oq0Var.v = z10;
        if (i10 == 0) {
            oq0Var.f39965c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            oq0Var.f39965c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final void k0(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        oq0 oq0Var = this.f38650a;
        if (i10 != 0 || oq0Var.f39967n[1].getVisibility() == 0) {
            if (oq0Var.v) {
                mq0 mq0Var = oq0Var.f39967n[0];
                mq0Var.setTranslationX((-f7) * mq0Var.getMeasuredWidth());
                mq0[] mq0VarArr = oq0Var.f39967n;
                mq0VarArr[1].setTranslationX(mq0VarArr[0].getMeasuredWidth() - (f7 * oq0Var.f39967n[0].getMeasuredWidth()));
            } else {
                mq0 mq0Var2 = oq0Var.f39967n[0];
                mq0Var2.setTranslationX(mq0Var2.getMeasuredWidth() * f7);
                mq0[] mq0VarArr2 = oq0Var.f39967n;
                mq0VarArr2[1].setTranslationX((f7 * mq0VarArr2[0].getMeasuredWidth()) - oq0Var.f39967n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                mq0[] mq0VarArr3 = oq0Var.f39967n;
                mq0 mq0Var3 = mq0VarArr3[0];
                mq0VarArr3[0] = mq0VarArr3[1];
                mq0VarArr3[1] = mq0Var3;
                mq0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void x() {
    }
}
