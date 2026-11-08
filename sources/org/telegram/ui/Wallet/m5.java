package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class m5 extends FrameLayout {
    public View f42803a;
    public float f42804b;
    public int f42805c;
    public final k5 d;
    public final x5 f42806e;

    public m5(x5 x5Var, Context context) {
        super(context);
        this.f42806e = x5Var;
        this.d = new k5(1, this);
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
        this.f42806e.T0();
    }
}
