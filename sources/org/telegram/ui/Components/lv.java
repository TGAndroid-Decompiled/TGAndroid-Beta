package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class lv extends kv {
    public final mv P;

    public lv(mv mvVar, Context context, int i7) {
        super(mvVar.f37650s, context, i7);
        this.P = mvVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
