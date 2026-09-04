package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class yv extends xv {
    public final zv K;

    public yv(zv zvVar, Context context, int i10, int i11) {
        super(zvVar.f33237s, context, i10, i11);
        this.K = zvVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
