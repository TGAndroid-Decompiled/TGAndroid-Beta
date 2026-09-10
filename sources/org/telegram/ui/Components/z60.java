package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class z60 extends org.telegram.ui.Cells.f9 {
    public final org.telegram.ui.Cells.l9 v;
    public boolean f29603w;
    public final a70 f29604x;

    public z60(a70 a70Var, Context context) {
        super(context);
        this.f29604x = a70Var;
        this.v = new org.telegram.ui.Cells.l9(this, 13);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.l9 l9Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(l9Var);
        if (this.f29603w) {
            AndroidUtilities.runOnUIThread(l9Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
