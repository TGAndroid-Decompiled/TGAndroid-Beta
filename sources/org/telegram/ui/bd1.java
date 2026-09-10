package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class bd1 extends FrameLayout {
    public final int f31237a;
    public final Rect f31238b;
    public final ae1 f31239c;

    public bd1(ae1 ae1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f31239c = ae1Var;
        this.f31237a = i10;
        this.f31238b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f31237a;
        Rect rect = this.f31238b;
        ae1 ae1Var = this.f31239c;
        if (i10 == 0) {
            ae1Var.f30960r.setBounds(ae1Var.V.getLeft() - rect.left, 0, ae1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            ae1Var.f30960r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        ae1Var.f30960r.draw(canvas);
    }
}
