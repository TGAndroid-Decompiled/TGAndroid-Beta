package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final sv0 f24214a;
    public final jp0 f24215b;

    public ff(sv0 sv0Var, jp0 jp0Var) {
        this.f24214a = sv0Var;
        this.f24215b = jp0Var;
    }

    @Override
    public final void onDraw() {
        sv0 sv0Var = this.f24214a;
        sv0Var.post(new org.telegram.messenger.video.o(this, sv0Var, this.f24215b, 11));
    }
}
