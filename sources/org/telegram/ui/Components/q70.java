package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class q70 extends org.telegram.ui.ActionBar.k5 {
    public final org.telegram.ui.ActionBar.e6 N0;
    public final m2.p0 O0;
    public t70 P0;

    public q70(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.O0 = new m2.p0(this);
        this.N0 = e6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getLayoutX(), getLayoutY());
        if (this.O0.h(canvas)) {
            invalidate();
        }
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q70.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
