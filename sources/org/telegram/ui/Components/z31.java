package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

public final class z31 extends zk0 {
    public final g41 T2;
    public final j41 U2;

    public z31(j41 j41Var, Context context, g41 g41Var) {
        super(context, null);
        this.U2 = j41Var;
        this.T2 = g41Var;
    }

    @Override
    public final boolean E0(float f10) {
        return f10 >= ((float) (AndroidUtilities.dp(58.0f) + this.U2.A));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.U2.B = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.T2.d(this, motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.U2.H != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.U2.D) {
            return;
        }
        super.requestLayout();
    }
}
