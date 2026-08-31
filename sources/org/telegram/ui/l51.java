package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l51 extends FrameLayout {
    public final Path f38645a;
    public final Paint f38646b;
    public final boolean f38647c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.g6 f38648e;
    public final Integer f38649f;
    public final r61 h;

    public l51(r61 r61Var, Context context, boolean z4, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        super(context);
        this.h = r61Var;
        this.f38647c = z4;
        this.d = z10;
        this.f38648e = g6Var;
        this.f38649f = num;
        this.f38645a = new Path();
        this.f38646b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        r61 r61Var = this.h;
        if (!r61Var.N0) {
            super.dispatchDraw(canvas);
        } else if (this.f38647c) {
            canvas.save();
            boolean z4 = this.d;
            Paint paint = this.f38646b;
            if (z4) {
                org.telegram.ui.ActionBar.k6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, this.f38648e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f38649f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (r61Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (r61Var.X0 * dp)) + getPaddingLeft(), e2.c.w(1.0f, r61Var.Y0, height, getPaddingTop()), ((width - dp) * r61Var.X0) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (r61Var.X0 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * r61Var.X0) + getPaddingLeft() + dp, (height * r61Var.Y0) + getPaddingTop());
            }
            Path path = this.f38645a;
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
