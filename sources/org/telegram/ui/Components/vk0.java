package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
public final class vk0 extends Drawable {
    public int f40691a = 255;
    public final f80 f40692b;
    public final int[] f40693c;
    public final org.telegram.ui.Cells.q1 d;
    public final int[] f40694e;
    public final Bitmap f40695f;
    public final RectF f40696g;
    public final Paint h;
    public final Paint f40697i;
    public final StaticLayout f40698j;

    public vk0(f80 f80Var, int[] iArr, org.telegram.ui.Cells.q1 q1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f40692b = f80Var;
        this.f40693c = iArr;
        this.d = q1Var;
        this.f40694e = iArr2;
        this.f40695f = bitmap;
        this.f40696g = rectF;
        this.h = paint;
        this.f40697i = paint2;
        this.f40698j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f40691a <= 0) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = f80.f35023w;
        rectF.left = f10 - (org.telegram.messenger.g0.L(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f40691a, 31);
        int[] iArr = this.f40693c;
        canvas.translate(iArr[0], iArr[1]);
        f80 f80Var = this.f40692b;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        if (q1Var != null && q1Var.L0()) {
            org.telegram.ui.ActionBar.v4 v4Var = q1Var.L6;
            if (v4Var != null && v4Var.f30099c != null) {
                canvas.save();
                q1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -q1Var.L6.f30112r);
                canvas.drawPaint(q1Var.L6.f30099c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f40694e;
                canvas.translate(iArr2[0], q1Var.getPaddingTop() + iArr2[1]);
                q1Var.M0(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - q1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f40695f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f40696g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(f80Var, this.f40697i);
        }
        canvas.clipPath(f80Var);
        this.f40698j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f40691a = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
