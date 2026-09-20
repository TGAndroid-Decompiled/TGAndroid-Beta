package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.w6;
public final class t1 implements View.OnAttachStateChangeListener {
    public final w6 f19768a;

    public t1(w6 w6Var) {
        this.f19768a = w6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f19768a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f19768a.b(null);
    }
}
