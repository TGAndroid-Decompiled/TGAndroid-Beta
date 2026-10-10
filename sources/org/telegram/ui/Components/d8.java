package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class d8 extends lp0 {
    public final l8 f25592l0;

    public d8(l8 l8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.f25592l0 = l8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f25592l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
