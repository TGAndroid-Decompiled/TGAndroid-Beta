package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnDrawListener {
    public final bw0 f27125a;
    public final np0 f27126b;

    public hf(bw0 bw0Var, np0 np0Var) {
        this.f27125a = bw0Var;
        this.f27126b = np0Var;
    }

    @Override
    public final void onDraw() {
        bw0 bw0Var = this.f27125a;
        bw0Var.post(new org.telegram.messenger.video.o(this, bw0Var, this.f27126b, 11));
    }
}
