package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.s6;
public final class v1 implements View.OnAttachStateChangeListener {
    public final s6 f20614a;

    public v1(s6 s6Var) {
        this.f20614a = s6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f20614a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f20614a.b(null);
    }
}
