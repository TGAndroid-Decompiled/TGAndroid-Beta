package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class jc1 extends FrameLayout {
    public final int f37951a;
    public final Rect f37952b;
    public final jd1 f37953c;

    public jc1(jd1 jd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f37953c = jd1Var;
        this.f37951a = i10;
        this.f37952b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f37951a;
        Rect rect = this.f37952b;
        jd1 jd1Var = this.f37953c;
        if (i10 == 0) {
            jd1Var.f38005r.setBounds(jd1Var.S.getLeft() - rect.left, 0, jd1Var.S.getRight() + rect.right, getMeasuredHeight());
        } else {
            jd1Var.f38005r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        jd1Var.f38005r.draw(canvas);
    }
}
