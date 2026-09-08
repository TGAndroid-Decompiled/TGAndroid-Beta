package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnDrawListener {
    public final ev0 f26397a;
    public final uo0 f26398b;

    public gf(ev0 ev0Var, uo0 uo0Var) {
        this.f26397a = ev0Var;
        this.f26398b = uo0Var;
    }

    @Override
    public final void onDraw() {
        ev0 ev0Var = this.f26397a;
        ev0Var.post(new org.telegram.ui.ActionBar.p(this, ev0Var, this.f26398b, 8));
    }
}
