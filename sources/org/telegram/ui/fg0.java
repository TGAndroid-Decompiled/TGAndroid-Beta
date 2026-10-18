package org.telegram.ui;

import android.view.View;
public final class fg0 implements org.telegram.ui.Components.xl0, org.telegram.ui.ActionBar.a2 {
    public final hg0 f36909a;

    public fg0(hg0 hg0Var) {
        this.f36909a = hg0Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        hg0.W(this.f36909a, i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        hg0.U(this.f36909a);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
