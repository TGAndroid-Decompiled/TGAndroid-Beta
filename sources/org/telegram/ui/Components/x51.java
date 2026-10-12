package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class x51 extends mm0 {
    public final e61 V2;
    public final h61 W2;

    public x51(h61 h61Var, Context context, e61 e61Var) {
        super(context, null);
        this.W2 = h61Var;
        this.V2 = e61Var;
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= AndroidUtilities.dp(58.0f) + this.W2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.W2.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.V2.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.W2.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.W2.H) {
            super.requestLayout();
        }
    }
}
