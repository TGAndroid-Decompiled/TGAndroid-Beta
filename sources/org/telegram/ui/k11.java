package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class k11 extends Drawable implements org.telegram.ui.ActionBar.i5 {
    public final org.telegram.ui.Components.m6 f35007a;
    public final Paint f35008b;
    public int f35009c;
    public float d;
    public float e;
    public final org.telegram.ui.Cells.l0 f35010f;
    public org.telegram.ui.Cells.w0 h;

    public k11(String str) {
        Paint paint = new Paint(1);
        this.f35008b = paint;
        this.d = 1.0f;
        this.e = 1.0f;
        this.f35010f = new org.telegram.ui.Cells.l0(this);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, false, false, false);
        this.f35007a = m6Var;
        m6Var.setCallback(new xr(1, this));
        m6Var.q(str, true, true);
        m6Var.t(AndroidUtilities.dp(11.0f));
        m6Var.f26086b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i10) {
        Paint paint = this.f35008b;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7 = this.d * this.e;
        if (f7 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        canvas.save();
        float a2 = this.f35010f.a(0.1f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Paint paint = this.f35008b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f7));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        paint.setAlpha(alpha);
        int i10 = this.f35009c;
        org.telegram.ui.Components.m6 m6Var = this.f35007a;
        m6Var.r(i10);
        m6Var.f26103w = (int) (f7 * 255.0f);
        m6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        m6Var.draw(canvas);
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
        return (int) (this.f35007a.d + AndroidUtilities.dp(11.0f));
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
