package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ui extends k20 {
    public final yi J;

    public ui(Context context, org.telegram.ui.ActionBar.f6 f6Var, yi yiVar) {
        super(context, f6Var);
        this.J = yiVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.t1(this.f24572r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
