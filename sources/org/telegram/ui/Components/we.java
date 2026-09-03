package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class we implements ViewTreeObserver.OnDrawListener {
    public final fv0 f32742a;
    public final yo0 f32743b;

    public we(fv0 fv0Var, yo0 yo0Var) {
        this.f32742a = fv0Var;
        this.f32743b = yo0Var;
    }

    @Override
    public final void onDraw() {
        fv0 fv0Var = this.f32742a;
        fv0Var.post(new mh.p6(this, fv0Var, this.f32743b, 25));
    }
}
