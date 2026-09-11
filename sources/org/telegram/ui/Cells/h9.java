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
    public final ImageView f22064a;
    public final org.telegram.ui.ActionBar.j5 f22065b;
    public final org.telegram.ui.ActionBar.f6 f22066c;
    public boolean d;

    public h9(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f22066c = f6Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f22065b = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20770j5, f6Var));
        j5Var.setTextSize(16);
        j5Var.setGravity(19);
        addView(j5Var, w7.x5.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f22064a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.C6, f6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.x5.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.j6.f20734h5;
        int i11 = org.telegram.ui.ActionBar.y5.f21543a;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.y5.d(new float[0], w02, org.telegram.ui.ActionBar.y5.b(w02)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f22066c;
            if (f6Var != null) {
                paint = f6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f20785k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
