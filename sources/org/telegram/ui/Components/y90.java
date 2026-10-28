package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class y90 extends org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.u6 M0;
    public final x90 N0;
    public ba0 O0;

    public y90(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.N0 = new x90(this);
        this.M0 = u6Var;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y90.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
