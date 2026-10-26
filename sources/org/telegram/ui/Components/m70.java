package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class m70 extends org.telegram.ui.Cells.i9 {
    public final m.g3 f30416w;
    public boolean f30417x;
    public final n70 f30418y;

    public m70(n70 n70Var, Context context) {
        super(context);
        this.f30418y = n70Var;
        this.f30416w = new m.g3(this, 20);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.g3 g3Var = this.f30416w;
        AndroidUtilities.cancelRunOnUIThread(g3Var);
        if (this.f30417x) {
            AndroidUtilities.runOnUIThread(g3Var, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f30416w);
    }
}
