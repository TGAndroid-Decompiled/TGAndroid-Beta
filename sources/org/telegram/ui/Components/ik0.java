package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
public final class ik0 extends Drawable {
    public int f34717a = 255;
    public final r70 f34718b;
    public final int[] f34719c;
    public final org.telegram.ui.Cells.q1 d;
    public final int[] f34720e;
    public final Bitmap f34721f;
    public final RectF f34722g;
    public final Paint h;
    public final Paint f34723i;
    public final StaticLayout f34724j;

    public ik0(r70 r70Var, int[] iArr, org.telegram.ui.Cells.q1 q1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f34718b = r70Var;
        this.f34719c = iArr;
        this.d = q1Var;
        this.f34720e = iArr2;
        this.f34721f = bitmap;
        this.f34722g = rectF;
        this.h = paint;
        this.f34723i = paint2;
        this.f34724j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f34717a <= 0) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = r70.f37514w;
        rectF.left = f10 - (org.telegram.messenger.g0.L(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f34717a, 31);
        int[] iArr = this.f34719c;
        canvas.translate(iArr[0], iArr[1]);
        r70 r70Var = this.f34718b;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        if (q1Var != null && q1Var.L0()) {
            org.telegram.ui.ActionBar.t4 t4Var = q1Var.K6;
            if (t4Var != null && t4Var.f28509c != null) {
                canvas.save();
                q1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -q1Var.K6.f28522r);
                canvas.drawPaint(q1Var.K6.f28509c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f34720e;
                canvas.translate(iArr2[0], q1Var.getPaddingTop() + iArr2[1]);
                q1Var.M0(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - q1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f34721f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f34722g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(r70Var, this.f34723i);
        }
        canvas.clipPath(r70Var);
        this.f34724j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f34717a = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
