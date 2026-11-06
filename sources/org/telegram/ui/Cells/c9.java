package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class c9 extends FrameLayout {
    public final ImageView f28998a;
    public final org.telegram.ui.ActionBar.k5 f28999b;
    public final org.telegram.ui.ActionBar.f6 f29000c;
    public boolean d;

    public c9(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f29000c = f6Var;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f28999b = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f27956j5, f6Var);
        k5Var.setTextSize(16);
        k5Var.setGravity(19);
        addView(k5Var, c8.ha.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f28998a = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.C6, f6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, c8.ha.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.k6.f27921h5;
        int i10 = org.telegram.ui.ActionBar.z5.f28832a;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        setBackground(org.telegram.ui.ActionBar.z5.d(x02, org.telegram.ui.ActionBar.z5.b(x02), new float[0]));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f29000c;
            if (f6Var != null) {
                paint = f6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f27971k0;
            }
            canvas.drawLine(org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z9) {
        this.d = z9;
    }
}
