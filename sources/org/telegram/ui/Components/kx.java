package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class kx extends wx {
    public final kz f27940g3;

    public kx(kz kzVar, Context context) {
        super(kzVar, context);
        this.f27940g3 = kzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27940g3.f27968f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
