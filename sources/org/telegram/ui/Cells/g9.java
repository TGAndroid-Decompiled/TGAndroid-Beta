package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class g9 extends FrameLayout {
    public final ImageView f22302a;
    public final org.telegram.ui.ActionBar.j5 f22303b;
    public final org.telegram.ui.ActionBar.d6 f22304c;
    public boolean d;

    public g9(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f22304c = d6Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f22303b = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21093j5, d6Var));
        j5Var.setTextSize(16);
        j5Var.setGravity(19);
        addView(j5Var, w7.z5.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f22302a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.C6, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.z5.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.h6.f21058h5;
        int i11 = org.telegram.ui.ActionBar.x5.f21887a;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.x5.d(new float[0], x02, org.telegram.ui.ActionBar.x5.b(x02)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.d6 d6Var = this.f22304c;
            if (d6Var != null) {
                paint = d6Var.n("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.h6.f21108k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
