package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class lb1 extends FrameLayout {
    public final int f38881a;
    public final Rect f38882b;
    public final kc1 f38883c;

    public lb1(kc1 kc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f38883c = kc1Var;
        this.f38881a = i10;
        this.f38882b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f38881a;
        Rect rect = this.f38882b;
        kc1 kc1Var = this.f38883c;
        if (i10 == 0) {
            kc1Var.f38563r.setBounds(kc1Var.V.getLeft() - rect.left, 0, kc1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            kc1Var.f38563r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        kc1Var.f38563r.draw(canvas);
    }
}
