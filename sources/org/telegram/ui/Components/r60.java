package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class r60 extends org.telegram.ui.Cells.a9 {
    public final m2.b v;
    public boolean f28395w;
    public final s60 f28396x;

    public r60(s60 s60Var, Context context) {
        super(context);
        this.f28396x = s60Var;
        this.v = new m2.b(this, 24);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2.b bVar = this.v;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        if (this.f28395w) {
            AndroidUtilities.runOnUIThread(bVar, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
