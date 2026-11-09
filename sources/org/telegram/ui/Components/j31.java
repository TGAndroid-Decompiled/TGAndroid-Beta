package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class j31 extends qj0 {
    public final q31 f34922e3;
    public final u31 f34923f3;

    public j31(u31 u31Var, Context context, q31 q31Var) {
        super(context, null);
        this.f34923f3 = u31Var;
        this.f34922e3 = q31Var;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(58.0f) + this.f34923f3.E) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f34923f3.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f34922e3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f34923f3.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.f34923f3.H) {
            super.requestLayout();
        }
    }
}
