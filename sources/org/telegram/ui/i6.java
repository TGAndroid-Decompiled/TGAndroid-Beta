package org.telegram.ui;

import android.content.Context;
public final class i6 extends org.telegram.ui.Components.wf0 {
    public final a7 F0;

    public i6(a7 a7Var, Context context) {
        super(context);
        this.F0 = a7Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.F0.f31750k0);
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnPreDrawListener(this.F0.f31750k0);
        super.onDetachedFromWindow();
    }
}
