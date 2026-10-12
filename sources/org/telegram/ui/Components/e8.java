package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class e8 extends gp0 {
    public final m8 f24626l0;

    public e8(m8 m8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.f24626l0 = m8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f24626l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
