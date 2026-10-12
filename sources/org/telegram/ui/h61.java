package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class h61 extends FrameLayout {
    public final Path f38265a;
    public final Paint f38266b;
    public final boolean f38267c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.c6 f38268e;
    public final Integer f38269f;
    public final n71 h;

    public h61(n71 n71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        super(context);
        this.h = n71Var;
        this.f38267c = z10;
        this.d = z11;
        this.f38268e = c6Var;
        this.f38269f = num;
        this.f38265a = new Path();
        this.f38266b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        n71 n71Var = this.h;
        if (!n71Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f38267c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f38266b;
            if (z10) {
                org.telegram.ui.ActionBar.h6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, this.f38268e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f38269f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (n71Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (n71Var.f40258a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.y(1.0f, n71Var.f40261b1, height, getPaddingTop()), ((width - dp) * n71Var.f40258a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (n71Var.f40258a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * n71Var.f40258a1) + getPaddingLeft() + dp, (height * n71Var.f40261b1) + getPaddingTop());
            }
            Path path = this.f38265a;
            path.rewind();
            path.addRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
        }
    }
}
