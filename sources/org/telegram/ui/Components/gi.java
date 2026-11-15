package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class gi extends v00 {
    public final ki K;

    public gi(Context context, org.telegram.ui.ActionBar.e6 e6Var, ki kiVar) {
        super(context, e6Var);
        this.K = kiVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.h1(this.f40202r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
