package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class o70 extends org.telegram.ui.Cells.e9 {
    public final org.telegram.ui.Cells.t6 v;
    public boolean f27897w;
    public final p70 f27898x;

    public o70(p70 p70Var, Context context) {
        super(context);
        this.f27898x = p70Var;
        this.v = new org.telegram.ui.Cells.t6(this, 15);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.t6 t6Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        if (this.f27897w) {
            AndroidUtilities.runOnUIThread(t6Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
