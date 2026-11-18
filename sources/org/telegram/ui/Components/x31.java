package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class x31 extends ck0 {
    public final e41 f41879f3;
    public final h41 f41880g3;

    public x31(h41 h41Var, Context context, e41 e41Var) {
        super(context, null);
        this.f41880g3 = h41Var;
        this.f41879f3 = e41Var;
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= org.telegram.messenger.g0.L(58.0f) + this.f41880g3.F) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f41880g3.G = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f41879f3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f41880g3.M != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.f41880g3.I) {
            super.requestLayout();
        }
    }
}
