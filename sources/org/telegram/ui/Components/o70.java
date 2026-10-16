package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class o70 extends org.telegram.ui.Cells.e9 {
    public final org.telegram.ui.Cells.l7 v;
    public boolean f27591w;
    public final p70 f27592x;

    public o70(p70 p70Var, Context context) {
        super(context);
        this.f27592x = p70Var;
        this.v = new org.telegram.ui.Cells.l7(this, 14);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.l7 l7Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        if (this.f27591w) {
            AndroidUtilities.runOnUIThread(l7Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
