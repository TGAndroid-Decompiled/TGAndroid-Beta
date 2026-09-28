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
    public final ImageView f20410a;
    public final org.telegram.ui.ActionBar.h5 f20411b;
    public final org.telegram.ui.ActionBar.d6 f20412c;
    public boolean d;

    public h9(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f20412c = d6Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f20411b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165j5, d6Var));
        h5Var.setTextSize(16);
        h5Var.setGravity(19);
        addView(h5Var, w7.y5.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f20410a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.C6, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.y5.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.h6.f19129h5;
        int i11 = org.telegram.ui.ActionBar.w5.f19901a;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.w5.d(new float[0], w02, org.telegram.ui.ActionBar.w5.b(w02)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.d6 d6Var = this.f20412c;
            if (d6Var != null) {
                paint = d6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.h6.f19180k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
