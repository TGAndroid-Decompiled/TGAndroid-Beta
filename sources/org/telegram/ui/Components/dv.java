package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class dv extends cv {
    public final ev P;

    public dv(ev evVar, Context context, int i7) {
        super(evVar.f34441s, context, i7);
        this.P = evVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
