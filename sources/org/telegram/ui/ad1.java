package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class ad1 extends FrameLayout {
    public final int f35763a;
    public final Rect f35764b;
    public final zd1 f35765c;

    public ad1(zd1 zd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f35765c = zd1Var;
        this.f35763a = i10;
        this.f35764b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f35763a;
        Rect rect = this.f35764b;
        zd1 zd1Var = this.f35765c;
        if (i10 == 0) {
            zd1Var.f44776r.setBounds(zd1Var.V.getLeft() - rect.left, 0, zd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            zd1Var.f44776r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        zd1Var.f44776r.draw(canvas);
    }
}
