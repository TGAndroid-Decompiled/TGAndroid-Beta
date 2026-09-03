package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class kx extends wx {
    public final mz f28508d3;

    public kx(mz mzVar, Context context) {
        super(mzVar, context);
        this.f28508d3 = mzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f28508d3.f29283f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
