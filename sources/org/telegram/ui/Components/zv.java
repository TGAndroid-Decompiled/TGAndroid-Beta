package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class zv extends yv {
    public final aw K;

    public zv(aw awVar, Context context, int i10, int i11) {
        super(awVar.f22497s, context, i10, i11);
        this.K = awVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
