package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final mw0 f28178a;
    public final aq0 f28179b;

    public ff(mw0 mw0Var, aq0 aq0Var) {
        this.f28178a = mw0Var;
        this.f28179b = aq0Var;
    }

    @Override
    public final void onDraw() {
        mw0 mw0Var = this.f28178a;
        mw0Var.post(new jg.f1(this, mw0Var, this.f28179b, 29));
    }
}
