package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.w6;
public final class v1 implements View.OnAttachStateChangeListener {
    public final w6 f18668a;

    public v1(w6 w6Var) {
        this.f18668a = w6Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f18668a.c(null);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f18668a.b(null);
    }
}
