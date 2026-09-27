package org.telegram.ui;

import android.content.Context;
public final class j6 extends org.telegram.ui.Components.ig0 {
    public final b7 F0;

    public j6(b7 b7Var, Context context) {
        super(context);
        this.F0 = b7Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.F0.f32269k0);
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnPreDrawListener(this.F0.f32269k0);
        super.onDetachedFromWindow();
    }
}
