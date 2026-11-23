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
    public int f42154a = 255;
    public final h80 f42155b;
    public final int[] f42156c;
    public final org.telegram.ui.Cells.r1 d;
    public final int[] f42157e;
    public final Bitmap f42158f;
    public final RectF f42159g;
    public final Paint h;
    public final Paint f42160i;
    public final StaticLayout f42161j;

    public xk0(h80 h80Var, int[] iArr, org.telegram.ui.Cells.r1 r1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f42155b = h80Var;
        this.f42156c = iArr;
        this.d = r1Var;
        this.f42157e = iArr2;
        this.f42158f = bitmap;
        this.f42159g = rectF;
        this.h = paint;
        this.f42160i = paint2;
        this.f42161j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f42154a <= 0) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = h80.f35816w;
        rectF.left = f10 - (org.telegram.messenger.g0.L(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f42154a, 31);
        int[] iArr = this.f42156c;
        canvas.translate(iArr[0], iArr[1]);
        h80 h80Var = this.f42155b;
        org.telegram.ui.Cells.r1 r1Var = this.d;
        if (r1Var != null && r1Var.L0()) {
            org.telegram.ui.ActionBar.u4 u4Var = r1Var.L6;
            if (u4Var != null && u4Var.f30083c != null) {
                canvas.save();
                r1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -r1Var.L6.f30096r);
                canvas.drawPaint(r1Var.L6.f30083c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f42157e;
                canvas.translate(iArr2[0], r1Var.getPaddingTop() + iArr2[1]);
                r1Var.M0(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - r1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f42158f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f42159g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(h80Var, this.f42160i);
        }
        canvas.clipPath(h80Var);
        this.f42161j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f42154a = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
