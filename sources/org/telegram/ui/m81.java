package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class m81 extends FrameLayout {
    public final int f39478a;
    public final Rect f39479b;
    public final k91 f39480c;

    public m81(k91 k91Var, Context context, int i10, Rect rect) {
        super(context);
        this.f39480c = k91Var;
        this.f39478a = i10;
        this.f39479b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f39478a;
        Rect rect = this.f39479b;
        k91 k91Var = this.f39480c;
        if (i10 == 0) {
            k91Var.f38759r.setBounds(k91Var.W.getLeft() - rect.left, 0, k91Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            k91Var.f38759r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        k91Var.f38759r.draw(canvas);
    }
}
