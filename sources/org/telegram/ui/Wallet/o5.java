package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class o5 extends FrameLayout {
    public View f42905a;
    public float f42906b;
    public int f42907c;
    public final m5 d;
    public final z5 f42908e;

    public o5(z5 z5Var, Context context) {
        super(context);
        this.f42908e = z5Var;
        this.d = new m5(1, this);
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f42908e.U0();
    }
}
