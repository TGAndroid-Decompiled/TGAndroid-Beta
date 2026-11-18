package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class oi extends c10 {
    public final si K;

    public oi(Context context, org.telegram.ui.ActionBar.i6 i6Var, si siVar) {
        super(context, i6Var);
        this.K = siVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.i1(this.f33845r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
