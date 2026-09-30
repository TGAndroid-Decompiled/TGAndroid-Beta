package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.AndroidUtilities;
public final class om0 extends Drawable {
    public int f27121a = 255;
    public final k90 f27122b;
    public final int[] f27123c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] e;
    public final Bitmap f27124f;
    public final RectF f27125g;
    public final Paint h;
    public final Paint f27126i;
    public final StaticLayout f27127j;

    public om0(k90 k90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f27122b = k90Var;
        this.f27123c = iArr;
        this.d = u1Var;
        this.e = iArr2;
        this.f27124f = bitmap;
        this.f27125g = rectF;
        this.h = paint;
        this.f27126i = paint2;
        this.f27127j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f27121a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = k90.f25702w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f27121a, 31);
        int[] iArr = this.f27123c;
        canvas.translate(iArr[0], iArr[1]);
        k90 k90Var = this.f27122b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.d5 d5Var = u1Var.f21557t8;
            if (d5Var != null && d5Var.f18826c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f21557t8.f18838r);
                canvas.drawPaint(u1Var.f21557t8.f18826c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f27124f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f27125g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(k90Var, this.f27126i);
        }
        canvas.clipPath(k90Var);
        this.f27127j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27121a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
