package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class dc1 extends FrameLayout {
    public final int f33589a;
    public final Rect f33590b;
    public final cd1 f33591c;

    public dc1(cd1 cd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f33591c = cd1Var;
        this.f33589a = i10;
        this.f33590b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f33589a;
        Rect rect = this.f33590b;
        cd1 cd1Var = this.f33591c;
        if (i10 == 0) {
            cd1Var.f33330r.setBounds(cd1Var.S.getLeft() - rect.left, 0, cd1Var.S.getRight() + rect.right, getMeasuredHeight());
        } else {
            cd1Var.f33330r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        cd1Var.f33330r.draw(canvas);
    }
}
