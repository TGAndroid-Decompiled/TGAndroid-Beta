package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class c31 extends pj0 {
    public final j31 f32405e3;
    public final n31 f32406f3;

    public c31(n31 n31Var, Context context, j31 j31Var) {
        super(context, null);
        this.f32406f3 = n31Var;
        this.f32405e3 = j31Var;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(58.0f) + this.f32406f3.E) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f32406f3.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f32405e3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f32406f3.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.f32406f3.H) {
            super.requestLayout();
        }
    }
}
