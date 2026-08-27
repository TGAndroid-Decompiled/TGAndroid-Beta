package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

public final class jv extends iv {
    public final kv G;

    public jv(kv kvVar, Context context, int i10, int i11) {
        super(kvVar.f30190s, context, i10, i11);
        this.G = kvVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.G.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
