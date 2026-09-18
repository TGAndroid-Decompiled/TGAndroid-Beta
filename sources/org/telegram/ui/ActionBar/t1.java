package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.x6;
public final class t1 implements View.OnAttachStateChangeListener {
    public final x6 f19736a;

    public t1(x6 x6Var) {
        this.f19736a = x6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f19736a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f19736a.b(null);
    }
}
