package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class df implements ViewTreeObserver.OnDrawListener {
    public final gv0 f23345a;
    public final vo0 f23346b;

    public df(gv0 gv0Var, vo0 vo0Var) {
        this.f23345a = gv0Var;
        this.f23346b = vo0Var;
    }

    @Override
    public final void onDraw() {
        gv0 gv0Var = this.f23345a;
        gv0Var.post(new org.telegram.ui.ActionBar.q(this, gv0Var, this.f23346b, 8));
    }
}
