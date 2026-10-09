package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class m4 extends FrameLayout {
    public View f35224a;
    public float f35225b;
    public int f35226c;
    public final k4 d;
    public final z4 f35227e;

    public m4(z4 z4Var, Context context) {
        super(context);
        this.f35227e = z4Var;
        this.d = new k4(this, 1);
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
        this.f35227e.C0();
    }
}
