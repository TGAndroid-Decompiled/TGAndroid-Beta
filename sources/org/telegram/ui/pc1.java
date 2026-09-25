package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class pc1 extends FrameLayout {
    public final int f36497a;
    public final Rect f36498b;
    public final od1 f36499c;

    public pc1(od1 od1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f36499c = od1Var;
        this.f36497a = i10;
        this.f36498b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f36497a;
        Rect rect = this.f36498b;
        od1 od1Var = this.f36499c;
        if (i10 == 0) {
            od1Var.f36199r.setBounds(od1Var.V.getLeft() - rect.left, 0, od1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            od1Var.f36199r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        od1Var.f36199r.draw(canvas);
    }
}
