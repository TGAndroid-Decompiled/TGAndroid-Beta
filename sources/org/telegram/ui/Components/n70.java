package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class n70 extends org.telegram.ui.Cells.i9 {
    public final m.g3 f30761w;
    public boolean f30762x;
    public final o70 f30763y;

    public n70(o70 o70Var, Context context) {
        super(context);
        this.f30763y = o70Var;
        this.f30761w = new m.g3(this, 20);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.g3 g3Var = this.f30761w;
        AndroidUtilities.cancelRunOnUIThread(g3Var);
        if (this.f30762x) {
            AndroidUtilities.runOnUIThread(g3Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f30761w);
    }
}
