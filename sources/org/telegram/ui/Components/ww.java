package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ww extends ix {
    public final wy f34376c3;

    public ww(wy wyVar, Context context) {
        super(wyVar, context);
        this.f34376c3 = wyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f34376c3.f34401f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
