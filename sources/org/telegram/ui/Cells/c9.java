package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class c9 extends FrameLayout {
    public final ImageView f29006a;
    public final org.telegram.ui.ActionBar.l5 f29007b;
    public final org.telegram.ui.ActionBar.g6 f29008c;
    public boolean d;

    public c9(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f29008c = g6Var;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f29007b = l5Var;
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.f27973j5, g6Var);
        l5Var.setTextSize(16);
        l5Var.setGravity(19);
        addView(l5Var, c8.ha.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f29006a = imageView;
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.C6, g6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, c8.ha.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.l6.f27938h5;
        int i10 = org.telegram.ui.ActionBar.a6.f27334a;
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
        setBackground(org.telegram.ui.ActionBar.a6.d(x02, org.telegram.ui.ActionBar.a6.b(x02), new float[0]));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.g6 g6Var = this.f29008c;
            if (g6Var != null) {
                paint = g6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.l6.f27988k0;
            }
            canvas.drawLine(org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z9) {
        this.d = z9;
    }
}
