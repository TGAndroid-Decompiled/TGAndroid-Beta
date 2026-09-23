package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class i9 extends FrameLayout {
    public final ImageView f20247a;
    public final org.telegram.ui.ActionBar.i5 f20248b;
    public final org.telegram.ui.ActionBar.d6 f20249c;
    public boolean d;

    public i9(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f20249c = d6Var;
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f20248b = i5Var;
        i5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18895j5, d6Var));
        i5Var.setTextSize(16);
        i5Var.setGravity(19);
        addView(i5Var, w7.x5.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f20247a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.C6, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.x5.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.h6.f18859h5;
        int i11 = org.telegram.ui.ActionBar.x5.f19674a;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.x5.d(new float[0], w02, org.telegram.ui.ActionBar.x5.b(w02)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.d6 d6Var = this.f20249c;
            if (d6Var != null) {
                paint = d6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.h6.f18910k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
