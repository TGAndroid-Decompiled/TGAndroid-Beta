package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class b8 extends oo0 {
    public final j8 f21753l0;

    public b8(j8 j8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.f21753l0 = j8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f21753l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
