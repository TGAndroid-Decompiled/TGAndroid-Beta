package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final zv0 f26239a;
    public final qp0 f26240b;

    public ff(zv0 zv0Var, qp0 qp0Var) {
        this.f26239a = zv0Var;
        this.f26240b = qp0Var;
    }

    @Override
    public final void onDraw() {
        zv0 zv0Var = this.f26239a;
        zv0Var.post(new ig.e2(this, zv0Var, this.f26240b, 28));
    }
}
