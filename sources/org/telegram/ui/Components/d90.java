package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class d90 extends org.telegram.ui.ActionBar.k5 {
    public final org.telegram.ui.ActionBar.f6 J0;
    public final c90 K0;
    public g90 L0;

    public d90(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.K0 = new c90(this);
        this.J0 = f6Var;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d90.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
