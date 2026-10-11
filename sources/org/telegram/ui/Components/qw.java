package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class qw extends pw {
    public final rw K;

    public qw(rw rwVar, Context context, int i10) {
        super(rwVar.f30660s, context, i10);
        this.K = rwVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
