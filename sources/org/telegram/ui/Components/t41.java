package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class t41 extends ll0 {
    public final a51 X2;
    public final d51 Y2;

    public t41(d51 d51Var, Context context, a51 a51Var) {
        super(context, null);
        this.Y2 = d51Var;
        this.X2 = a51Var;
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= AndroidUtilities.dp(58.0f) + this.Y2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.Y2.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.X2.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Y2.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.Y2.H) {
            super.requestLayout();
        }
    }
}
