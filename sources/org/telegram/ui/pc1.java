package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class pc1 extends FrameLayout {
    public final int f36485a;
    public final Rect f36486b;
    public final od1 f36487c;

    public pc1(od1 od1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f36487c = od1Var;
        this.f36485a = i10;
        this.f36486b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f36485a;
        Rect rect = this.f36486b;
        od1 od1Var = this.f36487c;
        if (i10 == 0) {
            od1Var.f36174r.setBounds(od1Var.V.getLeft() - rect.left, 0, od1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            od1Var.f36174r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        od1Var.f36174r.draw(canvas);
    }
}
