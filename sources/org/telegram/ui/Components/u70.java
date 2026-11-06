package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class u70 extends org.telegram.ui.ActionBar.k5 {
    public final org.telegram.ui.ActionBar.f6 M0;
    public final n2.n0 N0;
    public x70 O0;

    public u70(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.N0 = new n2.n0(this);
        this.M0 = f6Var;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u70.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
