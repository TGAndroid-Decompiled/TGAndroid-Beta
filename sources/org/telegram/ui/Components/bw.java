package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class bw extends aw {
    public final cw K;

    public bw(cw cwVar, Context context, int i10, int i11) {
        super(cwVar.f23420s, context, i10, i11);
        this.K = cwVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
