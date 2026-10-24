package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class h9 extends FrameLayout {
    public final ImageView f22478a;
    public final org.telegram.ui.ActionBar.n5 f22479b;
    public final org.telegram.ui.ActionBar.g6 f22480c;
    public boolean d;

    public h9(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f22480c = g6Var;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f22479b = n5Var;
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.f21290j5, g6Var);
        n5Var.setTextSize(16);
        n5Var.setGravity(19);
        addView(n5Var, w7.z5.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f22478a = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.C6, g6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, w7.z5.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.k6.f21255h5;
        int i11 = org.telegram.ui.ActionBar.a6.f20704a;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.a6.d(new float[0], x02, org.telegram.ui.ActionBar.a6.b(x02)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.g6 g6Var = this.f22480c;
            if (g6Var != null) {
                paint = g6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f21305k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
