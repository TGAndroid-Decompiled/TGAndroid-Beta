package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class lb1 extends FrameLayout {
    public final int f38885a;
    public final Rect f38886b;
    public final kc1 f38887c;

    public lb1(kc1 kc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f38887c = kc1Var;
        this.f38885a = i10;
        this.f38886b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f38885a;
        Rect rect = this.f38886b;
        kc1 kc1Var = this.f38887c;
        if (i10 == 0) {
            kc1Var.f38567r.setBounds(kc1Var.V.getLeft() - rect.left, 0, kc1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            kc1Var.f38567r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        kc1Var.f38567r.draw(canvas);
    }
}
