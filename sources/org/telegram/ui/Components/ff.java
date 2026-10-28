package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final nw0 f28117a;
    public final bq0 f28118b;

    public ff(nw0 nw0Var, bq0 bq0Var) {
        this.f28117a = nw0Var;
        this.f28118b = bq0Var;
    }

    @Override
    public final void onDraw() {
        nw0 nw0Var = this.f28117a;
        nw0Var.post(new jg.f1(this, nw0Var, this.f28118b, 29));
    }
}
