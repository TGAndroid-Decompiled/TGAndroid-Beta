package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class b90 extends org.telegram.ui.ActionBar.i5 {
    public final org.telegram.ui.ActionBar.d6 M0;
    public final a90 N0;
    public e90 O0;

    public b90(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.N0 = new a90(this);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b90.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
