package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e61 extends FrameLayout {
    public final Path f37214a;
    public final Paint f37215b;
    public final boolean f37216c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.e6 f37217e;
    public final Integer f37218f;
    public final k71 h;

    public e61(k71 k71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        super(context);
        this.h = k71Var;
        this.f37216c = z10;
        this.d = z11;
        this.f37217e = e6Var;
        this.f37218f = num;
        this.f37214a = new Path();
        this.f37215b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        k71 k71Var = this.h;
        if (!k71Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f37216c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f37215b;
            if (z10) {
                org.telegram.ui.ActionBar.i6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, this.f37217e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f37218f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (k71Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (k71Var.f39159a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.y(1.0f, k71Var.f39162b1, height, getPaddingTop()), ((width - dp) * k71Var.f39159a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (k71Var.f39159a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * k71Var.f39159a1) + getPaddingLeft() + dp, (height * k71Var.f39162b1) + getPaddingTop());
            }
            Path path = this.f37214a;
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
