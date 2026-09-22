package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class z7 extends fo0 {
    public final h8 f30489l0;

    public z7(h8 h8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.f30489l0 = h8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f30489l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
