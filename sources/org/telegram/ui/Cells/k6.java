package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.Components.wb0;
public final class k6 extends org.telegram.ui.Components.t9 {
    public final int C;
    public final l6 D;

    public k6(l6 l6Var, Context context, int i10) {
        super(context);
        this.D = l6Var;
        this.C = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        l6 l6Var = this.D;
        j6 j6Var = l6Var.f24648y;
        wb0 wb0Var = l6.C;
        if (this.C == 1) {
            j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            lh.l7.h(l6Var.f24647x, canvas, getImageReceiver(), j6Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.D.f24648y.a(motionEvent, this);
    }
}
