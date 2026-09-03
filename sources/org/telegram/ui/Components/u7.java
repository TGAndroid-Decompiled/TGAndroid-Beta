package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class u7 extends jo0 {
    public final c8 f29125i0;

    public u7(c8 c8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.f29125i0 = c8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f29125i0.E0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
