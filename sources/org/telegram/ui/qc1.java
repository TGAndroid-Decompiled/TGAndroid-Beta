package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class qc1 extends FrameLayout {
    public final int f36712a;
    public final Rect f36713b;
    public final pd1 f36714c;

    public qc1(pd1 pd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f36714c = pd1Var;
        this.f36712a = i10;
        this.f36713b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f36712a;
        Rect rect = this.f36713b;
        pd1 pd1Var = this.f36714c;
        if (i10 == 0) {
            pd1Var.f36436r.setBounds(pd1Var.V.getLeft() - rect.left, 0, pd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            pd1Var.f36436r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        pd1Var.f36436r.draw(canvas);
    }
}
