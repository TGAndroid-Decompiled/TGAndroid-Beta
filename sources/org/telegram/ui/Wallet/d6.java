package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class d6 extends FrameLayout {
    public View f44167a;
    public float f44168b;
    public int f44169c;
    public final b6 d;
    public final o6 f44170e;

    public d6(o6 o6Var, Context context) {
        super(context);
        this.f44170e = o6Var;
        this.d = new b6(1, this);
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
        this.f44170e.Y0();
    }
}
