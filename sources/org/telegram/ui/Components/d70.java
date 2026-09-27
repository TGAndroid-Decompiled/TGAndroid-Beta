package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class d70 extends org.telegram.ui.Cells.e9 {
    public final org.telegram.ui.Cells.t6 v;
    public boolean f23584w;
    public final e70 f23585x;

    public d70(e70 e70Var, Context context) {
        super(context);
        this.f23585x = e70Var;
        this.v = new org.telegram.ui.Cells.t6(this, 16);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.t6 t6Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        if (this.f23584w) {
            AndroidUtilities.runOnUIThread(t6Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
