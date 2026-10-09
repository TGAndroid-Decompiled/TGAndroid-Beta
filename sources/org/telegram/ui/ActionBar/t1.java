package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.z6;
public final class t1 implements View.OnAttachStateChangeListener {
    public final z6 f21527a;

    public t1(z6 z6Var) {
        this.f21527a = z6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f21527a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f21527a.b(null);
    }
}
