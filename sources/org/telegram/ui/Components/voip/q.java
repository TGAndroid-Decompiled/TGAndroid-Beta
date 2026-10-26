package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.TextView;
public final class q extends TextView {
    public final t f34021a;

    public q(t tVar, Context context) {
        super(context);
        this.f34021a = tVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (Math.abs(this.f34021a.N.getAlpha() - 1.0f) > 0.001f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }
}
