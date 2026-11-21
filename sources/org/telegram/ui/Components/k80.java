package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class k80 extends org.telegram.ui.ActionBar.m5 {
    public final org.telegram.ui.ActionBar.h6 N0;
    public final n2.o0 O0;
    public n80 P0;

    public k80(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.O0 = new n2.o0(this);
        this.N0 = h6Var;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k80.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
