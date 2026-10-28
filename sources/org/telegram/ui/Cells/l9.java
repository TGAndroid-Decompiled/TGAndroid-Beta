package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kb1;
public final class l9 extends FrameLayout {
    public final ImageView f24398a;
    public final org.telegram.ui.ActionBar.b6 f24399b;
    public final org.telegram.ui.ActionBar.u6 f24400c;
    public boolean d;

    public l9(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f24400c = u6Var;
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f24399b = b6Var;
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.f23465j5, u6Var);
        b6Var.setTextSize(16);
        b6Var.setGravity(19);
        addView(b6Var, kb1.h(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f24398a = imageView;
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.C6, u6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, kb1.h(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.y6.f23428h5;
        int i11 = org.telegram.ui.ActionBar.o6.f22922a;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.o6.d(new float[0], x02, org.telegram.ui.ActionBar.o6.b(x02)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.u6 u6Var = this.f24400c;
            if (u6Var != null) {
                paint = u6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.y6.f23479k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
