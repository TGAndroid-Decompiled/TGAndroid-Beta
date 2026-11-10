package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ne implements ViewTreeObserver.OnDrawListener {
    public final jt0 f36300a;
    public final an0 f36301b;

    public ne(jt0 jt0Var, an0 an0Var) {
        this.f36300a = jt0Var;
        this.f36301b = an0Var;
    }

    @Override
    public final void onDraw() {
        jt0 jt0Var = this.f36300a;
        jt0Var.post(new l2.z0(this, jt0Var, this.f36301b, 27));
    }
}
