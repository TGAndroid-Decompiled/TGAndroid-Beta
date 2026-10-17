package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lq0 implements org.telegram.ui.Components.jn0 {
    public final pq0 f38919a;

    public lq0(pq0 pq0Var) {
        this.f38919a = pq0Var;
    }

    @Override
    public final boolean b1(int i10, View view) {
        return false;
    }

    @Override
    public final void f(int i10, boolean z10) {
        boolean z11;
        pq0 pq0Var = this.f38919a;
        if (pq0Var.f40223n[0].e == i10) {
            return;
        }
        if (i10 == pq0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        pq0Var.e = z11;
        nq0 nq0Var = pq0Var.f40223n[1];
        nq0Var.e = i10;
        nq0Var.setVisibility(0);
        pq0Var.j0(true);
        pq0Var.v = z10;
        if (i10 == 0) {
            pq0Var.f40221c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            pq0Var.f40221c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final void k0(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        pq0 pq0Var = this.f38919a;
        if (i10 != 0 || pq0Var.f40223n[1].getVisibility() == 0) {
            if (pq0Var.v) {
                nq0 nq0Var = pq0Var.f40223n[0];
                nq0Var.setTranslationX((-f7) * nq0Var.getMeasuredWidth());
                nq0[] nq0VarArr = pq0Var.f40223n;
                nq0VarArr[1].setTranslationX(nq0VarArr[0].getMeasuredWidth() - (f7 * pq0Var.f40223n[0].getMeasuredWidth()));
            } else {
                nq0 nq0Var2 = pq0Var.f40223n[0];
                nq0Var2.setTranslationX(nq0Var2.getMeasuredWidth() * f7);
                nq0[] nq0VarArr2 = pq0Var.f40223n;
                nq0VarArr2[1].setTranslationX((f7 * nq0VarArr2[0].getMeasuredWidth()) - pq0Var.f40223n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                nq0[] nq0VarArr3 = pq0Var.f40223n;
                nq0 nq0Var3 = nq0VarArr3[0];
                nq0VarArr3[0] = nq0VarArr3[1];
                nq0VarArr3[1] = nq0Var3;
                nq0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void x() {
    }
}
