package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e61 extends FrameLayout {
    public final Path f37168a;
    public final Paint f37169b;
    public final boolean f37170c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.e6 f37171e;
    public final Integer f37172f;
    public final k71 h;

    public e61(k71 k71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        super(context);
        this.h = k71Var;
        this.f37170c = z10;
        this.d = z11;
        this.f37171e = e6Var;
        this.f37172f = num;
        this.f37168a = new Path();
        this.f37169b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        k71 k71Var = this.h;
        if (!k71Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f37170c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f37169b;
            if (z10) {
                org.telegram.ui.ActionBar.i6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, this.f37171e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f37172f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (k71Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (k71Var.f39113a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.y(1.0f, k71Var.f39116b1, height, getPaddingTop()), ((width - dp) * k71Var.f39113a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (k71Var.f39113a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * k71Var.f39113a1) + getPaddingLeft() + dp, (height * k71Var.f39116b1) + getPaddingTop());
            }
            Path path = this.f37168a;
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
