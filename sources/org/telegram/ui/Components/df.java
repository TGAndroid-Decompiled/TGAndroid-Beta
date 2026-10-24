package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class df implements ViewTreeObserver.OnDrawListener {
    public final dw0 f25723a;
    public final up0 f25724b;

    public df(dw0 dw0Var, up0 up0Var) {
        this.f25723a = dw0Var;
        this.f25724b = up0Var;
    }

    @Override
    public final void onDraw() {
        dw0 dw0Var = this.f25723a;
        dw0Var.post(new ig.d2(this, dw0Var, this.f25724b, 28));
    }
}
