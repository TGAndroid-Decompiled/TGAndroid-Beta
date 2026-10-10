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
public final class gn0 extends Drawable {
    public int f26805a = 255;
    public final z90 f26806b;
    public final int[] f26807c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] f26808e;
    public final Bitmap f26809f;
    public final RectF f26810g;
    public final Paint h;
    public final Paint f26811i;
    public final StaticLayout f26812j;

    public gn0(z90 z90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f26806b = z90Var;
        this.f26807c = iArr;
        this.d = u1Var;
        this.f26808e = iArr2;
        this.f26809f = bitmap;
        this.f26810g = rectF;
        this.h = paint;
        this.f26811i = paint2;
        this.f26812j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f26805a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = z90.f33545w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f26805a, 31);
        int[] iArr = this.f26807c;
        canvas.translate(iArr[0], iArr[1]);
        z90 z90Var = this.f26806b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.f5 f5Var = u1Var.f23389t8;
            if (f5Var != null && f5Var.f20605c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f23389t8.f20618r);
                canvas.drawPaint(u1Var.f23389t8.f20605c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f26808e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f26809f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f26810g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(z90Var, this.f26811i);
        }
        canvas.clipPath(z90Var);
        this.f26812j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26805a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
