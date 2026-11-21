package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.ab0;
public final class m6 extends org.telegram.ui.Components.q9 {
    public final int H;
    public final n6 I;

    public m6(n6 n6Var, Context context, int i7) {
        super(context);
        this.I = n6Var;
        this.H = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        n6 n6Var = this.I;
        l6 l6Var = n6Var.F;
        ab0 ab0Var = n6.I;
        if (this.H == 1) {
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            fi.i7.h(n6Var.E, canvas, getImageReceiver(), l6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I.F.a(this, motionEvent);
    }
}
