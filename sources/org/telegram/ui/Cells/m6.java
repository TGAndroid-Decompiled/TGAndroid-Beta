package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.hb0;
public final class m6 extends org.telegram.ui.Components.o9 {
    public final int C;
    public final n6 D;

    public m6(n6 n6Var, Context context, int i9) {
        super(context);
        this.D = n6Var;
        this.C = i9;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        n6 n6Var = this.D;
        l6 l6Var = n6Var.f24771y;
        hb0 hb0Var = n6.C;
        if (this.C == 1) {
            l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            ih.p7.h(n6Var.f24770x, canvas, getImageReceiver(), l6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.D.f24771y.a(motionEvent, this);
    }
}
