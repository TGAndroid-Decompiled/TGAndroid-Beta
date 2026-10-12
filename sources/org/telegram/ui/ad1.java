package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class ad1 extends FrameLayout {
    public final int f35765a;
    public final Rect f35766b;
    public final zd1 f35767c;

    public ad1(zd1 zd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f35767c = zd1Var;
        this.f35765a = i10;
        this.f35766b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f35765a;
        Rect rect = this.f35766b;
        zd1 zd1Var = this.f35767c;
        if (i10 == 0) {
            zd1Var.f44781r.setBounds(zd1Var.V.getLeft() - rect.left, 0, zd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            zd1Var.f44781r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        zd1Var.f44781r.draw(canvas);
    }
}
