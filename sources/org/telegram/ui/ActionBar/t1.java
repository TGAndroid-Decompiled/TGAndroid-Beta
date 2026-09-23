package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.x6;
public final class t1 implements View.OnAttachStateChangeListener {
    public final x6 f19512a;

    public t1(x6 x6Var) {
        this.f19512a = x6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f19512a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f19512a.b(null);
    }
}
