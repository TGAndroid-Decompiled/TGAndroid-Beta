package org.telegram.ui;

import android.view.View;
public final class ko0 implements org.telegram.ui.Components.yl0 {
    public final int f38949a;
    public final mo0 f38950b;

    public ko0(mo0 mo0Var, int i10) {
        this.f38949a = i10;
        this.f38950b = mo0Var;
    }

    @Override
    public void E0(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        mo0 mo0Var = this.f38950b;
        if (i10 != 0 || mo0Var.f39589n[1].getVisibility() == 0) {
            if (mo0Var.f39592w) {
                org.telegram.ui.ActionBar.h5 h5Var = mo0Var.f39589n[0];
                h5Var.setTranslationX((-f7) * h5Var.getMeasuredWidth());
                org.telegram.ui.ActionBar.h5[] h5VarArr = mo0Var.f39589n;
                h5VarArr[1].setTranslationX(h5VarArr[0].getMeasuredWidth() - (f7 * mo0Var.f39589n[0].getMeasuredWidth()));
            } else {
                org.telegram.ui.ActionBar.h5 h5Var2 = mo0Var.f39589n[0];
                h5Var2.setTranslationX(h5Var2.getMeasuredWidth() * f7);
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = mo0Var.f39589n;
                h5VarArr2[1].setTranslationX((f7 * h5VarArr2[0].getMeasuredWidth()) - mo0Var.f39589n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                org.telegram.ui.ActionBar.h5[] h5VarArr3 = mo0Var.f39589n;
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
        mo0 mo0Var = this.f38950b;
        if (mo0Var.f39589n[0].f20380b == i10) {
            return;
        }
        if (i10 == mo0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        mo0Var.e = z11;
        org.telegram.ui.ActionBar.h5 h5Var = mo0Var.f39589n[1];
        h5Var.f20380b = i10;
        h5Var.setVisibility(0);
        mo0Var.o0(true);
        mo0Var.f39592w = z10;
        if (i10 == 0) {
            mo0Var.f39587c.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745778, null));
        } else {
            mo0Var.f39587c.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745781, null));
        }
    }

    @Override
    public void D() {
    }
}
