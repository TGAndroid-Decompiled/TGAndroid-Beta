package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ze implements ViewTreeObserver.OnDrawListener {
    public final tt0 f42838a;
    public final on0 f42839b;

    public ze(tt0 tt0Var, on0 on0Var) {
        this.f42838a = tt0Var;
        this.f42839b = on0Var;
    }

    @Override
    public final void onDraw() {
        tt0 tt0Var = this.f42838a;
        tt0Var.post(new org.telegram.ui.Cells.fa(this, tt0Var, this.f42839b, 4));
    }
}
