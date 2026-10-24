package org.telegram.ui;

import android.view.View;
public final class ig0 implements org.telegram.ui.Components.am0, org.telegram.ui.ActionBar.z1 {
    public final kg0 f38287a;

    public ig0(kg0 kg0Var) {
        this.f38287a = kg0Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        kg0.W(this.f38287a, i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        kg0.U(this.f38287a);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
