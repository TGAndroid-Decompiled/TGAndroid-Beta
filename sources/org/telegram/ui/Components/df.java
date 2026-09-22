package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class df implements ViewTreeObserver.OnDrawListener {
    public final fv0 f23314a;
    public final uo0 f23315b;

    public df(fv0 fv0Var, uo0 uo0Var) {
        this.f23314a = fv0Var;
        this.f23315b = uo0Var;
    }

    @Override
    public final void onDraw() {
        fv0 fv0Var = this.f23314a;
        fv0Var.post(new org.telegram.ui.ActionBar.p(this, fv0Var, this.f23315b, 8));
    }
}
