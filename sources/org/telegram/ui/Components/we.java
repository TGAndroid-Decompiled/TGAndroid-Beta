package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class we implements ViewTreeObserver.OnDrawListener {
    public final fv0 f30337a;
    public final yo0 f30338b;

    public we(fv0 fv0Var, yo0 yo0Var) {
        this.f30337a = fv0Var;
        this.f30338b = yo0Var;
    }

    @Override
    public final void onDraw() {
        fv0 fv0Var = this.f30337a;
        fv0Var.post(new lh.p6(this, fv0Var, this.f30338b, 25));
    }
}
