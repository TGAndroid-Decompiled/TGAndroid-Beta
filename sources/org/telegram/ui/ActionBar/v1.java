package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.s6;
public final class v1 implements View.OnAttachStateChangeListener {
    public final s6 f20589a;

    public v1(s6 s6Var) {
        this.f20589a = s6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f20589a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f20589a.b(null);
    }
}
