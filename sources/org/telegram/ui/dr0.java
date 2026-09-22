package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dr0 implements org.telegram.ui.Components.zm0 {
    public final hr0 f33141a;

    public dr0(hr0 hr0Var) {
        this.f33141a = hr0Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        boolean z11;
        hr0 hr0Var = this.f33141a;
        if (hr0Var.f34287n[0].e == i10) {
            return;
        }
        if (i10 == hr0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        hr0Var.e = z11;
        fr0 fr0Var = hr0Var.f34287n[1];
        fr0Var.e = i10;
        fr0Var.setVisibility(0);
        hr0Var.j0(true);
        hr0Var.v = z10;
        if (i10 == 0) {
            hr0Var.f34285c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            hr0Var.f34285c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final boolean m1(int i10, View view) {
        return false;
    }

    @Override
    public final void y0(float f7) {
        hr0 hr0Var = this.f33141a;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 != 0 || hr0Var.f34287n[1].getVisibility() == 0) {
            if (hr0Var.v) {
                fr0 fr0Var = hr0Var.f34287n[0];
                fr0Var.setTranslationX((-f7) * fr0Var.getMeasuredWidth());
                fr0[] fr0VarArr = hr0Var.f34287n;
                fr0VarArr[1].setTranslationX(fr0VarArr[0].getMeasuredWidth() - (f7 * hr0Var.f34287n[0].getMeasuredWidth()));
            } else {
                fr0 fr0Var2 = hr0Var.f34287n[0];
                fr0Var2.setTranslationX(fr0Var2.getMeasuredWidth() * f7);
                fr0[] fr0VarArr2 = hr0Var.f34287n;
                fr0VarArr2[1].setTranslationX((f7 * fr0VarArr2[0].getMeasuredWidth()) - hr0Var.f34287n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                fr0[] fr0VarArr3 = hr0Var.f34287n;
                fr0 fr0Var3 = fr0VarArr3[0];
                fr0VarArr3[0] = fr0VarArr3[1];
                fr0VarArr3[1] = fr0Var3;
                fr0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void C() {
    }
}
