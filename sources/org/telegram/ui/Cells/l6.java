package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.cc0;
public final class l6 extends org.telegram.ui.Components.p9 {
    public final int D;
    public final m6 E;

    public l6(m6 m6Var, Context context, int i10) {
        super(context);
        this.E = m6Var;
        this.D = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        m6 m6Var = this.E;
        k6 k6Var = m6Var.f21371y;
        cc0 cc0Var = m6.D;
        if (this.D == 1) {
            k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            nh.m7.h(m6Var.f21370x, canvas, getImageReceiver(), k6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.E.f21371y.a(motionEvent, this);
    }
}
