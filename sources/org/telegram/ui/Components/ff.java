package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final ew0 f26309a;
    public final vp0 f26310b;

    public ff(ew0 ew0Var, vp0 vp0Var) {
        this.f26309a = ew0Var;
        this.f26310b = vp0Var;
    }

    @Override
    public final void onDraw() {
        ew0 ew0Var = this.f26309a;
        ew0Var.post(new ig.d2(this, ew0Var, this.f26310b, 28));
    }
}
