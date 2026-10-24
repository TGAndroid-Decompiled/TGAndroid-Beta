package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.w6;
public final class t1 implements View.OnAttachStateChangeListener {
    public final w6 f21854a;

    public t1(w6 w6Var) {
        this.f21854a = w6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f21854a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f21854a.b(null);
    }
}
