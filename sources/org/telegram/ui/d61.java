package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d61 extends FrameLayout {
    public final Path f36923a;
    public final Paint f36924b;
    public final boolean f36925c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.d6 f36926e;
    public final Integer f36927f;
    public final j71 h;

    public d61(j71 j71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        super(context);
        this.h = j71Var;
        this.f36925c = z10;
        this.d = z11;
        this.f36926e = d6Var;
        this.f36927f = num;
        this.f36923a = new Path();
        this.f36924b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        j71 j71Var = this.h;
        if (!j71Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f36925c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f36924b;
            if (z10) {
                org.telegram.ui.ActionBar.h6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, this.f36926e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f36927f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (j71Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (j71Var.f38877a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.y(1.0f, j71Var.f38880b1, height, getPaddingTop()), ((width - dp) * j71Var.f38877a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (j71Var.f38877a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * j71Var.f38877a1) + getPaddingLeft() + dp, (height * j71Var.f38880b1) + getPaddingTop());
            }
            Path path = this.f36923a;
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
