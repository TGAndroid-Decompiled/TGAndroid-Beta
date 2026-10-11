package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class da0 extends org.telegram.ui.ActionBar.h5 {
    public final org.telegram.ui.ActionBar.d6 M0;
    public final ca0 N0;
    public ga0 O0;

    public da0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.N0 = new ca0(this);
        this.M0 = d6Var;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.da0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
