package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.lc0;
public final class n6 extends org.telegram.ui.Components.w9 {
    public final int G;
    public final o6 H;

    public n6(o6 o6Var, Context context, int i10) {
        super(context);
        this.H = o6Var;
        this.G = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        o6 o6Var = this.H;
        m6 m6Var = o6Var.f20755y;
        lc0 lc0Var = o6.G;
        if (this.G == 1) {
            m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            ai.ia.h(o6Var.f20754x, canvas, getImageReceiver(), m6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.f20755y.a(motionEvent, this);
    }
}
