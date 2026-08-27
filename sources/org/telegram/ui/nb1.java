package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

public final class nb1 extends FrameLayout {

    public final int f40717a;

    public final Rect f40718b;

    public final nc1 f40719c;

    public nb1(nc1 nc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f40719c = nc1Var;
        this.f40717a = i10;
        this.f40718b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f40717a;
        Rect rect = this.f40718b;
        nc1 nc1Var = this.f40719c;
        if (i10 == 0) {
            nc1Var.f40778r.setBounds(nc1Var.R.getLeft() - rect.left, 0, nc1Var.R.getRight() + rect.right, getMeasuredHeight());
        } else {
            nc1Var.f40778r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        nc1Var.f40778r.draw(canvas);
    }
}
