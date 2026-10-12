package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class ga0 extends org.telegram.ui.ActionBar.h5 {
    public final org.telegram.ui.ActionBar.c6 M0;
    public final fa0 N0;
    public ja0 O0;

    public ga0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.N0 = new fa0(this);
        this.M0 = c6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getLayoutX(), getLayoutY());
        if (this.N0.f(canvas)) {
            invalidate();
        }
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ga0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
