package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class z31 extends ek0 {
    public final g41 f42654f3;
    public final j41 f42655g3;

    public z31(j41 j41Var, Context context, g41 g41Var) {
        super(context, null);
        this.f42655g3 = j41Var;
        this.f42654f3 = g41Var;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(58.0f) + this.f42655g3.F) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f42655g3.G = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f42654f3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f42655g3.M != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.f42655g3.I) {
            super.requestLayout();
        }
    }
}
