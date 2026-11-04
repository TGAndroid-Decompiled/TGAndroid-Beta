package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class is0 extends vg.n1 {
    public final js0 O;

    public is0(js0 js0Var, Context context) {
        super(context);
        this.O = js0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f56751r;
        if (textView.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            js0 js0Var = this.O;
            js0Var.d.f47012n.f41651o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f56750n.h, js0Var.d.f47012n.P);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), js0Var.d.f47012n.f41651o0.f56911f);
        }
        super.dispatchDraw(canvas);
    }
}
