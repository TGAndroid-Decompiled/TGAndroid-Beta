package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class a41 extends ek0 {
    public final h41 f33303f3;
    public final k41 f33304g3;

    public a41(k41 k41Var, Context context, h41 h41Var) {
        super(context, null);
        this.f33304g3 = k41Var;
        this.f33303f3 = h41Var;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(58.0f) + this.f33304g3.F) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f33304g3.G = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f33303f3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f33304g3.M != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.f33304g3.I) {
            super.requestLayout();
        }
    }
}
