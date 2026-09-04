package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.y6;
public final class t1 implements View.OnAttachStateChangeListener {
    public final y6 f21346a;

    public t1(y6 y6Var) {
        this.f21346a = y6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f21346a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f21346a.b(null);
    }
}
