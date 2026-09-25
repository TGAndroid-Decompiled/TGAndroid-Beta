package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class b70 extends org.telegram.ui.Cells.e9 {
    public final org.telegram.ui.Cells.t6 v;
    public boolean f22912w;
    public final c70 f22913x;

    public b70(c70 c70Var, Context context) {
        super(context);
        this.f22913x = c70Var;
        this.v = new org.telegram.ui.Cells.t6(this, 16);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.t6 t6Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        if (this.f22912w) {
            AndroidUtilities.runOnUIThread(t6Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
