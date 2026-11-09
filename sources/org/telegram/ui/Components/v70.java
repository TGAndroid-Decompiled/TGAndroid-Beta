package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class v70 extends org.telegram.ui.ActionBar.l5 {
    public final org.telegram.ui.ActionBar.g6 M0;
    public final n2.n0 N0;
    public y70 O0;

    public v70(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.N0 = new n2.n0(this);
        this.M0 = g6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getLayoutX(), getLayoutY());
        if (this.N0.h(canvas)) {
            invalidate();
        }
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v70.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
