package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class aw extends zv {
    public final bw K;

    public aw(bw bwVar, Context context, int i10, int i11) {
        super(bwVar.f23069s, context, i10, i11);
        this.K = bwVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
