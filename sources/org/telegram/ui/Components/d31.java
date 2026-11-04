package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class d31 extends tj0 {
    public final k31 f32927f3;
    public final n31 f32928g3;

    public d31(n31 n31Var, Context context, k31 k31Var) {
        super(context, null);
        this.f32928g3 = n31Var;
        this.f32927f3 = k31Var;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(58.0f) + this.f32928g3.F) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f32928g3.G = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f32927f3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f32928g3.M != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.f32928g3.I) {
            super.requestLayout();
        }
    }
}
