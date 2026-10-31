package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.hb0;
public final class p6 extends org.telegram.ui.Components.g9 {
    public final int G;
    public final q6 H;

    public p6(q6 q6Var, Context context, int i10) {
        super(context);
        this.H = q6Var;
        this.G = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        q6 q6Var = this.H;
        o6 o6Var = q6Var.E;
        hb0 hb0Var = q6.H;
        if (this.G == 1) {
            o6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            th.w5.h(q6Var.D, canvas, getImageReceiver(), o6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.E.a(this, motionEvent);
    }
}
