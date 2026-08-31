package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class e90 extends org.telegram.ui.ActionBar.l5 {
    public final org.telegram.ui.ActionBar.g6 J0;
    public final d90 K0;
    public h90 L0;

    public e90(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.K0 = new d90(this);
        this.J0 = g6Var;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e90.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
