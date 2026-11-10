package org.telegram.ui;

import android.view.View;
public final class bn0 implements org.telegram.ui.Components.uk0 {
    public final int f44089a;
    public final dn0 f44090b;

    public bn0(dn0 dn0Var, int i7) {
        this.f44089a = i7;
        this.f44090b = dn0Var;
    }

    @Override
    public void F0(float f10) {
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        dn0 dn0Var = this.f44090b;
        if (i7 != 0 || dn0Var.f45019n[1].getVisibility() == 0) {
            if (dn0Var.f45022w) {
                org.telegram.ui.ActionBar.y4 y4Var = dn0Var.f45019n[0];
                y4Var.setTranslationX((-f10) * y4Var.getMeasuredWidth());
                org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.f45019n;
                y4VarArr[1].setTranslationX(y4VarArr[0].getMeasuredWidth() - (f10 * dn0Var.f45019n[0].getMeasuredWidth()));
            } else {
                org.telegram.ui.ActionBar.y4 y4Var2 = dn0Var.f45019n[0];
                y4Var2.setTranslationX(y4Var2.getMeasuredWidth() * f10);
                org.telegram.ui.ActionBar.y4[] y4VarArr2 = dn0Var.f45019n;
                y4VarArr2[1].setTranslationX((f10 * y4VarArr2[0].getMeasuredWidth()) - dn0Var.f45019n[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                org.telegram.ui.ActionBar.y4[] y4VarArr3 = dn0Var.f45019n;
                org.telegram.ui.ActionBar.y4 y4Var3 = y4VarArr3[0];
                y4VarArr3[0] = y4VarArr3[1];
                y4VarArr3[1] = y4Var3;
                y4Var3.setVisibility(8);
            }
        }
    }

    @Override
    public void b(int i7, boolean z9) {
        boolean z10;
        dn0 dn0Var = this.f44090b;
        if (dn0Var.f45019n[0].f28791b == i7) {
            return;
        }
        if (i7 == dn0Var.h.getFirstTabId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        dn0Var.f45017e = z10;
        org.telegram.ui.ActionBar.y4 y4Var = dn0Var.f45019n[1];
        y4Var.f28791b = i7;
        y4Var.setVisibility(0);
        dn0Var.o0(true);
        dn0Var.f45022w = z9;
        if (i7 == 0) {
            dn0Var.f45016c.setSearchFieldHint(org.telegram.messenger.id.M0(2131745761, null));
        } else {
            dn0Var.f45016c.setSearchFieldHint(org.telegram.messenger.id.M0(2131745764, null));
        }
    }

    @Override
    public boolean m1(int i7, View view) {
        return false;
    }

    @Override
    public void c() {
    }
}
