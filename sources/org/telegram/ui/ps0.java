package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class ps0 extends ug.l1 {
    public final qs0 O;

    public ps0(qs0 qs0Var, Context context) {
        super(context);
        this.O = qs0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f58208r;
        if (textView.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            qs0 qs0Var = this.O;
            qs0Var.d.f51016n.f42994o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f58207n.h, qs0Var.d.f51016n.P);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), qs0Var.d.f51016n.f42994o0.f58392f);
        }
        super.dispatchDraw(canvas);
    }
}
