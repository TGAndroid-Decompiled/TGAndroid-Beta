package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final bw0 f26214a;
    public final rp0 f26215b;

    public ff(bw0 bw0Var, rp0 rp0Var) {
        this.f26214a = bw0Var;
        this.f26215b = rp0Var;
    }

    @Override
    public final void onDraw() {
        bw0 bw0Var = this.f26214a;
        bw0Var.post(new ig.e2(this, bw0Var, this.f26215b, 28));
    }
}
