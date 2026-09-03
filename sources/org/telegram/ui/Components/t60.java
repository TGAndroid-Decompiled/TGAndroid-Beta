package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class t60 extends org.telegram.ui.Cells.a9 {
    public final m2.b v;
    public boolean f31280w;
    public final u60 f31281x;

    public t60(u60 u60Var, Context context) {
        super(context);
        this.f31281x = u60Var;
        this.v = new m2.b(this, 24);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2.b bVar = this.v;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        if (this.f31280w) {
            AndroidUtilities.runOnUIThread(bVar, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
