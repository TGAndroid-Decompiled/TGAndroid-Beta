package org.telegram.ui;

import android.content.Context;
public final class h6 extends org.telegram.ui.Components.eg0 {
    public final z6 F0;

    public h6(z6 z6Var, Context context) {
        super(context);
        this.F0 = z6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.F0.f40121k0);
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnPreDrawListener(this.F0.f40121k0);
        super.onDetachedFromWindow();
    }
}
