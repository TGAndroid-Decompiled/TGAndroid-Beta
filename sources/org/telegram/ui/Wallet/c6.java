package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class c6 extends FrameLayout {
    public View f44041a;
    public float f44042b;
    public int f44043c;
    public final a6 d;
    public final n6 f44044e;

    public c6(n6 n6Var, Context context) {
        super(context);
        this.f44044e = n6Var;
        this.d = new a6(1, this);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f44044e.Y0();
    }
}
