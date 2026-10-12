package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class d8 extends qp0 {
    public final l8 f25253l0;

    public d8(l8 l8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.f25253l0 = l8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f25253l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
