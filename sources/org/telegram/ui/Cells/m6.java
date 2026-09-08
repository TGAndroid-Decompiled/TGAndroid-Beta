package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.bc0;
public final class m6 extends org.telegram.ui.Components.x9 {
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
        l6 l6Var = n6Var.f22370y;
        bc0 bc0Var = n6.G;
        if (this.G == 1) {
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            bi.p9.h(n6Var.f22369x, canvas, getImageReceiver(), l6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.H.f22370y.a(motionEvent, this);
    }
}
