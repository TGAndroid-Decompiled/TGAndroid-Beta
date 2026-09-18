package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.v6;
public final class u1 implements View.OnAttachStateChangeListener {
    public final v6 f19577a;

    public u1(v6 v6Var) {
        this.f19577a = v6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f19577a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f19577a.b(null);
    }
}
