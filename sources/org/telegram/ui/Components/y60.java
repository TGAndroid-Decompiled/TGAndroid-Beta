package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class y60 extends org.telegram.ui.Cells.f9 {
    public final org.telegram.ui.Cells.u6 v;
    public boolean f30463w;
    public final z60 f30464x;

    public y60(z60 z60Var, Context context) {
        super(context);
        this.f30464x = z60Var;
        this.v = new org.telegram.ui.Cells.u6(this, 17);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.u6 u6Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(u6Var);
        if (this.f30463w) {
            AndroidUtilities.runOnUIThread(u6Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
