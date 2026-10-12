package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class n4 extends FrameLayout {
    public View f33511a;
    public float f33512b;
    public int f33513c;
    public final l4 d;
    public final z4 e;

    public n4(z4 z4Var, Context context) {
        super(context);
        this.e = z4Var;
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
        this.e.C0();
    }
}
