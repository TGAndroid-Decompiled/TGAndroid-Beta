package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class xh extends n00 {
    public final bi K;

    public xh(Context context, org.telegram.ui.ActionBar.e6 e6Var, bi biVar) {
        super(context, e6Var);
        this.K = biVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.h1(this.f36302r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
