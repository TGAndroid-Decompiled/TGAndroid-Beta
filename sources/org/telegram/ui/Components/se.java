package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

public final class se implements ViewTreeObserver.OnDrawListener {

    public final pu0 f32406a;

    public final eo0 f32407b;

    public se(pu0 pu0Var, eo0 eo0Var) {
        this.f32406a = pu0Var;
        this.f32407b = eo0Var;
    }

    @Override
    public final void onDraw() {
        pu0 pu0Var = this.f32406a;
        pu0Var.post(new org.telegram.ui.ActionBar.i3(this, pu0Var, this.f32407b, 7));
    }
}
