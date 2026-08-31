package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class d9 extends FrameLayout {
    public final ImageView f22694a;
    public final org.telegram.ui.ActionBar.l5 f22695b;
    public final org.telegram.ui.ActionBar.g6 f22696c;
    public boolean d;

    public d9(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f22696c = g6Var;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f22695b = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21766j5, g6Var));
        l5Var.setTextSize(16);
        l5Var.setGravity(19);
        addView(l5Var, k7.c6.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f22694a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.C6, g6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, k7.c6.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.k6.f21731h5;
        int i11 = org.telegram.ui.ActionBar.a6.f21184a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.a6.d(new float[0], w02, org.telegram.ui.ActionBar.a6.b(w02)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.g6 g6Var = this.f22696c;
            if (g6Var != null) {
                paint = g6Var.F("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f21779k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z4) {
        this.d = z4;
    }
}
