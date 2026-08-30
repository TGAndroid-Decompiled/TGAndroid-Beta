package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class c90 extends org.telegram.ui.ActionBar.k5 {
    public final org.telegram.ui.ActionBar.f6 J0;
    public final b90 K0;
    public f90 L0;

    public c90(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.K0 = new b90(this);
        this.J0 = f6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getLayoutX(), getLayoutY());
        if (this.K0.f(canvas)) {
            invalidate();
        }
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c90.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
