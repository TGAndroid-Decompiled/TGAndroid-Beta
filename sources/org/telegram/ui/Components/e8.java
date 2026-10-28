package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class e8 extends mp0 {
    public final m8 m0;

    public e8(m8 m8Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, false);
        this.m0 = m8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.m0.G0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
