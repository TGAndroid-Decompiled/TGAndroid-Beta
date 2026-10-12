package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class dd1 extends FrameLayout {
    public final int f35234a;
    public final Rect f35235b;
    public final ce1 f35236c;

    public dd1(ce1 ce1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f35236c = ce1Var;
        this.f35234a = i10;
        this.f35235b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f35234a;
        Rect rect = this.f35235b;
        ce1 ce1Var = this.f35236c;
        if (i10 == 0) {
            ce1Var.f34899r.setBounds(ce1Var.V.getLeft() - rect.left, 0, ce1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            ce1Var.f34899r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        ce1Var.f34899r.draw(canvas);
    }
}
