package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class x31 extends wk0 {
    public final e41 T2;
    public final h41 U2;

    public x31(h41 h41Var, Context context, e41 e41Var) {
        super(context, null);
        this.U2 = h41Var;
        this.T2 = e41Var;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= AndroidUtilities.dp(58.0f) + this.U2.A) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.U2.B = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.T2.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
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
        if (!this.U2.D) {
            super.requestLayout();
        }
    }
}
