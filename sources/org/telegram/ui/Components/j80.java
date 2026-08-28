package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class j80 extends org.telegram.ui.ActionBar.h5 {
    public final org.telegram.ui.ActionBar.b6 I0;
    public final i80 J0;
    public m80 K0;

    public j80(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.J0 = new i80(this);
        this.I0 = b6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getLayoutX(), getLayoutY());
        if (this.J0.f(canvas)) {
            invalidate();
        }
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j80.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
