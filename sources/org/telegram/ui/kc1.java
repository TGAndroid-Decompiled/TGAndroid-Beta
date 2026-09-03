package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class kc1 extends FrameLayout {
    public final int f35505a;
    public final Rect f35506b;
    public final jd1 f35507c;

    public kc1(jd1 jd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f35507c = jd1Var;
        this.f35505a = i10;
        this.f35506b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f35505a;
        Rect rect = this.f35506b;
        jd1 jd1Var = this.f35507c;
        if (i10 == 0) {
            jd1Var.f35222r.setBounds(jd1Var.S.getLeft() - rect.left, 0, jd1Var.S.getRight() + rect.right, getMeasuredHeight());
        } else {
            jd1Var.f35222r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        jd1Var.f35222r.draw(canvas);
    }
}
