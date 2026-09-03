package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nq0 implements org.telegram.ui.Components.tm0 {
    public final rq0 f39443a;

    public nq0(rq0 rq0Var) {
        this.f39443a = rq0Var;
    }

    @Override
    public final void f(int i10, boolean z4) {
        boolean z10;
        rq0 rq0Var = this.f39443a;
        if (rq0Var.f40916n[0].f40106e == i10) {
            return;
        }
        if (i10 == rq0Var.h.getFirstTabId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        rq0Var.f40914e = z10;
        pq0 pq0Var = rq0Var.f40916n[1];
        pq0Var.f40106e = i10;
        pq0Var.setVisibility(0);
        rq0Var.j0(true);
        rq0Var.v = z4;
        if (i10 == 0) {
            rq0Var.f40913c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            rq0Var.f40913c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final boolean j1(int i10, View view) {
        return false;
    }

    @Override
    public final void w0(float f10) {
        rq0 rq0Var = this.f39443a;
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i10 != 0 || rq0Var.f40916n[1].getVisibility() == 0) {
            if (rq0Var.v) {
                pq0 pq0Var = rq0Var.f40916n[0];
                pq0Var.setTranslationX((-f10) * pq0Var.getMeasuredWidth());
                pq0[] pq0VarArr = rq0Var.f40916n;
                pq0VarArr[1].setTranslationX(pq0VarArr[0].getMeasuredWidth() - (f10 * rq0Var.f40916n[0].getMeasuredWidth()));
            } else {
                pq0 pq0Var2 = rq0Var.f40916n[0];
                pq0Var2.setTranslationX(pq0Var2.getMeasuredWidth() * f10);
                pq0[] pq0VarArr2 = rq0Var.f40916n;
                pq0VarArr2[1].setTranslationX((f10 * pq0VarArr2[0].getMeasuredWidth()) - rq0Var.f40916n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                pq0[] pq0VarArr3 = rq0Var.f40916n;
                pq0 pq0Var3 = pq0VarArr3[0];
                pq0VarArr3[0] = pq0VarArr3[1];
                pq0VarArr3[1] = pq0Var3;
                pq0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void B() {
    }
}
