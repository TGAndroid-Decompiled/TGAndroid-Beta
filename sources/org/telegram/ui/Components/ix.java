package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ix extends ux {
    public final kz f25782d3;

    public ix(kz kzVar, Context context) {
        super(kzVar, context);
        this.f25782d3 = kzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f25782d3.f26438f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
