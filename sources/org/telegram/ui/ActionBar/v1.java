package org.telegram.ui.ActionBar;

import android.view.View;
public final class v1 implements View.OnAttachStateChangeListener {
    public final org.telegram.ui.Components.a7 f23155a;

    public v1(org.telegram.ui.Components.a7 a7Var) {
        this.f23155a = a7Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23155a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23155a.b(null);
    }
}
