package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class f61 extends mm0 {
    public final m61 f28071f3;
    public final p61 f28072g3;

    public f61(p61 p61Var, Context context, m61 m61Var) {
        super(context, null);
        this.f28072g3 = p61Var;
        this.f28071f3 = m61Var;
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= AndroidUtilities.dp(58.0f) + this.f28072g3.E) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f28072g3.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f28071f3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f28072g3.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.f28072g3.H) {
            super.requestLayout();
        }
    }
}
