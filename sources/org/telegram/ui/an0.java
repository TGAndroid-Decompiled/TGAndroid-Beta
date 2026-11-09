package org.telegram.ui;

import android.view.View;
public final class an0 implements org.telegram.ui.Components.vk0 {
    public final int f43748a;
    public final cn0 f43749b;

    public an0(cn0 cn0Var, int i7) {
        this.f43748a = i7;
        this.f43749b = cn0Var;
    }

    @Override
    public void F0(float f10) {
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        cn0 cn0Var = this.f43749b;
        if (i7 != 0 || cn0Var.f44717n[1].getVisibility() == 0) {
            if (cn0Var.f44720w) {
                org.telegram.ui.ActionBar.x4 x4Var = cn0Var.f44717n[0];
                x4Var.setTranslationX((-f10) * x4Var.getMeasuredWidth());
                org.telegram.ui.ActionBar.x4[] x4VarArr = cn0Var.f44717n;
                x4VarArr[1].setTranslationX(x4VarArr[0].getMeasuredWidth() - (f10 * cn0Var.f44717n[0].getMeasuredWidth()));
            } else {
                org.telegram.ui.ActionBar.x4 x4Var2 = cn0Var.f44717n[0];
                x4Var2.setTranslationX(x4Var2.getMeasuredWidth() * f10);
                org.telegram.ui.ActionBar.x4[] x4VarArr2 = cn0Var.f44717n;
                x4VarArr2[1].setTranslationX((f10 * x4VarArr2[0].getMeasuredWidth()) - cn0Var.f44717n[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                org.telegram.ui.ActionBar.x4[] x4VarArr3 = cn0Var.f44717n;
                org.telegram.ui.ActionBar.x4 x4Var3 = x4VarArr3[0];
                x4VarArr3[0] = x4VarArr3[1];
                x4VarArr3[1] = x4Var3;
                x4Var3.setVisibility(8);
            }
        }
    }

    @Override
    public void b(int i7, boolean z9) {
        boolean z10;
        cn0 cn0Var = this.f43749b;
        if (cn0Var.f44717n[0].f28749b == i7) {
            return;
        }
        if (i7 == cn0Var.h.getFirstTabId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        cn0Var.f44715e = z10;
        org.telegram.ui.ActionBar.x4 x4Var = cn0Var.f44717n[1];
        x4Var.f28749b = i7;
        x4Var.setVisibility(0);
        cn0Var.o0(true);
        cn0Var.f44720w = z9;
        if (i7 == 0) {
            cn0Var.f44714c.setSearchFieldHint(org.telegram.messenger.id.M0(2131745761, null));
        } else {
            cn0Var.f44714c.setSearchFieldHint(org.telegram.messenger.id.M0(2131745764, null));
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
