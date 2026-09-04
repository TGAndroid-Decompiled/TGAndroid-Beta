package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnDrawListener {
    public final ev0 f26370a;
    public final uo0 f26371b;

    public gf(ev0 ev0Var, uo0 uo0Var) {
        this.f26370a = ev0Var;
        this.f26371b = uo0Var;
    }

    @Override
    public final void onDraw() {
        ev0 ev0Var = this.f26370a;
        ev0Var.post(new org.telegram.ui.ActionBar.p(this, ev0Var, this.f26371b, 8));
    }
}
