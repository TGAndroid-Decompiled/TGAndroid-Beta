package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class nb1 extends FrameLayout {
    public final int f39409a;
    public final Rect f39410b;
    public final mc1 f39411c;

    public nb1(mc1 mc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f39411c = mc1Var;
        this.f39409a = i10;
        this.f39410b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f39409a;
        Rect rect = this.f39410b;
        mc1 mc1Var = this.f39411c;
        if (i10 == 0) {
            mc1Var.f39143r.setBounds(mc1Var.V.getLeft() - rect.left, 0, mc1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            mc1Var.f39143r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        mc1Var.f39143r.draw(canvas);
    }
}
