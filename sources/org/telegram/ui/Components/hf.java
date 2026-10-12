package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnDrawListener {
    public final ew0 f25658a;
    public final vp0 f25659b;

    public hf(ew0 ew0Var, vp0 vp0Var) {
        this.f25658a = ew0Var;
        this.f25659b = vp0Var;
    }

    @Override
    public final void onDraw() {
        ew0 ew0Var = this.f25658a;
        ew0Var.post(new n2.h(this, ew0Var, this.f25659b, 16));
    }
}
