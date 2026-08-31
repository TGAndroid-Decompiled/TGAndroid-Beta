package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class v41 extends tl0 {
    public final c51 U2;
    public final f51 V2;

    public v41(f51 f51Var, Context context, c51 c51Var) {
        super(context, null);
        this.V2 = f51Var;
        this.U2 = c51Var;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= AndroidUtilities.dp(58.0f) + this.V2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.V2.C = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.U2.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.V2.I != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.V2.E) {
            super.requestLayout();
        }
    }
}
