package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class l11 extends Drawable implements org.telegram.ui.ActionBar.g5 {
    public final org.telegram.ui.Components.q6 f39622a;
    public final Paint f39623b;
    public int f39624c;
    public float d;
    public float f39625e;
    public final org.telegram.ui.Cells.l0 f39626f;
    public org.telegram.ui.Cells.w0 h;

    public l11(String str) {
        Paint paint = new Paint(1);
        this.f39623b = paint;
        this.d = 1.0f;
        this.f39625e = 1.0f;
        this.f39626f = new org.telegram.ui.Cells.l0(this);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, false, false);
        this.f39622a = q6Var;
        q6Var.setCallback(new zr(1, this));
        q6Var.t(str, true, true);
        q6Var.w(AndroidUtilities.dp(11.0f));
        q6Var.f29712b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i10) {
        Paint paint = this.f39623b;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7 = this.d * this.f39625e;
        if (f7 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        canvas.save();
        float a2 = this.f39626f.a(0.1f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Paint paint = this.f39623b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f7));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        paint.setAlpha(alpha);
        int i10 = this.f39624c;
        org.telegram.ui.Components.q6 q6Var = this.f39622a;
        q6Var.u(i10);
        q6Var.B = (int) (f7 * 255.0f);
        q6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        q6Var.draw(canvas);
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
        return (int) (this.f39622a.d + AndroidUtilities.dp(11.0f));
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10 / 255.0f;
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
