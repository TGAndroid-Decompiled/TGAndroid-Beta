package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.sc0;
public final class r6 extends org.telegram.ui.Components.y9 {
    public final int G;
    public final s6 H;

    public r6(s6 s6Var, Context context, int i10) {
        super(context);
        this.H = s6Var;
        this.G = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        s6 s6Var = this.H;
        q6 q6Var = s6Var.E;
        sc0 sc0Var = s6.H;
        if (this.G == 1) {
            q6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            di.a8.h(s6Var.f25399y, canvas, getImageReceiver(), q6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.E.a(motionEvent, this);
    }
}
