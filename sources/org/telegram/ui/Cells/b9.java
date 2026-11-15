package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class b9 extends FrameLayout {
    public final ImageView f30057a;
    public final org.telegram.ui.ActionBar.j5 f30058b;
    public final org.telegram.ui.ActionBar.e6 f30059c;
    public boolean d;

    public b9(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f30059c = e6Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f30058b = j5Var;
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        j5Var.setTextSize(16);
        j5Var.setGravity(19);
        addView(j5Var, c8.ja.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f30057a = imageView;
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.C6, e6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, c8.ja.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.j6.f28922h5;
        int i10 = org.telegram.ui.ActionBar.y5.f29895a;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        setBackground(org.telegram.ui.ActionBar.y5.d(x02, org.telegram.ui.ActionBar.y5.b(x02), new float[0]));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f30059c;
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f28972k0;
            }
            canvas.drawLine(org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
