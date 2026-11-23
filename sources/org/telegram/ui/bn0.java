package org.telegram.ui;

import android.view.View;
public final class bn0 implements org.telegram.ui.Components.jl0 {
    public final int f46456a;
    public final dn0 f46457b;

    public bn0(dn0 dn0Var, int i7) {
        this.f46456a = i7;
        this.f46457b = dn0Var;
    }

    @Override
    public boolean Y0(int i7, View view) {
        return false;
    }

    @Override
    public void a(int i7, boolean z10) {
        boolean z11;
        dn0 dn0Var = this.f46457b;
        if (dn0Var.f47200n[0].f30360b == i7) {
            return;
        }
        if (i7 == dn0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        dn0Var.f47198e = z11;
        org.telegram.ui.ActionBar.y4 y4Var = dn0Var.f47200n[1];
        y4Var.f30360b = i7;
        y4Var.setVisibility(0);
        dn0Var.o0(true);
        dn0Var.f47203w = z10;
        if (i7 == 0) {
            dn0Var.f47197c.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745565, null));
        } else {
            dn0Var.f47197c.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745568, null));
        }
    }

    @Override
    public void c(float f10) {
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        dn0 dn0Var = this.f46457b;
        if (i7 != 0 || dn0Var.f47200n[1].getVisibility() == 0) {
            if (dn0Var.f47203w) {
                org.telegram.ui.ActionBar.y4 y4Var = dn0Var.f47200n[0];
                y4Var.setTranslationX((-f10) * y4Var.getMeasuredWidth());
                org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.f47200n;
                y4VarArr[1].setTranslationX(y4VarArr[0].getMeasuredWidth() - (f10 * dn0Var.f47200n[0].getMeasuredWidth()));
            } else {
                org.telegram.ui.ActionBar.y4 y4Var2 = dn0Var.f47200n[0];
                y4Var2.setTranslationX(y4Var2.getMeasuredWidth() * f10);
                org.telegram.ui.ActionBar.y4[] y4VarArr2 = dn0Var.f47200n;
                y4VarArr2[1].setTranslationX((f10 * y4VarArr2[0].getMeasuredWidth()) - dn0Var.f47200n[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                org.telegram.ui.ActionBar.y4[] y4VarArr3 = dn0Var.f47200n;
                org.telegram.ui.ActionBar.y4 y4Var3 = y4VarArr3[0];
                y4VarArr3[0] = y4VarArr3[1];
                y4VarArr3[1] = y4Var3;
                y4Var3.setVisibility(8);
            }
        }
    }

    @Override
    public void y() {
    }
}
