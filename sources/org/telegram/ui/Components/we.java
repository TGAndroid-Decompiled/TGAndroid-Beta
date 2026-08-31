package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class we implements ViewTreeObserver.OnDrawListener {
    public final gv0 f32737a;
    public final zo0 f32738b;

    public we(gv0 gv0Var, zo0 zo0Var) {
        this.f32737a = gv0Var;
        this.f32738b = zo0Var;
    }

    @Override
    public final void onDraw() {
        gv0 gv0Var = this.f32737a;
        gv0Var.post(new mh.p6(this, gv0Var, this.f32738b, 25));
    }
}
