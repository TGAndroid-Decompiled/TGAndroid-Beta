package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class a8 extends uo0 {
    public final i8 f22559l0;

    public a8(i8 i8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.f22559l0 = i8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f22559l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
