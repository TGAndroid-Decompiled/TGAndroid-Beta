package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class e9 extends FrameLayout {
    public final ImageView f24321a;
    public final org.telegram.ui.ActionBar.h5 f24322b;
    public final org.telegram.ui.ActionBar.b6 f24323c;
    public boolean d;

    public e9(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f24323c = b6Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24322b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var));
        h5Var.setTextSize(16);
        h5Var.setGravity(19);
        addView(h5Var, g7.e6.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f24321a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.C6, b6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, g7.e6.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i9 = org.telegram.ui.ActionBar.f6.f23072h5;
        int i10 = org.telegram.ui.ActionBar.v5.f23886a;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        setBackground(org.telegram.ui.ActionBar.v5.d(new float[0], w02, org.telegram.ui.ActionBar.v5.b(w02)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.b6 b6Var = this.f24323c;
            if (b6Var != null) {
                paint = b6Var.O("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.f6.f23121k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
