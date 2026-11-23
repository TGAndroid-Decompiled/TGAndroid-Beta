package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class qi extends e10 {
    public final ui K;

    public qi(Context context, org.telegram.ui.ActionBar.h6 h6Var, ui uiVar) {
        super(context, h6Var);
        this.K = uiVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.i1(this.f34632r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
