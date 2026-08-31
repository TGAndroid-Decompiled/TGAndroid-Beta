package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.s6;
public final class v1 implements View.OnAttachStateChangeListener {
    public final s6 f22327a;

    public v1(s6 s6Var) {
        this.f22327a = s6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f22327a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f22327a.b(null);
    }
}
