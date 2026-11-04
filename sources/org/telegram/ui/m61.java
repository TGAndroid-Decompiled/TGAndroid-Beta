package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class m61 extends FrameLayout {
    public final int f47544a;
    public final Rect f47545b;
    public final l71 f47546c;

    public m61(l71 l71Var, Context context, int i3, Rect rect) {
        super(context);
        this.f47546c = l71Var;
        this.f47544a = i3;
        this.f47545b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3 = this.f47544a;
        Rect rect = this.f47545b;
        l71 l71Var = this.f47546c;
        if (i3 == 0) {
            l71Var.f47189r.setBounds(l71Var.X.getLeft() - rect.left, 0, l71Var.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            l71Var.f47189r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        l71Var.f47189r.draw(canvas);
    }
}
