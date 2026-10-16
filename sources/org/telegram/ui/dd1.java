package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class dd1 extends FrameLayout {
    public final int f34963a;
    public final Rect f34964b;
    public final ce1 f34965c;

    public dd1(ce1 ce1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f34965c = ce1Var;
        this.f34963a = i10;
        this.f34964b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f34963a;
        Rect rect = this.f34964b;
        ce1 ce1Var = this.f34965c;
        if (i10 == 0) {
            ce1Var.f34623r.setBounds(ce1Var.V.getLeft() - rect.left, 0, ce1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            ce1Var.f34623r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        ce1Var.f34623r.draw(canvas);
    }
}
