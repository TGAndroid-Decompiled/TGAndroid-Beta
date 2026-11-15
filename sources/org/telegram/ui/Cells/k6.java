package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.pa0;
public final class k6 extends org.telegram.ui.Components.i9 {
    public final int H;
    public final l6 I;

    public k6(l6 l6Var, Context context, int i7) {
        super(context);
        this.I = l6Var;
        this.H = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        l6 l6Var = this.I;
        j6 j6Var = l6Var.F;
        pa0 pa0Var = l6.I;
        if (this.H == 1) {
            j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            fi.l7.h(l6Var.E, canvas, getImageReceiver(), j6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I.F.a(this, motionEvent);
    }
}
