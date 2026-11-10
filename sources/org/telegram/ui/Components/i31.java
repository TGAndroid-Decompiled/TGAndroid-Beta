package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class i31 extends pj0 {
    public final p31 f34523e3;
    public final t31 f34524f3;

    public i31(t31 t31Var, Context context, p31 p31Var) {
        super(context, null);
        this.f34524f3 = t31Var;
        this.f34523e3 = p31Var;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(58.0f) + this.f34524f3.E) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f34524f3.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f34523e3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f34524f3.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.f34524f3.H) {
            super.requestLayout();
        }
    }
}
