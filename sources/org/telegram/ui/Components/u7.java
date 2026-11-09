package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class u7 extends nm0 {
    public final b8 m0;

    public u7(b8 b8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.m0 = b8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.m0.f32161x2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
