package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

public final class t7 extends qn0 {

    public final b8 f32674h0;

    public t7(b8 b8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.f32674h0 = b8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f32674h0.D0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
