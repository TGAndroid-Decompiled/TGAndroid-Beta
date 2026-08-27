package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

public final class e60 extends org.telegram.ui.Cells.x8 {
    public final m.i3 v;

    public boolean f27958w;

    public final f60 f27959x;

    public e60(f60 f60Var, Context context) {
        super(context);
        this.f27959x = f60Var;
        this.v = new m.i3(this, 22);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.i3 i3Var = this.v;
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        if (this.f27958w) {
            AndroidUtilities.runOnUIThread(i3Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }
}
