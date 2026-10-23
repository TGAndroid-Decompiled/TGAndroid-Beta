package org.telegram.ui;

import android.view.View;
public final class jg0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.z1 {
    public final lg0 f38563a;

    public jg0(lg0 lg0Var) {
        this.f38563a = lg0Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        lg0.W(this.f38563a, i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        lg0.U(this.f38563a);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
