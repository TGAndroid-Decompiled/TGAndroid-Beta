package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class dw extends cw {
    public final ew K;

    public dw(ew ewVar, Context context, int i10, int i11) {
        super(ewVar.f22765s, context, i10, i11);
        this.K = ewVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
