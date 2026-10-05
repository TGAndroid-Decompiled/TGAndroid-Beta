package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class t51 extends zl0 {
    public final a61 f31065e3;
    public final d61 f31066f3;

    public t51(d61 d61Var, Context context, a61 a61Var) {
        super(context, null);
        this.f31066f3 = d61Var;
        this.f31065e3 = a61Var;
    }

    @Override
    public final boolean F0(float f7) {
        if (f7 >= AndroidUtilities.dp(58.0f) + this.f31066f3.E) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f31066f3.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f31065e3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f31066f3.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.f31066f3.H) {
            super.requestLayout();
        }
    }
}
