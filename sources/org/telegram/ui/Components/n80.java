package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class n80 extends org.telegram.ui.ActionBar.u5 {
    public final org.telegram.ui.ActionBar.p6 M0;
    public final ji.a N0;
    public q80 O0;

    public n80(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.N0 = new ji.a(this);
        this.M0 = p6Var;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n80.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
