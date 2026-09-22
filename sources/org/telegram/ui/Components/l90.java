package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class l90 extends org.telegram.ui.ActionBar.j5 {
    public final org.telegram.ui.ActionBar.f6 M0;
    public final k90 N0;
    public o90 O0;

    public l90(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.N0 = new k90(this);
        this.M0 = f6Var;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l90.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
