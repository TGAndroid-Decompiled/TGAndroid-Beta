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
    public int f26834a = 255;
    public final y90 f26835b;
    public final int[] f26836c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] f26837e;
    public final Bitmap f26838f;
    public final RectF f26839g;
    public final Paint h;
    public final Paint f26840i;
    public final StaticLayout f26841j;

    public gn0(y90 y90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f26835b = y90Var;
        this.f26836c = iArr;
        this.d = u1Var;
        this.f26837e = iArr2;
        this.f26838f = bitmap;
        this.f26839g = rectF;
        this.h = paint;
        this.f26840i = paint2;
        this.f26841j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f26834a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = y90.f33199w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f26834a, 31);
        int[] iArr = this.f26836c;
        canvas.translate(iArr[0], iArr[1]);
        y90 y90Var = this.f26835b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.d5 d5Var = u1Var.f23413t8;
            if (d5Var != null && d5Var.f20560c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f23413t8.f20573r);
                canvas.drawPaint(u1Var.f23413t8.f20560c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f26837e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f26838f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f26839g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(y90Var, this.f26840i);
        }
        canvas.clipPath(y90Var);
        this.f26841j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26834a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
