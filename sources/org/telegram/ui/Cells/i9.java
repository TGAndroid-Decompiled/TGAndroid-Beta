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
    public final ImageView f19319a;
    public final org.telegram.ui.ActionBar.l5 f19320b;
    public final org.telegram.ui.ActionBar.f6 f19321c;
    public boolean d;

    public i9(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f19321c = f6Var;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f19320b = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var));
        l5Var.setTextSize(16);
        l5Var.setGravity(19);
        addView(l5Var, w7.a6.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f19319a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.C6, f6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.a6.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.j6.f17998h5;
        int i11 = org.telegram.ui.ActionBar.z5.f18836a;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.z5.d(new float[0], w02, org.telegram.ui.ActionBar.z5.b(w02)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f19321c;
            if (f6Var != null) {
                paint = f6Var.F("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f18049k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
