package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class a8 extends gp0 {
    public final i8 m0;

    public a8(i8 i8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.m0 = i8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.m0.G0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
