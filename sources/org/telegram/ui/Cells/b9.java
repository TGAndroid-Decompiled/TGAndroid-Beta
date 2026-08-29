package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class b9 extends FrameLayout {
    public final ImageView f24135a;
    public final org.telegram.ui.ActionBar.h5 f24136b;
    public final org.telegram.ui.ActionBar.c6 f24137c;
    public boolean d;

    public b9(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24137c = c6Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24136b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
        h5Var.setTextSize(16);
        h5Var.setGravity(19);
        addView(h5Var, i7.f6.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f24135a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.C6, c6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, i7.f6.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.g6.f23133h5;
        int i11 = org.telegram.ui.ActionBar.w5.f23945a;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.w5.d(new float[0], w02, org.telegram.ui.ActionBar.w5.b(w02)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.c6 c6Var = this.f24137c;
            if (c6Var != null) {
                paint = c6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.g6.f23183k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
