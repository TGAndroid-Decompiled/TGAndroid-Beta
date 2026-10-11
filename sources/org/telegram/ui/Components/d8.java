package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class d8 extends mp0 {
    public final l8 f25471l0;

    public d8(l8 l8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.f25471l0 = l8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f25471l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
