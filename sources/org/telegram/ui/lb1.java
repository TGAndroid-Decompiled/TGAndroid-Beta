package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class lb1 extends FrameLayout {
    public final int f38874a;
    public final Rect f38875b;
    public final kc1 f38876c;

    public lb1(kc1 kc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f38876c = kc1Var;
        this.f38874a = i10;
        this.f38875b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f38874a;
        Rect rect = this.f38875b;
        kc1 kc1Var = this.f38876c;
        if (i10 == 0) {
            kc1Var.f38556r.setBounds(kc1Var.V.getLeft() - rect.left, 0, kc1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            kc1Var.f38556r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        kc1Var.f38556r.draw(canvas);
    }
}
