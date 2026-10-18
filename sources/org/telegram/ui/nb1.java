package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class nb1 extends FrameLayout {
    public final int f39435a;
    public final Rect f39436b;
    public final mc1 f39437c;

    public nb1(mc1 mc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f39437c = mc1Var;
        this.f39435a = i10;
        this.f39436b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f39435a;
        Rect rect = this.f39436b;
        mc1 mc1Var = this.f39437c;
        if (i10 == 0) {
            mc1Var.f39168r.setBounds(mc1Var.V.getLeft() - rect.left, 0, mc1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            mc1Var.f39168r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        mc1Var.f39168r.draw(canvas);
    }
}
