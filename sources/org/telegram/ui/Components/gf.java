package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnDrawListener {
    public final sv0 f24560a;
    public final jp0 f24561b;

    public gf(sv0 sv0Var, jp0 jp0Var) {
        this.f24560a = sv0Var;
        this.f24561b = jp0Var;
    }

    @Override
    public final void onDraw() {
        sv0 sv0Var = this.f24560a;
        sv0Var.post(new org.telegram.messenger.video.o(this, sv0Var, this.f24561b, 11));
    }
}
