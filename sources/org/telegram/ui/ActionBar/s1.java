package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.x6;
public final class s1 implements View.OnAttachStateChangeListener {
    public final x6 f19725a;

    public s1(x6 x6Var) {
        this.f19725a = x6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f19725a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f19725a.b(null);
    }
}
