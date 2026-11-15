package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class r7 extends qm0 {
    public final y7 f38893n0;

    public r7(y7 y7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.f38893n0 = y7Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f38893n0.B2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
