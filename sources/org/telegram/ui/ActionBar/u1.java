package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.x6;
public final class u1 implements View.OnAttachStateChangeListener {
    public final x6 f19789a;

    public u1(x6 x6Var) {
        this.f19789a = x6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f19789a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f19789a.b(null);
    }
}
