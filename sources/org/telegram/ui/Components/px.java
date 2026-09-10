package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class px extends cy {
    public final rz f26257g3;

    public px(rz rzVar, Context context) {
        super(rzVar, context);
        this.f26257g3 = rzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26257g3.f26813f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
