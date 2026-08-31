package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class iq0 implements org.telegram.ui.Components.um0 {
    public final mq0 f37918a;

    public iq0(mq0 mq0Var) {
        this.f37918a = mq0Var;
    }

    @Override
    public final void f(int i10, boolean z4) {
        boolean z10;
        mq0 mq0Var = this.f37918a;
        if (mq0Var.f39204n[0].f38494e == i10) {
            return;
        }
        if (i10 == mq0Var.h.getFirstTabId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        mq0Var.f39202e = z10;
        kq0 kq0Var = mq0Var.f39204n[1];
        kq0Var.f38494e = i10;
        kq0Var.setVisibility(0);
        mq0Var.j0(true);
        mq0Var.v = z4;
        if (i10 == 0) {
            mq0Var.f39201c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            mq0Var.f39201c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final boolean j1(int i10, View view) {
        return false;
    }

    @Override
    public final void w0(float f10) {
        mq0 mq0Var = this.f37918a;
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i10 != 0 || mq0Var.f39204n[1].getVisibility() == 0) {
            if (mq0Var.v) {
                kq0 kq0Var = mq0Var.f39204n[0];
                kq0Var.setTranslationX((-f10) * kq0Var.getMeasuredWidth());
                kq0[] kq0VarArr = mq0Var.f39204n;
                kq0VarArr[1].setTranslationX(kq0VarArr[0].getMeasuredWidth() - (f10 * mq0Var.f39204n[0].getMeasuredWidth()));
            } else {
                kq0 kq0Var2 = mq0Var.f39204n[0];
                kq0Var2.setTranslationX(kq0Var2.getMeasuredWidth() * f10);
                kq0[] kq0VarArr2 = mq0Var.f39204n;
                kq0VarArr2[1].setTranslationX((f10 * kq0VarArr2[0].getMeasuredWidth()) - mq0Var.f39204n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                kq0[] kq0VarArr3 = mq0Var.f39204n;
                kq0 kq0Var3 = kq0VarArr3[0];
                kq0VarArr3[0] = kq0VarArr3[1];
                kq0VarArr3[1] = kq0Var3;
                kq0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void B() {
    }
}
