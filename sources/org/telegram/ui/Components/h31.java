package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class h31 extends pj0 {
    public final o31 f34158e3;
    public final s31 f34159f3;

    public h31(s31 s31Var, Context context, o31 o31Var) {
        super(context, null);
        this.f34159f3 = s31Var;
        this.f34158e3 = o31Var;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(58.0f) + this.f34159f3.E) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f34159f3.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f34158e3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f34159f3.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.f34159f3.H) {
            super.requestLayout();
        }
    }
}
