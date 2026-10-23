package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class l70 extends org.telegram.ui.Cells.e9 {
    public final org.telegram.ui.Cells.u5 f28236w;
    public boolean f28237x;
    public final m70 f28238y;

    public l70(m70 m70Var, Context context) {
        super(context);
        this.f28238y = m70Var;
        this.f28236w = new org.telegram.ui.Cells.u5(this, 16);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.u5 u5Var = this.f28236w;
        AndroidUtilities.cancelRunOnUIThread(u5Var);
        if (this.f28237x) {
            AndroidUtilities.runOnUIThread(u5Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f28236w);
    }
}
