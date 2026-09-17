package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class kx extends wx {
    public final kz f27941g3;

    public kx(kz kzVar, Context context) {
        super(kzVar, context);
        this.f27941g3 = kzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27941g3.f27969f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
