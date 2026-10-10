package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class o4 extends FrameLayout {
    public View f35383a;
    public float f35384b;
    public int f35385c;
    public final m4 d;
    public final b5 f35386e;

    public o4(b5 b5Var, Context context) {
        super(context);
        this.f35386e = b5Var;
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
        this.f35386e.C0();
    }
}
