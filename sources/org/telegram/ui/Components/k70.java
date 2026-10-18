package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class k70 extends org.telegram.ui.Cells.d9 {
    public final org.telegram.ui.Cells.k7 v;
    public boolean f27768w;
    public final l70 f27769x;

    public k70(l70 l70Var, Context context) {
        super(context);
        this.f27769x = l70Var;
        this.v = new org.telegram.ui.Cells.k7(this, 14);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.k7 k7Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(k7Var);
        if (this.f27768w) {
            AndroidUtilities.runOnUIThread(k7Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
