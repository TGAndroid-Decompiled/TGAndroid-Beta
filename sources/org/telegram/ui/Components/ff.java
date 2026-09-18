package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final rv0 f24146a;
    public final ip0 f24147b;

    public ff(rv0 rv0Var, ip0 ip0Var) {
        this.f24146a = rv0Var;
        this.f24147b = ip0Var;
    }

    @Override
    public final void onDraw() {
        rv0 rv0Var = this.f24146a;
        rv0Var.post(new org.telegram.messenger.video.o(this, rv0Var, this.f24147b, 11));
    }
}
