package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l61 extends FrameLayout {
    public final Path f37622a;
    public final Paint f37623b;
    public final boolean f37624c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final Integer f37625f;
    public final r71 h;

    public l61(r71 r71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        super(context);
        this.h = r71Var;
        this.f37624c = z10;
        this.d = z11;
        this.e = c6Var;
        this.f37625f = num;
        this.f37622a = new Path();
        this.f37623b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        r71 r71Var = this.h;
        if (!r71Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f37624c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f37623b;
            if (z10) {
                org.telegram.ui.ActionBar.g6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f37625f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (r71Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (r71Var.f39314a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.play_billing.k3.y(1.0f, r71Var.f39317b1, height, getPaddingTop()), ((width - dp) * r71Var.f39314a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (r71Var.f39314a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * r71Var.f39314a1) + getPaddingLeft() + dp, (height * r71Var.f39317b1) + getPaddingTop());
            }
            Path path = this.f37622a;
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
