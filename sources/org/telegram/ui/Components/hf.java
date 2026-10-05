package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnDrawListener {
    public final cw0 f27222a;
    public final op0 f27223b;

    public hf(cw0 cw0Var, op0 op0Var) {
        this.f27222a = cw0Var;
        this.f27223b = op0Var;
    }

    @Override
    public final void onDraw() {
        cw0 cw0Var = this.f27222a;
        cw0Var.post(new org.telegram.messenger.video.o(this, cw0Var, this.f27223b, 11));
    }
}
