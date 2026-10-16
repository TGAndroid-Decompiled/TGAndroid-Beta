package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class o4 extends FrameLayout {
    public View f33285a;
    public float f33286b;
    public int f33287c;
    public final m4 d;
    public final a5 e;

    public o4(a5 a5Var, Context context) {
        super(context);
        this.e = a5Var;
        this.d = new m4(this, 1);
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
        this.e.C0();
    }
}
