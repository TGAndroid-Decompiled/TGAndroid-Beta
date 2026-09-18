package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class j90 extends org.telegram.ui.ActionBar.j5 {
    public final org.telegram.ui.ActionBar.e6 M0;
    public final i90 N0;
    public m90 O0;

    public j90(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.N0 = new i90(this);
        this.M0 = e6Var;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j90.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
