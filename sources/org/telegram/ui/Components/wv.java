package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class wv extends vv {
    public final xv H;

    public wv(xv xvVar, Context context, int i10, int i11) {
        super(xvVar.f33184s, context, i10, i11);
        this.H = xvVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.H.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
