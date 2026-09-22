package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class b70 extends org.telegram.ui.Cells.f9 {
    public final org.telegram.ui.Cells.u6 v;
    public boolean f22908w;
    public final c70 f22909x;

    public b70(c70 c70Var, Context context) {
        super(context);
        this.f22909x = c70Var;
        this.v = new org.telegram.ui.Cells.u6(this, 16);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.u6 u6Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(u6Var);
        if (this.f22908w) {
            AndroidUtilities.runOnUIThread(u6Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
