package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class oe implements ViewTreeObserver.OnDrawListener {
    public final kt0 f36710a;
    public final bn0 f36711b;

    public oe(kt0 kt0Var, bn0 bn0Var) {
        this.f36710a = kt0Var;
        this.f36711b = bn0Var;
    }

    @Override
    public final void onDraw() {
        kt0 kt0Var = this.f36710a;
        kt0Var.post(new l2.z0(this, kt0Var, this.f36711b, 27));
    }
}
