package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnDrawListener {
    public final rv0 f24486a;
    public final ip0 f24487b;

    public gf(rv0 rv0Var, ip0 ip0Var) {
        this.f24486a = rv0Var;
        this.f24487b = ip0Var;
    }

    @Override
    public final void onDraw() {
        rv0 rv0Var = this.f24486a;
        rv0Var.post(new org.telegram.messenger.video.o(this, rv0Var, this.f24487b, 11));
    }
}
