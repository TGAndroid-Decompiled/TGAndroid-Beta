package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nq0 implements org.telegram.ui.Components.nn0 {
    public final rq0 f39970a;

    public nq0(rq0 rq0Var) {
        this.f39970a = rq0Var;
    }

    @Override
    public final boolean b1(int i10, View view) {
        return false;
    }

    @Override
    public final void d(int i10, boolean z10) {
        boolean z11;
        rq0 rq0Var = this.f39970a;
        if (rq0Var.f41227n[0].e == i10) {
            return;
        }
        if (i10 == rq0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        rq0Var.e = z11;
        pq0 pq0Var = rq0Var.f41227n[1];
        pq0Var.e = i10;
        pq0Var.setVisibility(0);
        rq0Var.j0(true);
        rq0Var.v = z10;
        if (i10 == 0) {
            rq0Var.f41225c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            rq0Var.f41225c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final void k0(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        rq0 rq0Var = this.f39970a;
        if (i10 != 0 || rq0Var.f41227n[1].getVisibility() == 0) {
            if (rq0Var.v) {
                pq0 pq0Var = rq0Var.f41227n[0];
                pq0Var.setTranslationX((-f7) * pq0Var.getMeasuredWidth());
                pq0[] pq0VarArr = rq0Var.f41227n;
                pq0VarArr[1].setTranslationX(pq0VarArr[0].getMeasuredWidth() - (f7 * rq0Var.f41227n[0].getMeasuredWidth()));
            } else {
                pq0 pq0Var2 = rq0Var.f41227n[0];
                pq0Var2.setTranslationX(pq0Var2.getMeasuredWidth() * f7);
                pq0[] pq0VarArr2 = rq0Var.f41227n;
                pq0VarArr2[1].setTranslationX((f7 * pq0VarArr2[0].getMeasuredWidth()) - rq0Var.f41227n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                pq0[] pq0VarArr3 = rq0Var.f41227n;
                pq0 pq0Var3 = pq0VarArr3[0];
                pq0VarArr3[0] = pq0VarArr3[1];
                pq0VarArr3[1] = pq0Var3;
                pq0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void x() {
    }
}
