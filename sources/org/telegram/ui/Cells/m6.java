package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.uc0;
public final class m6 extends org.telegram.ui.Components.w9 {
    public final int G;
    public final n6 H;

    public m6(n6 n6Var, Context context, int i10) {
        super(context);
        this.H = n6Var;
        this.G = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        n6 n6Var = this.H;
        l6 l6Var = n6Var.E;
        uc0 uc0Var = n6.H;
        if (this.G == 1) {
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            ci.c8.h(n6Var.f22645y, canvas, getImageReceiver(), l6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.E.a(motionEvent, this);
    }
}
