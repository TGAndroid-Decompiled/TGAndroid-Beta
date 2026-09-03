package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class s60 extends org.telegram.ui.Cells.z8 {
    public final m2.b v;
    public boolean f28673w;
    public final t60 f28674x;

    public s60(t60 t60Var, Context context) {
        super(context);
        this.f28674x = t60Var;
        this.v = new m2.b(this, 24);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2.b bVar = this.v;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        if (this.f28673w) {
            AndroidUtilities.runOnUIThread(bVar, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
