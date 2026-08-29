package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class m60 extends org.telegram.ui.Cells.y8 {
    public final lh.m7 v;
    public boolean f30581w;
    public final n60 f30582x;

    public m60(n60 n60Var, Context context) {
        super(context);
        this.f30582x = n60Var;
        this.v = new lh.m7(this, 25);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lh.m7 m7Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(m7Var);
        if (this.f30581w) {
            AndroidUtilities.runOnUIThread(m7Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
