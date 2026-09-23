package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class r60 extends org.telegram.ui.Cells.f9 {
    public final org.telegram.ui.Cells.l7 v;
    public boolean f27563w;
    public final s60 f27564x;

    public r60(s60 s60Var, Context context) {
        super(context);
        this.f27564x = s60Var;
        this.v = new org.telegram.ui.Cells.l7(this, 15);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.l7 l7Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        if (this.f27563w) {
            AndroidUtilities.runOnUIThread(l7Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
