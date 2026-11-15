package org.telegram.ui;

import android.view.View;
public final class an0 implements org.telegram.ui.Components.zk0 {
    public final int f45454a;
    public final cn0 f45455b;

    public an0(cn0 cn0Var, int i7) {
        this.f45454a = i7;
        this.f45455b = cn0Var;
    }

    @Override
    public void D0(float f10) {
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        cn0 cn0Var = this.f45455b;
        if (i7 != 0 || cn0Var.f46188n[1].getVisibility() == 0) {
            if (cn0Var.f46191w) {
                org.telegram.ui.ActionBar.v4 v4Var = cn0Var.f46188n[0];
                v4Var.setTranslationX((-f10) * v4Var.getMeasuredWidth());
                org.telegram.ui.ActionBar.v4[] v4VarArr = cn0Var.f46188n;
                v4VarArr[1].setTranslationX(v4VarArr[0].getMeasuredWidth() - (f10 * cn0Var.f46188n[0].getMeasuredWidth()));
            } else {
                org.telegram.ui.ActionBar.v4 v4Var2 = cn0Var.f46188n[0];
                v4Var2.setTranslationX(v4Var2.getMeasuredWidth() * f10);
                org.telegram.ui.ActionBar.v4[] v4VarArr2 = cn0Var.f46188n;
                v4VarArr2[1].setTranslationX((f10 * v4VarArr2[0].getMeasuredWidth()) - cn0Var.f46188n[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                org.telegram.ui.ActionBar.v4[] v4VarArr3 = cn0Var.f46188n;
                org.telegram.ui.ActionBar.v4 v4Var3 = v4VarArr3[0];
                v4VarArr3[0] = v4VarArr3[1];
                v4VarArr3[1] = v4Var3;
                v4Var3.setVisibility(8);
            }
        }
    }

    @Override
    public void b(int i7, boolean z10) {
        boolean z11;
        cn0 cn0Var = this.f45455b;
        if (cn0Var.f46188n[0].f29755b == i7) {
            return;
        }
        if (i7 == cn0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        cn0Var.f46186e = z11;
        org.telegram.ui.ActionBar.v4 v4Var = cn0Var.f46188n[1];
        v4Var.f29755b = i7;
        v4Var.setVisibility(0);
        cn0Var.o0(true);
        cn0Var.f46191w = z10;
        if (i7 == 0) {
            cn0Var.f46185c.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745761, null));
        } else {
            cn0Var.f46185c.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745764, null));
        }
    }

    @Override
    public boolean j1(int i7, View view) {
        return false;
    }

    @Override
    public void D() {
    }
}
