package org.telegram.ui;

import android.view.View;
public final class mo0 implements org.telegram.ui.Components.xl0 {
    public final int f39741a;
    public final oo0 f39742b;

    public mo0(oo0 oo0Var, int i10) {
        this.f39741a = i10;
        this.f39742b = oo0Var;
    }

    @Override
    public void E0(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        oo0 oo0Var = this.f39742b;
        if (i10 != 0 || oo0Var.f40353n[1].getVisibility() == 0) {
            if (oo0Var.f40356w) {
                org.telegram.ui.ActionBar.h5 h5Var = oo0Var.f40353n[0];
                h5Var.setTranslationX((-f7) * h5Var.getMeasuredWidth());
                org.telegram.ui.ActionBar.h5[] h5VarArr = oo0Var.f40353n;
                h5VarArr[1].setTranslationX(h5VarArr[0].getMeasuredWidth() - (f7 * oo0Var.f40353n[0].getMeasuredWidth()));
            } else {
                org.telegram.ui.ActionBar.h5 h5Var2 = oo0Var.f40353n[0];
                h5Var2.setTranslationX(h5Var2.getMeasuredWidth() * f7);
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = oo0Var.f40353n;
                h5VarArr2[1].setTranslationX((f7 * h5VarArr2[0].getMeasuredWidth()) - oo0Var.f40353n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                org.telegram.ui.ActionBar.h5[] h5VarArr3 = oo0Var.f40353n;
                org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr3[0];
                h5VarArr3[0] = h5VarArr3[1];
                h5VarArr3[1] = h5Var3;
                h5Var3.setVisibility(8);
            }
        }
    }

    @Override
    public boolean G1(int i10, View view) {
        return false;
    }

    @Override
    public void d(int i10, boolean z10) {
        boolean z11;
        oo0 oo0Var = this.f39742b;
        if (oo0Var.f40353n[0].f20379b == i10) {
            return;
        }
        if (i10 == oo0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        oo0Var.e = z11;
        org.telegram.ui.ActionBar.h5 h5Var = oo0Var.f40353n[1];
        h5Var.f20379b = i10;
        h5Var.setVisibility(0);
        oo0Var.n0(true);
        oo0Var.f40356w = z10;
        if (i10 == 0) {
            oo0Var.f40351c.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745778, null));
        } else {
            oo0Var.f40351c.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745781, null));
        }
    }

    @Override
    public void D() {
    }
}
