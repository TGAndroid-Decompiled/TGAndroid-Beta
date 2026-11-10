package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class c9 extends FrameLayout {
    public final ImageView f29017a;
    public final org.telegram.ui.ActionBar.m5 f29018b;
    public final org.telegram.ui.ActionBar.h6 f29019c;
    public boolean d;

    public c9(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f29019c = h6Var;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f29018b = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.f27998j5, h6Var);
        m5Var.setTextSize(16);
        m5Var.setGravity(19);
        addView(m5Var, c8.ha.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f29017a = imageView;
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.C6, h6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, c8.ha.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.m6.f27963h5;
        int i10 = org.telegram.ui.ActionBar.b6.f27355a;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        setBackground(org.telegram.ui.ActionBar.b6.d(x02, org.telegram.ui.ActionBar.b6.b(x02), new float[0]));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.h6 h6Var = this.f29019c;
            if (h6Var != null) {
                paint = h6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.m6.f28013k0;
            }
            canvas.drawLine(org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z9) {
        this.d = z9;
    }
}
