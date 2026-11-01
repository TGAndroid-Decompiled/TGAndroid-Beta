package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class p5 extends FrameLayout {
    public View f35034a;
    public float f35035b;
    public int f35036c;
    public final n5 d;
    public final b6 e;

    public p5(b6 b6Var, Context context) {
        super(context);
        this.e = b6Var;
        this.d = new n5(1, this);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.e.T0();
    }
}
