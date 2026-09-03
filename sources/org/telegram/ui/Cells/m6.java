package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.dc0;
public final class m6 extends org.telegram.ui.Components.p9 {
    public final int D;
    public final n6 E;

    public m6(n6 n6Var, Context context, int i10) {
        super(context);
        this.E = n6Var;
        this.D = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        n6 n6Var = this.E;
        l6 l6Var = n6Var.f23232y;
        dc0 dc0Var = n6.D;
        if (this.D == 1) {
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            oh.m7.h(n6Var.f23231x, canvas, getImageReceiver(), l6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.E.f23232y.a(motionEvent, this);
    }
}
