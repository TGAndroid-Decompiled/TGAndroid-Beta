package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.v6;
public final class t1 implements View.OnAttachStateChangeListener {
    public final v6 f19545a;

    public t1(v6 v6Var) {
        this.f19545a = v6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f19545a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f19545a.b(null);
    }
}
