package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class n31 extends uj0 {
    public final u31 f37448f3;
    public final x31 f37449g3;

    public n31(x31 x31Var, Context context, u31 u31Var) {
        super(context, null);
        this.f37449g3 = x31Var;
        this.f37448f3 = u31Var;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(58.0f) + this.f37449g3.F) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f37449g3.G = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f37448f3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f37449g3.M != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.f37449g3.I) {
            super.requestLayout();
        }
    }
}
