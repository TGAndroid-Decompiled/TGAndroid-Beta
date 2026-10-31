package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class je implements ViewTreeObserver.OnDrawListener {
    public final lu0 f27335a;
    public final bo0 f27336b;

    public je(lu0 lu0Var, bo0 bo0Var) {
        this.f27335a = lu0Var;
        this.f27336b = bo0Var;
    }

    @Override
    public final void onDraw() {
        lu0 lu0Var = this.f27335a;
        lu0Var.post(new li.s(this, lu0Var, this.f27336b, 27));
    }
}
