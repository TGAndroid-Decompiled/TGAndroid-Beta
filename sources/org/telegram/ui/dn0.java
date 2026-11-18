package org.telegram.ui;

import android.view.View;
public final class dn0 implements org.telegram.ui.Components.hl0 {
    public final int f46948a;
    public final fn0 f46949b;

    public dn0(fn0 fn0Var, int i7) {
        this.f46948a = i7;
        this.f46949b = fn0Var;
    }

    @Override
    public void a(int i7, boolean z10) {
        boolean z11;
        fn0 fn0Var = this.f46949b;
        if (fn0Var.f47728n[0].f30317b == i7) {
            return;
        }
        if (i7 == fn0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        fn0Var.f47726e = z11;
        org.telegram.ui.ActionBar.z4 z4Var = fn0Var.f47728n[1];
        z4Var.f30317b = i7;
        z4Var.setVisibility(0);
        fn0Var.o0(true);
        fn0Var.f47731w = z10;
        if (i7 == 0) {
            fn0Var.f47725c.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745566, null));
        } else {
            fn0Var.f47725c.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745569, null));
        }
    }

    @Override
    public void g(float f10) {
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        fn0 fn0Var = this.f46949b;
        if (i7 != 0 || fn0Var.f47728n[1].getVisibility() == 0) {
            if (fn0Var.f47731w) {
                org.telegram.ui.ActionBar.z4 z4Var = fn0Var.f47728n[0];
                z4Var.setTranslationX((-f10) * z4Var.getMeasuredWidth());
                org.telegram.ui.ActionBar.z4[] z4VarArr = fn0Var.f47728n;
                z4VarArr[1].setTranslationX(z4VarArr[0].getMeasuredWidth() - (f10 * fn0Var.f47728n[0].getMeasuredWidth()));
            } else {
                org.telegram.ui.ActionBar.z4 z4Var2 = fn0Var.f47728n[0];
                z4Var2.setTranslationX(z4Var2.getMeasuredWidth() * f10);
                org.telegram.ui.ActionBar.z4[] z4VarArr2 = fn0Var.f47728n;
                z4VarArr2[1].setTranslationX((f10 * z4VarArr2[0].getMeasuredWidth()) - fn0Var.f47728n[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                org.telegram.ui.ActionBar.z4[] z4VarArr3 = fn0Var.f47728n;
                org.telegram.ui.ActionBar.z4 z4Var3 = z4VarArr3[0];
                z4VarArr3[0] = z4VarArr3[1];
                z4VarArr3[1] = z4Var3;
                z4Var3.setVisibility(8);
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
