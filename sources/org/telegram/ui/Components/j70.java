package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class j70 extends org.telegram.ui.Cells.e9 {
    public final org.telegram.ui.Cells.u5 f27591w;
    public boolean f27592x;
    public final k70 f27593y;

    public j70(k70 k70Var, Context context) {
        super(context);
        this.f27593y = k70Var;
        this.f27591w = new org.telegram.ui.Cells.u5(this, 16);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.u5 u5Var = this.f27591w;
        AndroidUtilities.cancelRunOnUIThread(u5Var);
        if (this.f27592x) {
            AndroidUtilities.runOnUIThread(u5Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f27591w);
    }
}
