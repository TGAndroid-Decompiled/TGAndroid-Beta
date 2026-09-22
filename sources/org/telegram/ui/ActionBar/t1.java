package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.w6;
public final class t1 implements View.OnAttachStateChangeListener {
    public final w6 f19783a;

    public t1(w6 w6Var) {
        this.f19783a = w6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f19783a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f19783a.b(null);
    }
}
