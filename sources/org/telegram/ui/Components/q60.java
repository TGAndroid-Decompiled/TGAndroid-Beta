package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class q60 extends org.telegram.ui.Cells.e9 {
    public final org.telegram.ui.Cells.l7 v;
    public boolean f27226w;
    public final r60 f27227x;

    public q60(r60 r60Var, Context context) {
        super(context);
        this.f27227x = r60Var;
        this.v = new org.telegram.ui.Cells.l7(this, 15);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.l7 l7Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        if (this.f27226w) {
            AndroidUtilities.runOnUIThread(l7Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
