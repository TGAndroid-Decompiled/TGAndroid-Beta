package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.x6;
public final class s1 implements View.OnAttachStateChangeListener {
    public final x6 f19741a;

    public s1(x6 x6Var) {
        this.f19741a = x6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f19741a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f19741a.b(null);
    }
}
