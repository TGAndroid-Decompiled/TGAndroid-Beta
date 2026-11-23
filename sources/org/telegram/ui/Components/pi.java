package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class pi extends c10 {
    public final ti K;

    public pi(Context context, org.telegram.ui.ActionBar.i6 i6Var, ti tiVar) {
        super(context, i6Var);
        this.K = tiVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.i1(this.f33883r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
