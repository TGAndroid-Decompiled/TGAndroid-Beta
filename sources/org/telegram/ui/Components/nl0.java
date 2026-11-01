package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
public final class nl0 extends Drawable {
    public int f28912a = 255;
    public final k80 f28913b;
    public final int[] f28914c;
    public final org.telegram.ui.Cells.q1 d;
    public final int[] e;
    public final Bitmap f28915f;
    public final RectF f28916g;
    public final Paint h;
    public final Paint f28917i;
    public final StaticLayout f28918j;

    public nl0(k80 k80Var, int[] iArr, org.telegram.ui.Cells.q1 q1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f28913b = k80Var;
        this.f28914c = iArr;
        this.d = q1Var;
        this.e = iArr2;
        this.f28915f = bitmap;
        this.f28916g = rectF;
        this.h = paint;
        this.f28917i = paint2;
        this.f28918j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f28912a <= 0) {
            return;
        }
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = k80.f27772w;
        rectF.left = f7 - (org.telegram.messenger.i0.L(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f28912a, 31);
        int[] iArr = this.f28914c;
        canvas.translate(iArr[0], iArr[1]);
        k80 k80Var = this.f28913b;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        if (q1Var != null && q1Var.J0()) {
            org.telegram.ui.ActionBar.c5 c5Var = q1Var.J6;
            if (c5Var != null && c5Var.f20213c != null) {
                canvas.save();
                q1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -q1Var.J6.f20225r);
                canvas.drawPaint(q1Var.J6.f20213c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], q1Var.getPaddingTop() + iArr2[1]);
                q1Var.K0(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - q1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f28915f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f28916g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(k80Var, this.f28917i);
        }
        canvas.clipPath(k80Var);
        this.f28918j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28912a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
