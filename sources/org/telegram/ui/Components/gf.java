package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnDrawListener {
    public final qv0 f24439a;
    public final hp0 f24440b;

    public gf(qv0 qv0Var, hp0 hp0Var) {
        this.f24439a = qv0Var;
        this.f24440b = hp0Var;
    }

    @Override
    public final void onDraw() {
        qv0 qv0Var = this.f24439a;
        qv0Var.post(new org.telegram.messenger.video.o(this, qv0Var, this.f24440b, 11));
    }
}
