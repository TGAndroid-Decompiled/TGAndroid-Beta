package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class c9 extends FrameLayout {
    public final ImageView f20893a;
    public final org.telegram.ui.ActionBar.k5 f20894b;
    public final org.telegram.ui.ActionBar.f6 f20895c;
    public boolean d;

    public c9(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f20895c = f6Var;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f20894b = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, f6Var));
        k5Var.setTextSize(16);
        k5Var.setGravity(19);
        addView(k5Var, k7.b6.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f20893a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.C6, f6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, k7.b6.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.j6.f19952h5;
        int i11 = org.telegram.ui.ActionBar.z5.f20761a;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.z5.d(new float[0], w02, org.telegram.ui.ActionBar.z5.b(w02)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f20895c;
            if (f6Var != null) {
                paint = f6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f20000k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z4) {
        this.d = z4;
    }
}
