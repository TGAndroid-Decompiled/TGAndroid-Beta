package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class h01 extends Drawable implements org.telegram.ui.ActionBar.g5 {

    public final org.telegram.ui.Components.i6 f38652a;

    public final Paint f38653b;

    public int f38654c;
    public float d;

    public float f38655e;

    public final org.telegram.ui.Cells.l0 f38656f;
    public org.telegram.ui.Cells.v0 h;

    public h01(String str) {
        Paint paint = new Paint(1);
        this.f38653b = paint;
        this.d = 1.0f;
        this.f38655e = 1.0f;
        this.f38656f = new org.telegram.ui.Cells.l0(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.f38652a = i6Var;
        i6Var.setCallback(new or(1, this));
        i6Var.q(str, true, true);
        i6Var.t(AndroidUtilities.dp(11.0f));
        i6Var.f29239b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i10) {
        Paint paint = this.f38653b;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10 = this.d * this.f38655e;
        if (f10 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        canvas.save();
        float fA = this.f38656f.a(0.1f);
        canvas.scale(fA, fA, rectF.centerX(), rectF.centerY());
        Paint paint = this.f38653b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        paint.setAlpha(alpha);
        int i10 = this.f38654c;
        org.telegram.ui.Components.i6 i6Var = this.f38652a;
        i6Var.r(i10);
        i6Var.f29257w = (int) (f10 * 255.0f);
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
        return (int) (this.f38652a.d + AndroidUtilities.dp(11.0f));
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
