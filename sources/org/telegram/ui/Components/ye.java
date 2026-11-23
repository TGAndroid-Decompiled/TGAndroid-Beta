package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ye implements ViewTreeObserver.OnDrawListener {
    public final ut0 f42421a;
    public final pn0 f42422b;

    public ye(ut0 ut0Var, pn0 pn0Var) {
        this.f42421a = ut0Var;
        this.f42422b = pn0Var;
    }

    @Override
    public final void onDraw() {
        ut0 ut0Var = this.f42421a;
        ut0Var.post(new g(this, ut0Var, this.f42422b, 3));
    }
}
