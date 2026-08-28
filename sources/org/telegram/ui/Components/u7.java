package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class u7 extends pn0 {
    public final c8 f32936h0;

    public u7(c8 c8Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false);
        this.f32936h0 = c8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f32936h0.D0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
