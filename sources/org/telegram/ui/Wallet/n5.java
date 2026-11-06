package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class n5 extends FrameLayout {
    public View f42809a;
    public float f42810b;
    public int f42811c;
    public final l5 d;
    public final y5 f42812e;

    public n5(y5 y5Var, Context context) {
        super(context);
        this.f42812e = y5Var;
        this.d = new l5(1, this);
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
        this.f42812e.T0();
    }
}
