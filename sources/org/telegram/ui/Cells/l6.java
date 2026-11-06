package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.oa0;
public final class l6 extends org.telegram.ui.Components.l9 {
    public final int G;
    public final m6 H;

    public l6(m6 m6Var, Context context, int i7) {
        super(context);
        this.H = m6Var;
        this.G = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        m6 m6Var = this.H;
        k6 k6Var = m6Var.E;
        oa0 oa0Var = m6.H;
        if (this.G == 1) {
            k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            di.r7.h(m6Var.D, canvas, getImageReceiver(), k6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.E.a(this, motionEvent);
    }
}
