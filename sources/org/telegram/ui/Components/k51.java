package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class k51 extends zl0 {
    public final r51 f25651e3;
    public final u51 f25652f3;

    public k51(u51 u51Var, Context context, r51 r51Var) {
        super(context, null);
        this.f25652f3 = u51Var;
        this.f25651e3 = r51Var;
    }

    @Override
    public final boolean F0(float f7) {
        if (f7 >= AndroidUtilities.dp(58.0f) + this.f25652f3.E) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f25652f3.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f25651e3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f25652f3.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.f25652f3.H) {
            super.requestLayout();
        }
    }
}
