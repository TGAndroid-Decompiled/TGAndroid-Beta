package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class qb1 extends FrameLayout {
    public final int f41617a;
    public final Rect f41618b;
    public final qc1 f41619c;

    public qb1(qc1 qc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f41619c = qc1Var;
        this.f41617a = i10;
        this.f41618b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f41617a;
        Rect rect = this.f41618b;
        qc1 qc1Var = this.f41619c;
        if (i10 == 0) {
            qc1Var.f41666r.setBounds(qc1Var.R.getLeft() - rect.left, 0, qc1Var.R.getRight() + rect.right, getMeasuredHeight());
        } else {
            qc1Var.f41666r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        qc1Var.f41666r.draw(canvas);
    }
}
