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
    public int f42090a = 255;
    public final e80 f42091b;
    public final int[] f42092c;
    public final org.telegram.ui.Cells.r1 d;
    public final int[] f42093e;
    public final Bitmap f42094f;
    public final RectF f42095g;
    public final Paint h;
    public final Paint f42096i;
    public final StaticLayout f42097j;

    public xk0(e80 e80Var, int[] iArr, org.telegram.ui.Cells.r1 r1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f42091b = e80Var;
        this.f42092c = iArr;
        this.d = r1Var;
        this.f42093e = iArr2;
        this.f42094f = bitmap;
        this.f42095g = rectF;
        this.h = paint;
        this.f42096i = paint2;
        this.f42097j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f42090a <= 0) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = e80.f34630w;
        rectF.left = f10 - (org.telegram.messenger.g0.L(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f42090a, 31);
        int[] iArr = this.f42092c;
        canvas.translate(iArr[0], iArr[1]);
        e80 e80Var = this.f42091b;
        org.telegram.ui.Cells.r1 r1Var = this.d;
        if (r1Var != null && r1Var.L0()) {
            org.telegram.ui.ActionBar.u4 u4Var = r1Var.L6;
            if (u4Var != null && u4Var.f30142c != null) {
                canvas.save();
                r1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -r1Var.L6.f30155r);
                canvas.drawPaint(r1Var.L6.f30142c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f42093e;
                canvas.translate(iArr2[0], r1Var.getPaddingTop() + iArr2[1]);
                r1Var.M0(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - r1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f42094f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f42095g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(e80Var, this.f42096i);
        }
        canvas.clipPath(e80Var);
        this.f42097j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f42090a = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
