package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
public final class b9 extends FrameLayout {
    public final ImageView f29004a;
    public final org.telegram.ui.ActionBar.k5 f29005b;
    public final org.telegram.ui.ActionBar.e6 f29006c;
    public boolean d;

    public b9(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f29006c = e6Var;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f29005b = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        k5Var.setTextSize(16);
        k5Var.setGravity(19);
        addView(k5Var, mf.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f29004a = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.C6, e6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, mf.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i3 = org.telegram.ui.ActionBar.k6.f27954h5;
        int i10 = org.telegram.ui.ActionBar.y5.f28879a;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        setBackground(org.telegram.ui.ActionBar.y5.d(x02, org.telegram.ui.ActionBar.y5.b(x02), new float[0]));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f29006c;
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            canvas.drawLine(org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
