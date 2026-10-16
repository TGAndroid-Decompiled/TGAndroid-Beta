package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.a7;
public final class s1 implements View.OnAttachStateChangeListener {
    public final a7 f20326a;

    public s1(a7 a7Var) {
        this.f20326a = a7Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f20326a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f20326a.b(null);
    }
}
