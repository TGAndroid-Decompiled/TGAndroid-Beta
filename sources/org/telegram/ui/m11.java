package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class m11 extends Drawable implements org.telegram.ui.ActionBar.i5 {
    public final org.telegram.ui.Components.p6 f38541a;
    public final Paint f38542b;
    public int f38543c;
    public float d;
    public float f38544e;
    public final org.telegram.ui.Cells.l0 f38545f;
    public org.telegram.ui.Cells.w0 h;

    public m11(String str) {
        Paint paint = new Paint(1);
        this.f38542b = paint;
        this.d = 1.0f;
        this.f38544e = 1.0f;
        this.f38545f = new org.telegram.ui.Cells.l0(this);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, false, false, false);
        this.f38541a = p6Var;
        p6Var.setCallback(new yr(1, this));
        p6Var.q(str, true, true);
        p6Var.t(AndroidUtilities.dp(11.0f));
        p6Var.f29285b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i10) {
        Paint paint = this.f38542b;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7 = this.d * this.f38544e;
        if (f7 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        canvas.save();
        float a2 = this.f38545f.a(0.1f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Paint paint = this.f38542b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f7));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        paint.setAlpha(alpha);
        int i10 = this.f38543c;
        org.telegram.ui.Components.p6 p6Var = this.f38541a;
        p6Var.r(i10);
        p6Var.f29303w = (int) (f7 * 255.0f);
        p6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        p6Var.draw(canvas);
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
        return (int) (this.f38541a.d + AndroidUtilities.dp(11.0f));
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
