package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.jc0;
public final class o6 extends org.telegram.ui.Components.w9 {
    public final int G;
    public final p6 H;

    public o6(p6 p6Var, Context context, int i10) {
        super(context);
        this.H = p6Var;
        this.G = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        p6 p6Var = this.H;
        n6 n6Var = p6Var.f19685y;
        jc0 jc0Var = p6.G;
        if (this.G == 1) {
            n6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            zh.a6.h(p6Var.f19684x, canvas, getImageReceiver(), n6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.f19685y.a(motionEvent, this);
    }
}
