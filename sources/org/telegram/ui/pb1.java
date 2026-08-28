package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class pb1 extends FrameLayout {
    public final int f41433a;
    public final Rect f41434b;
    public final oc1 f41435c;

    public pb1(oc1 oc1Var, Context context, int i9, Rect rect) {
        super(context);
        this.f41435c = oc1Var;
        this.f41433a = i9;
        this.f41434b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9 = this.f41433a;
        Rect rect = this.f41434b;
        oc1 oc1Var = this.f41435c;
        if (i9 == 0) {
            oc1Var.f41099r.setBounds(oc1Var.R.getLeft() - rect.left, 0, oc1Var.R.getRight() + rect.right, getMeasuredHeight());
        } else {
            oc1Var.f41099r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        oc1Var.f41099r.draw(canvas);
    }
}
