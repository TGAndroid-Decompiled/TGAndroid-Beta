package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class m41 extends uk0 {
    public final t41 f28367e3;
    public final x41 f28368f3;

    public m41(x41 x41Var, Context context, t41 t41Var) {
        super(context, null);
        this.f28368f3 = x41Var;
        this.f28367e3 = t41Var;
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= org.telegram.messenger.i0.L(58.0f) + this.f28368f3.E) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f28368f3.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f28367e3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f28368f3.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.f28368f3.H) {
            super.requestLayout();
        }
    }
}
