package org.telegram.ui;

import android.view.View;
public final class dn0 implements org.telegram.ui.Components.jl0 {
    public final int f47014a;
    public final fn0 f47015b;

    public dn0(fn0 fn0Var, int i7) {
        this.f47014a = i7;
        this.f47015b = fn0Var;
    }

    @Override
    public void a(int i7, boolean z10) {
        boolean z11;
        fn0 fn0Var = this.f47015b;
        if (fn0Var.f47795n[0].f30300b == i7) {
            return;
        }
        if (i7 == fn0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        fn0Var.f47793e = z11;
        org.telegram.ui.ActionBar.y4 y4Var = fn0Var.f47795n[1];
        y4Var.f30300b = i7;
        y4Var.setVisibility(0);
        fn0Var.o0(true);
        fn0Var.f47798w = z10;
        if (i7 == 0) {
            fn0Var.f47792c.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745565, null));
        } else {
            fn0Var.f47792c.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745568, null));
        }
    }

    @Override
    public void g(float f10) {
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        fn0 fn0Var = this.f47015b;
        if (i7 != 0 || fn0Var.f47795n[1].getVisibility() == 0) {
            if (fn0Var.f47798w) {
                org.telegram.ui.ActionBar.y4 y4Var = fn0Var.f47795n[0];
                y4Var.setTranslationX((-f10) * y4Var.getMeasuredWidth());
                org.telegram.ui.ActionBar.y4[] y4VarArr = fn0Var.f47795n;
                y4VarArr[1].setTranslationX(y4VarArr[0].getMeasuredWidth() - (f10 * fn0Var.f47795n[0].getMeasuredWidth()));
            } else {
                org.telegram.ui.ActionBar.y4 y4Var2 = fn0Var.f47795n[0];
                y4Var2.setTranslationX(y4Var2.getMeasuredWidth() * f10);
                org.telegram.ui.ActionBar.y4[] y4VarArr2 = fn0Var.f47795n;
                y4VarArr2[1].setTranslationX((f10 * y4VarArr2[0].getMeasuredWidth()) - fn0Var.f47795n[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                org.telegram.ui.ActionBar.y4[] y4VarArr3 = fn0Var.f47795n;
                org.telegram.ui.ActionBar.y4 y4Var3 = y4VarArr3[0];
                y4VarArr3[0] = y4VarArr3[1];
                y4VarArr3[1] = y4Var3;
                y4Var3.setVisibility(8);
            }
        }
    }

    @Override
    public boolean h1(int i7, View view) {
        return false;
    }

    @Override
    public void D() {
    }
}
