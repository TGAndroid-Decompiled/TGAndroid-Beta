package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.xa0;
public final class l6 extends org.telegram.ui.Components.p9 {
    public final int H;
    public final m6 I;

    public l6(m6 m6Var, Context context, int i7) {
        super(context);
        this.I = m6Var;
        this.H = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        m6 m6Var = this.I;
        k6 k6Var = m6Var.F;
        xa0 xa0Var = m6.I;
        if (this.H == 1) {
            k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            fi.i7.h(m6Var.E, canvas, getImageReceiver(), k6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I.F.a(this, motionEvent);
    }
}
