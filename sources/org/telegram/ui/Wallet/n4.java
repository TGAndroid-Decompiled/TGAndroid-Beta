package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class n4 extends FrameLayout {
    public View f35295a;
    public float f35296b;
    public int f35297c;
    public final l4 d;
    public final a5 f35298e;

    public n4(a5 a5Var, Context context) {
        super(context);
        this.f35298e = a5Var;
        this.d = new l4(this, 1);
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
        this.f35298e.C0();
    }
}
