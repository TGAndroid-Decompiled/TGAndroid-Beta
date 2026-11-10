package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class xu extends wu {
    public final yu O;

    public xu(yu yuVar, Context context, int i7) {
        super(yuVar.f40732s, context, i7);
        this.O = yuVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.O.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
