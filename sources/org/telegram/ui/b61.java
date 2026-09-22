package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b61 extends FrameLayout {
    public final Path f32052a;
    public final Paint f32053b;
    public final boolean f32054c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final Integer f32055f;
    public final h71 h;

    public b61(h71 h71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        super(context);
        this.h = h71Var;
        this.f32054c = z10;
        this.d = z11;
        this.e = e6Var;
        this.f32055f = num;
        this.f32052a = new Path();
        this.f32053b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        h71 h71Var = this.h;
        if (!h71Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f32054c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f32053b;
            if (z10) {
                org.telegram.ui.ActionBar.i6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f32055f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (h71Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (h71Var.f34116a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, h71Var.f34119b1, height, getPaddingTop()), ((width - dp) * h71Var.f34116a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (h71Var.f34116a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * h71Var.f34116a1) + getPaddingLeft() + dp, (height * h71Var.f34119b1) + getPaddingTop());
            }
            Path path = this.f32052a;
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
