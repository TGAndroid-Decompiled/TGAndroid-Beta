package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class s7 extends pm0 {
    public final z7 f37937n0;

    public s7(z7 z7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.f37937n0 = z7Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f37937n0.f40977y2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
