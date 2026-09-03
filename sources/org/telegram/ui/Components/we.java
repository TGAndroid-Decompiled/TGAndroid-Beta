package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class we implements ViewTreeObserver.OnDrawListener {
    public final fv0 f30233a;
    public final xo0 f30234b;

    public we(fv0 fv0Var, xo0 xo0Var) {
        this.f30233a = fv0Var;
        this.f30234b = xo0Var;
    }

    @Override
    public final void onDraw() {
        fv0 fv0Var = this.f30233a;
        fv0Var.post(new lh.p6(this, fv0Var, this.f30234b, 25));
    }
}
