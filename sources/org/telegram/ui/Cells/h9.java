package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class h9 extends FrameLayout {
    public final ImageView f21981a;
    public final org.telegram.ui.ActionBar.h5 f21982b;
    public final org.telegram.ui.ActionBar.c6 f21983c;
    public boolean d;

    public h9(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f21983c = c6Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f21982b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20668j5, c6Var));
        h5Var.setTextSize(16);
        h5Var.setGravity(19);
        addView(h5Var, w7.w5.a(48.0f, 22.0f, 0.0f, 56.0f, 0.0f, -1, 16));
        ImageView imageView = new ImageView(context);
        this.f21981a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.C6, c6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.w5.a(24.0f, 0.0f, 0.0f, 16.0f, 0.0f, 24, 8388629));
        int i10 = org.telegram.ui.ActionBar.h6.f20631h5;
        int i11 = org.telegram.ui.ActionBar.w5.f21429a;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.w5.d(new float[0], x02, org.telegram.ui.ActionBar.w5.b(x02)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.c6 c6Var = this.f21983c;
            if (c6Var != null) {
                paint = c6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.h6.f20682k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
