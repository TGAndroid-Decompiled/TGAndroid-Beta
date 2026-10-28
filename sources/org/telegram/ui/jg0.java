package org.telegram.ui;

import android.view.View;
public final class jg0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.b2 {
    public final lg0 f40533a;

    public jg0(lg0 lg0Var) {
        this.f40533a = lg0Var;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        lg0.X(this.f40533a, i10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        lg0.W(this.f40533a);
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
