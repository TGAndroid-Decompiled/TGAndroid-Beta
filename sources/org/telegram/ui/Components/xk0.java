package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
public final class xk0 extends Drawable {
    public int f42162a = 255;
    public final h80 f42163b;
    public final int[] f42164c;
    public final org.telegram.ui.Cells.r1 d;
    public final int[] f42165e;
    public final Bitmap f42166f;
    public final RectF f42167g;
    public final Paint h;
    public final Paint f42168i;
    public final StaticLayout f42169j;

    public xk0(h80 h80Var, int[] iArr, org.telegram.ui.Cells.r1 r1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f42163b = h80Var;
        this.f42164c = iArr;
        this.d = r1Var;
        this.f42165e = iArr2;
        this.f42166f = bitmap;
        this.f42167g = rectF;
        this.h = paint;
        this.f42168i = paint2;
        this.f42169j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f42162a <= 0) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = h80.f35823w;
        rectF.left = f10 - (org.telegram.messenger.g0.L(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f42162a, 31);
        int[] iArr = this.f42164c;
        canvas.translate(iArr[0], iArr[1]);
        h80 h80Var = this.f42163b;
        org.telegram.ui.Cells.r1 r1Var = this.d;
        if (r1Var != null && r1Var.L0()) {
            org.telegram.ui.ActionBar.u4 u4Var = r1Var.L6;
            if (u4Var != null && u4Var.f30080c != null) {
                canvas.save();
                r1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -r1Var.L6.f30093r);
                canvas.drawPaint(r1Var.L6.f30080c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f42165e;
                canvas.translate(iArr2[0], r1Var.getPaddingTop() + iArr2[1]);
                r1Var.M0(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - r1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f42166f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f42167g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(h80Var, this.f42168i);
        }
        canvas.clipPath(h80Var);
        this.f42169j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f42162a = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
