package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j51 extends FrameLayout {
    public final Path f35237a;
    public final Paint f35238b;
    public final boolean f35239c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final Integer f35240f;
    public final q61 h;

    public j51(q61 q61Var, Context context, boolean z4, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        super(context);
        this.h = q61Var;
        this.f35239c = z4;
        this.d = z10;
        this.e = f6Var;
        this.f35240f = num;
        this.f35237a = new Path();
        this.f35238b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        q61 q61Var = this.h;
        if (!q61Var.N0) {
            super.dispatchDraw(canvas);
        } else if (this.f35239c) {
            canvas.save();
            boolean z4 = this.d;
            Paint paint = this.f35238b;
            if (z4) {
                org.telegram.ui.ActionBar.j6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f35240f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (q61Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (q61Var.X0 * dp)) + getPaddingLeft(), e2.c.w(1.0f, q61Var.Y0, height, getPaddingTop()), ((width - dp) * q61Var.X0) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (q61Var.X0 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * q61Var.X0) + getPaddingLeft() + dp, (height * q61Var.Y0) + getPaddingTop());
            }
            Path path = this.f35237a;
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
