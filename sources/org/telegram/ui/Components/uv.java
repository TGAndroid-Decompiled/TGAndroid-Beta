package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class uv extends tv {
    public final vv H;

    public uv(vv vvVar, Context context, int i10, int i11) {
        super(vvVar.f30097s, context, i10, i11);
        this.H = vvVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.H.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
