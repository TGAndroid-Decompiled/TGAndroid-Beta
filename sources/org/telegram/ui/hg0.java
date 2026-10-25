package org.telegram.ui;

import android.view.View;
public final class hg0 implements org.telegram.ui.Components.am0, org.telegram.ui.ActionBar.b2 {
    public final jg0 f40003a;

    public hg0(jg0 jg0Var) {
        this.f40003a = jg0Var;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        jg0.X(this.f40003a, i10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        jg0.W(this.f40003a);
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
