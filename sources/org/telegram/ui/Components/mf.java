package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class mf implements ViewTreeObserver.OnDrawListener {
    public final ow0 f28536a;
    public final fq0 f28537b;

    public mf(ow0 ow0Var, fq0 fq0Var) {
        this.f28536a = ow0Var;
        this.f28537b = fq0Var;
    }

    @Override
    public final void onDraw() {
        ow0 ow0Var = this.f28536a;
        ow0Var.post(new org.telegram.tgnet.h(this, ow0Var, this.f28537b, 11));
    }
}
