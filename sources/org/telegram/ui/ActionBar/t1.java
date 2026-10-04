package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.x6;
public final class t1 implements View.OnAttachStateChangeListener {
    public final x6 f21517a;

    public t1(x6 x6Var) {
        this.f21517a = x6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f21517a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f21517a.b(null);
    }
}
