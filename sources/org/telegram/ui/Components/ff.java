package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final fv0 f23965a;
    public final uo0 f23966b;

    public ff(fv0 fv0Var, uo0 uo0Var) {
        this.f23965a = fv0Var;
        this.f23966b = uo0Var;
    }

    @Override
    public final void onDraw() {
        fv0 fv0Var = this.f23965a;
        fv0Var.post(new org.telegram.ui.ActionBar.p(this, fv0Var, this.f23966b, 8));
    }
}
