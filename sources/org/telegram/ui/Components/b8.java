package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class b8 extends zo0 {
    public final j8 f24852l0;

    public b8(j8 j8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.f24852l0 = j8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f24852l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
