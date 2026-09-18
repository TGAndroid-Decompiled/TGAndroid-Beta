package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a61 extends FrameLayout {
    public final Path f31959a;
    public final Paint f31960b;
    public final boolean f31961c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final Integer f31962f;
    public final g71 h;

    public a61(g71 g71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        super(context);
        this.h = g71Var;
        this.f31961c = z10;
        this.d = z11;
        this.e = e6Var;
        this.f31962f = num;
        this.f31959a = new Path();
        this.f31960b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        g71 g71Var = this.h;
        if (!g71Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f31961c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f31960b;
            if (z10) {
                org.telegram.ui.ActionBar.j6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f31962f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (g71Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (g71Var.f33712a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, g71Var.f33715b1, height, getPaddingTop()), ((width - dp) * g71Var.f33712a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (g71Var.f33712a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * g71Var.f33712a1) + getPaddingLeft() + dp, (height * g71Var.f33715b1) + getPaddingTop());
            }
            Path path = this.f31959a;
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
