package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class i11 extends Drawable implements org.telegram.ui.ActionBar.g5 {
    public final org.telegram.ui.Components.q6 f38554a;
    public final Paint f38555b;
    public int f38556c;
    public float d;
    public float f38557e;
    public final org.telegram.ui.Cells.l0 f38558f;
    public org.telegram.ui.Cells.w0 h;

    public i11(String str) {
        Paint paint = new Paint(1);
        this.f38555b = paint;
        this.d = 1.0f;
        this.f38557e = 1.0f;
        this.f38558f = new org.telegram.ui.Cells.l0(this);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, false, false);
        this.f38554a = q6Var;
        q6Var.setCallback(new vr(1, this));
        q6Var.t(str, true, true);
        q6Var.w(AndroidUtilities.dp(11.0f));
        q6Var.f30019b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i10) {
        Paint paint = this.f38555b;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7 = this.d * this.f38557e;
        if (f7 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        canvas.save();
        float a2 = this.f38558f.a(0.1f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Paint paint = this.f38555b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f7));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        paint.setAlpha(alpha);
        int i10 = this.f38556c;
        org.telegram.ui.Components.q6 q6Var = this.f38554a;
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
        return (int) (this.f38554a.d + AndroidUtilities.dp(11.0f));
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
