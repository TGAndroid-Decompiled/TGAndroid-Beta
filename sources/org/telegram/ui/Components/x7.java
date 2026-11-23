package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class x7 extends an0 {
    public final e8 f41912n0;

    public x7(e8 e8Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, false);
        this.f41912n0 = e8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f41912n0.B2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
