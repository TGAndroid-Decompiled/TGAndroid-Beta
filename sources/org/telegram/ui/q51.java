package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q51 extends FrameLayout {
    public final Path f40336a;
    public final Paint f40337b;
    public final boolean f40338c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.g6 f40339e;
    public final Integer f40340f;
    public final w61 h;

    public q51(w61 w61Var, Context context, boolean z4, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        super(context);
        this.h = w61Var;
        this.f40338c = z4;
        this.d = z10;
        this.f40339e = g6Var;
        this.f40340f = num;
        this.f40336a = new Path();
        this.f40337b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        w61 w61Var = this.h;
        if (!w61Var.N0) {
            super.dispatchDraw(canvas);
        } else if (this.f40338c) {
            canvas.save();
            boolean z4 = this.d;
            Paint paint = this.f40337b;
            if (z4) {
                org.telegram.ui.ActionBar.k6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, this.f40339e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f40340f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (w61Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (w61Var.X0 * dp)) + getPaddingLeft(), e2.c.w(1.0f, w61Var.Y0, height, getPaddingTop()), ((width - dp) * w61Var.X0) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (w61Var.X0 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * w61Var.X0) + getPaddingLeft() + dp, (height * w61Var.Y0) + getPaddingTop());
            }
            Path path = this.f40336a;
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
