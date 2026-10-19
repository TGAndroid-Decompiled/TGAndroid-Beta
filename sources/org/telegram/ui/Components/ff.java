package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final aw0 f26219a;
    public final qp0 f26220b;

    public ff(aw0 aw0Var, qp0 qp0Var) {
        this.f26219a = aw0Var;
        this.f26220b = qp0Var;
    }

    @Override
    public final void onDraw() {
        aw0 aw0Var = this.f26219a;
        aw0Var.post(new ig.e2(this, aw0Var, this.f26220b, 28));
    }
}
