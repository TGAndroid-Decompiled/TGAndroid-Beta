package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class o81 extends FrameLayout {
    public final int f40200a;
    public final Rect f40201b;
    public final m91 f40202c;

    public o81(m91 m91Var, Context context, int i10, Rect rect) {
        super(context);
        this.f40202c = m91Var;
        this.f40200a = i10;
        this.f40201b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f40200a;
        Rect rect = this.f40201b;
        m91 m91Var = this.f40202c;
        if (i10 == 0) {
            m91Var.f39584r.setBounds(m91Var.W.getLeft() - rect.left, 0, m91Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            m91Var.f39584r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        m91Var.f39584r.draw(canvas);
    }
}
