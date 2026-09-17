package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnDrawListener {
    public final ev0 f26398a;
    public final uo0 f26399b;

    public gf(ev0 ev0Var, uo0 uo0Var) {
        this.f26398a = ev0Var;
        this.f26399b = uo0Var;
    }

    @Override
    public final void onDraw() {
        ev0 ev0Var = this.f26398a;
        ev0Var.post(new org.telegram.ui.ActionBar.p(this, ev0Var, this.f26399b, 8));
    }
}
