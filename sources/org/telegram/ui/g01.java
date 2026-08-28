package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class g01 extends Drawable implements org.telegram.ui.ActionBar.g5 {
    public final org.telegram.ui.Components.i6 f38402a;
    public final Paint f38403b;
    public int f38404c;
    public float d;
    public float f38405e;
    public final org.telegram.ui.Cells.l0 f38406f;
    public org.telegram.ui.Cells.w0 h;

    public g01(String str) {
        Paint paint = new Paint(1);
        this.f38403b = paint;
        this.d = 1.0f;
        this.f38405e = 1.0f;
        this.f38406f = new org.telegram.ui.Cells.l0(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.f38402a = i6Var;
        i6Var.setCallback(new mr(1, this));
        i6Var.q(str, true, true);
        i6Var.t(AndroidUtilities.dp(11.0f));
        i6Var.f29333b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i9) {
        Paint paint = this.f38403b;
        if (paint.getColor() != i9) {
            paint.setColor(i9);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10 = this.d * this.f38405e;
        if (f10 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        canvas.save();
        float a2 = this.f38406f.a(0.1f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Paint paint = this.f38403b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        paint.setAlpha(alpha);
        int i9 = this.f38404c;
        org.telegram.ui.Components.i6 i6Var = this.f38402a;
        i6Var.r(i9);
        i6Var.f29351w = (int) (f10 * 255.0f);
        i6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        i6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return (int) (this.d * 255.0f);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(17.33f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f38402a.d + AndroidUtilities.dp(11.0f));
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
        this.d = i9 / 255.0f;
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
