package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class jv extends iv {
    public final kv O;

    public jv(kv kvVar, Context context, int i10) {
        super(kvVar.f27930s, context, i10);
        this.O = kvVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.O.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
