package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class u7 extends lo0 {
    public final c8 f31585i0;

    public u7(c8 c8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.f31585i0 = c8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f31585i0.E0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
