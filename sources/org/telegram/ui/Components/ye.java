package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ye implements ViewTreeObserver.OnDrawListener {
    public final rt0 f42481a;
    public final nn0 f42482b;

    public ye(rt0 rt0Var, nn0 nn0Var) {
        this.f42481a = rt0Var;
        this.f42482b = nn0Var;
    }

    @Override
    public final void onDraw() {
        rt0 rt0Var = this.f42481a;
        rt0Var.post(new k7(this, rt0Var, this.f42482b, 2));
    }
}
