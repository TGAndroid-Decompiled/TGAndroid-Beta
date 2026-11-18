package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class d9 extends FrameLayout {
    public final ImageView f30553a;
    public final org.telegram.ui.ActionBar.n5 f30554b;
    public final org.telegram.ui.ActionBar.i6 f30555c;
    public boolean d;

    public d9(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f30555c = i6Var;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f30554b = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.f29502j5, i6Var);
        n5Var.setTextSize(16);
        n5Var.setGravity(19);
        addView(n5Var, c8.ma.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f30553a = imageView;
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.C6, i6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, c8.ma.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.n6.f29467h5;
        int i10 = org.telegram.ui.ActionBar.b6.f28810a;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        setBackground(org.telegram.ui.ActionBar.b6.d(x02, org.telegram.ui.ActionBar.b6.b(x02), new float[0]));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.i6 i6Var = this.f30555c;
            if (i6Var != null) {
                paint = i6Var.g("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.n6.f29517k0;
            }
            canvas.drawLine(org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
