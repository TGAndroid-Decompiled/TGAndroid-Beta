package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class w90 extends org.telegram.ui.ActionBar.n5 {
    public final org.telegram.ui.ActionBar.g6 M0;
    public final v90 N0;
    public z90 O0;

    public w90(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.N0 = new v90(this);
        this.M0 = g6Var;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w90.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
