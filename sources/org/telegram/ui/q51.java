package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q51 extends FrameLayout {
    public final Path f37309a;
    public final Paint f37310b;
    public final boolean f37311c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final Integer f37312f;
    public final x61 h;

    public q51(x61 x61Var, Context context, boolean z4, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        super(context);
        this.h = x61Var;
        this.f37311c = z4;
        this.d = z10;
        this.e = f6Var;
        this.f37312f = num;
        this.f37309a = new Path();
        this.f37310b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        x61 x61Var = this.h;
        if (!x61Var.N0) {
            super.dispatchDraw(canvas);
        } else if (this.f37311c) {
            canvas.save();
            boolean z4 = this.d;
            Paint paint = this.f37310b;
            if (z4) {
                org.telegram.ui.ActionBar.j6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f37312f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (x61Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (x61Var.X0 * dp)) + getPaddingLeft(), e2.c.w(1.0f, x61Var.Y0, height, getPaddingTop()), ((width - dp) * x61Var.X0) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (x61Var.X0 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * x61Var.X0) + getPaddingLeft() + dp, (height * x61Var.Y0) + getPaddingTop());
            }
            Path path = this.f37309a;
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
