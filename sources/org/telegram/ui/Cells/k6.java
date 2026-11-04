package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.ja0;
public final class k6 extends org.telegram.ui.Components.k9 {
    public final int H;
    public final l6 I;

    public k6(l6 l6Var, Context context, int i3) {
        super(context);
        this.I = l6Var;
        this.H = i3;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        l6 l6Var = this.I;
        j6 j6Var = l6Var.F;
        ja0 ja0Var = l6.I;
        if (this.H == 1) {
            j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            ei.s7.h(l6Var.E, canvas, getImageReceiver(), j6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I.F.a(this, motionEvent);
    }
}
