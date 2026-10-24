package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class qb1 extends FrameLayout {
    public final int f40764a;
    public final Rect f40765b;
    public final pc1 f40766c;

    public qb1(pc1 pc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f40766c = pc1Var;
        this.f40764a = i10;
        this.f40765b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f40764a;
        Rect rect = this.f40765b;
        pc1 pc1Var = this.f40766c;
        if (i10 == 0) {
            pc1Var.f40489r.setBounds(pc1Var.W.getLeft() - rect.left, 0, pc1Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            pc1Var.f40489r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        pc1Var.f40489r.draw(canvas);
    }
}
