package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class kx extends wx {
    public final mz f28472d3;

    public kx(mz mzVar, Context context) {
        super(mzVar, context);
        this.f28472d3 = mzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f28472d3.f29281f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
