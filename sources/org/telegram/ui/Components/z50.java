package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class z50 extends org.telegram.ui.Cells.b9 {
    public final m.i3 v;
    public boolean f35197w;
    public final a60 f35198x;

    public z50(a60 a60Var, Context context) {
        super(context);
        this.f35198x = a60Var;
        this.v = new m.i3(this, 22);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.i3 i3Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        if (this.f35197w) {
            AndroidUtilities.runOnUIThread(i3Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
