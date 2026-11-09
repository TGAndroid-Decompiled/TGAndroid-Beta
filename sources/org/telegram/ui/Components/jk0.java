package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
public final class jk0 extends Drawable {
    public int f35083a = 255;
    public final s70 f35084b;
    public final int[] f35085c;
    public final org.telegram.ui.Cells.q1 d;
    public final int[] f35086e;
    public final Bitmap f35087f;
    public final RectF f35088g;
    public final Paint h;
    public final Paint f35089i;
    public final StaticLayout f35090j;

    public jk0(s70 s70Var, int[] iArr, org.telegram.ui.Cells.q1 q1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f35084b = s70Var;
        this.f35085c = iArr;
        this.d = q1Var;
        this.f35086e = iArr2;
        this.f35087f = bitmap;
        this.f35088g = rectF;
        this.h = paint;
        this.f35089i = paint2;
        this.f35090j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f35083a <= 0) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = s70.f37945w;
        rectF.left = f10 - (org.telegram.messenger.g0.L(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f35083a, 31);
        int[] iArr = this.f35085c;
        canvas.translate(iArr[0], iArr[1]);
        s70 s70Var = this.f35084b;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        if (q1Var != null && q1Var.L0()) {
            org.telegram.ui.ActionBar.t4 t4Var = q1Var.K6;
            if (t4Var != null && t4Var.f28517c != null) {
                canvas.save();
                q1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -q1Var.K6.f28530r);
                canvas.drawPaint(q1Var.K6.f28517c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f35086e;
                canvas.translate(iArr2[0], q1Var.getPaddingTop() + iArr2[1]);
                q1Var.M0(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - q1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f35087f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f35088g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(s70Var, this.f35089i);
        }
        canvas.clipPath(s70Var);
        this.f35090j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f35083a = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
