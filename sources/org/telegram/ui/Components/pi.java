package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class pi extends k20 {
    public final ti J;

    public pi(Context context, org.telegram.ui.ActionBar.d6 d6Var, ti tiVar) {
        super(context, d6Var);
        this.J = tiVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.w1(this.f27712r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
