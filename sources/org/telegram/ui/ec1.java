package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class ec1 extends FrameLayout {
    public final int f36476a;
    public final Rect f36477b;
    public final ed1 f36478c;

    public ec1(ed1 ed1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f36478c = ed1Var;
        this.f36476a = i10;
        this.f36477b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f36476a;
        Rect rect = this.f36477b;
        ed1 ed1Var = this.f36478c;
        if (i10 == 0) {
            ed1Var.f36530r.setBounds(ed1Var.S.getLeft() - rect.left, 0, ed1Var.S.getRight() + rect.right, getMeasuredHeight());
        } else {
            ed1Var.f36530r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        ed1Var.f36530r.draw(canvas);
    }
}
