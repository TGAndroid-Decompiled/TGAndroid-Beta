package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class y7 extends an0 {
    public final f8 f42311n0;

    public y7(f8 f8Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var, false);
        this.f42311n0 = f8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f42311n0.B2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
