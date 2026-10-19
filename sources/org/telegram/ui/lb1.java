package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class lb1 extends FrameLayout {
    public final int f38876a;
    public final Rect f38877b;
    public final kc1 f38878c;

    public lb1(kc1 kc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f38878c = kc1Var;
        this.f38876a = i10;
        this.f38877b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f38876a;
        Rect rect = this.f38877b;
        kc1 kc1Var = this.f38878c;
        if (i10 == 0) {
            kc1Var.f38555r.setBounds(kc1Var.V.getLeft() - rect.left, 0, kc1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            kc1Var.f38555r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        kc1Var.f38555r.draw(canvas);
    }
}
