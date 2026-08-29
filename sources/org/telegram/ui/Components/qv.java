package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class qv extends pv {
    public final rv G;

    public qv(rv rvVar, Context context, int i10, int i11) {
        super(rvVar.f32390s, context, i10, i11);
        this.G = rvVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.G.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
