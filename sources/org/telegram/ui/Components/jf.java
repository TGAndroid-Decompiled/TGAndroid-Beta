package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class jf implements ViewTreeObserver.OnDrawListener {
    public final iw0 f27707a;
    public final zp0 f27708b;

    public jf(iw0 iw0Var, zp0 zp0Var) {
        this.f27707a = iw0Var;
        this.f27708b = zp0Var;
    }

    @Override
    public final void onDraw() {
        iw0 iw0Var = this.f27707a;
        iw0Var.post(new org.telegram.messenger.video.f(this, iw0Var, this.f27708b, 13));
    }
}
