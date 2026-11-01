package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class e9 extends FrameLayout {
    public final ImageView f21872a;
    public final org.telegram.ui.ActionBar.u5 f21873b;
    public final org.telegram.ui.ActionBar.p6 f21874c;
    public boolean d;

    public e9(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f21874c = p6Var;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f21873b = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.f21038j5, p6Var);
        u5Var.setTextSize(16);
        u5Var.setGravity(19);
        addView(u5Var, w7.b6.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f21872a = imageView;
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.C6, p6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, w7.b6.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.t6.f21002h5;
        int i11 = org.telegram.ui.ActionBar.j6.f20447a;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.j6.d(x02, org.telegram.ui.ActionBar.j6.b(x02), new float[0]));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.p6 p6Var = this.f21874c;
            if (p6Var != null) {
                paint = p6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.t6.f21053k0;
            }
            canvas.drawLine(org.telegram.messenger.i0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
