package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.r6;

public final class t1 implements View.OnAttachStateChangeListener {

    public final r6 f23780a;

    public t1(r6 r6Var) {
        this.f23780a = r6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23780a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23780a.b(null);
    }
}
