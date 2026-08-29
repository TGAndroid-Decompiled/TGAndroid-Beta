package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ze implements ViewTreeObserver.OnDrawListener {
    public final xu0 f35328a;
    public final oo0 f35329b;

    public ze(xu0 xu0Var, oo0 oo0Var) {
        this.f35328a = xu0Var;
        this.f35329b = oo0Var;
    }

    @Override
    public final void onDraw() {
        xu0 xu0Var = this.f35328a;
        xu0Var.post(new g(this, xu0Var, this.f35329b, 2));
    }
}
