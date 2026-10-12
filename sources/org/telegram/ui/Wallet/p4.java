package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class p4 extends FrameLayout {
    public View f35217a;
    public float f35218b;
    public int f35219c;
    public final n4 d;
    public final c5 f35220e;

    public p4(c5 c5Var, Context context) {
        super(context);
        this.f35220e = c5Var;
        this.d = new n4(this, 1);
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
        this.f35220e.C0();
    }
}
