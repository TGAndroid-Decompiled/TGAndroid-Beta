package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.w6;
public final class u1 implements View.OnAttachStateChangeListener {
    public final w6 f23832a;

    public u1(w6 w6Var) {
        this.f23832a = w6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23832a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23832a.b(null);
    }
}
