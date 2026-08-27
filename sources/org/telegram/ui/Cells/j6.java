package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.lb0;

public final class j6 extends org.telegram.ui.Components.n9 {
    public final int C;
    public final k6 D;

    public j6(k6 k6Var, Context context, int i10) {
        super(context);
        this.D = k6Var;
        this.C = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        k6 k6Var = this.D;
        i6 i6Var = k6Var.f24595y;
        lb0 lb0Var = k6.C;
        if (this.C != 1) {
            super.onDraw(canvas);
        } else {
            i6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            jh.l7.h(k6Var.f24594x, canvas, getImageReceiver(), i6Var);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.D.f24595y.a(motionEvent, this);
    }
}
