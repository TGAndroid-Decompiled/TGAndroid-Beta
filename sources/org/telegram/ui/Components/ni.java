package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ni extends i20 {
    public final ri J;

    public ni(Context context, org.telegram.ui.ActionBar.g6 g6Var, ri riVar) {
        super(context, g6Var);
        this.J = riVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.z1(this.f27258r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
