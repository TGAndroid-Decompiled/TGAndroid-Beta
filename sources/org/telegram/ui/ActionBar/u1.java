package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.r6;
public final class u1 implements View.OnAttachStateChangeListener {
    public final r6 f23814a;

    public u1(r6 r6Var) {
        this.f23814a = r6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23814a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23814a.b(null);
    }
}
