package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class oe implements ViewTreeObserver.OnDrawListener {
    public final it0 f36624a;
    public final an0 f36625b;

    public oe(it0 it0Var, an0 an0Var) {
        this.f36624a = it0Var;
        this.f36625b = an0Var;
    }

    @Override
    public final void onDraw() {
        it0 it0Var = this.f36624a;
        it0Var.post(new l2.z0(this, it0Var, this.f36625b, 27));
    }
}
