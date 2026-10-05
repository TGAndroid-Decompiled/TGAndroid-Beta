package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class qc1 extends FrameLayout {
    public final int f39763a;
    public final Rect f39764b;
    public final pd1 f39765c;

    public qc1(pd1 pd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f39765c = pd1Var;
        this.f39763a = i10;
        this.f39764b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f39763a;
        Rect rect = this.f39764b;
        pd1 pd1Var = this.f39765c;
        if (i10 == 0) {
            pd1Var.f39534r.setBounds(pd1Var.V.getLeft() - rect.left, 0, pd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            pd1Var.f39534r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        pd1Var.f39534r.draw(canvas);
    }
}
