package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final zv0 f26232a;
    public final qp0 f26233b;

    public ff(zv0 zv0Var, qp0 qp0Var) {
        this.f26232a = zv0Var;
        this.f26233b = qp0Var;
    }

    @Override
    public final void onDraw() {
        zv0 zv0Var = this.f26232a;
        zv0Var.post(new ig.e2(this, zv0Var, this.f26233b, 28));
    }
}
