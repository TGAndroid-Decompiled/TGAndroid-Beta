package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.z6;
public final class s1 implements View.OnAttachStateChangeListener {
    public final z6 f21481a;

    public s1(z6 z6Var) {
        this.f21481a = z6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f21481a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f21481a.b(null);
    }
}
