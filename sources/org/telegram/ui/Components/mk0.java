package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
public final class mk0 extends Drawable {
    public int f36176a = 255;
    public final n70 f36177b;
    public final int[] f36178c;
    public final org.telegram.ui.Cells.q1 d;
    public final int[] f36179e;
    public final Bitmap f36180f;
    public final RectF f36181g;
    public final Paint h;
    public final Paint f36182i;
    public final StaticLayout f36183j;

    public mk0(n70 n70Var, int[] iArr, org.telegram.ui.Cells.q1 q1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f36177b = n70Var;
        this.f36178c = iArr;
        this.d = q1Var;
        this.f36179e = iArr2;
        this.f36180f = bitmap;
        this.f36181g = rectF;
        this.h = paint;
        this.f36182i = paint2;
        this.f36183j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f36176a <= 0) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = n70.f36396w;
        rectF.left = f10 - (org.telegram.messenger.g0.L(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f36176a, 31);
        int[] iArr = this.f36178c;
        canvas.translate(iArr[0], iArr[1]);
        n70 n70Var = this.f36177b;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        if (q1Var != null && q1Var.L0()) {
            org.telegram.ui.ActionBar.t4 t4Var = q1Var.K6;
            if (t4Var != null && t4Var.f28635c != null) {
                canvas.save();
                q1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -q1Var.K6.f28648r);
                canvas.drawPaint(q1Var.K6.f28635c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f36179e;
                canvas.translate(iArr2[0], q1Var.getPaddingTop() + iArr2[1]);
                q1Var.M0(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - q1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f36180f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f36181g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(n70Var, this.f36182i);
        }
        canvas.clipPath(n70Var);
        this.f36183j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.f36176a = i3;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
