package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class l5 extends FrameLayout {
    public View f42782a;
    public float f42783b;
    public int f42784c;
    public final j5 d;
    public final w5 f42785e;

    public l5(w5 w5Var, Context context) {
        super(context);
        this.f42785e = w5Var;
        this.d = new j5(1, this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.d);
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnPreDrawListener(this.d);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.f42785e.T0();
    }
}
