package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class l41 extends tk0 {
    public final s41 f28008e3;
    public final w41 f28009f3;

    public l41(w41 w41Var, Context context, s41 s41Var) {
        super(context, null);
        this.f28009f3 = w41Var;
        this.f28008e3 = s41Var;
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= org.telegram.messenger.i0.L(58.0f) + this.f28009f3.E) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f28009f3.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f28008e3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f28009f3.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.f28009f3.H) {
            super.requestLayout();
        }
    }
}
