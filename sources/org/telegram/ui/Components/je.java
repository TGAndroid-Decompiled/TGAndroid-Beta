package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class je implements ViewTreeObserver.OnDrawListener {
    public final mu0 f27390a;
    public final co0 f27391b;

    public je(mu0 mu0Var, co0 co0Var) {
        this.f27390a = mu0Var;
        this.f27391b = co0Var;
    }

    @Override
    public final void onDraw() {
        mu0 mu0Var = this.f27390a;
        mu0Var.post(new li.s(this, mu0Var, this.f27391b, 27));
    }
}
