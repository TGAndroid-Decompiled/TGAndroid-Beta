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
public final class ln0 extends Drawable {
    public int f28244a = 255;
    public final ca0 f28245b;
    public final int[] f28246c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] f28247e;
    public final Bitmap f28248f;
    public final RectF f28249g;
    public final Paint h;
    public final Paint f28250i;
    public final StaticLayout f28251j;

    public ln0(ca0 ca0Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f28245b = ca0Var;
        this.f28246c = iArr;
        this.d = u1Var;
        this.f28247e = iArr2;
        this.f28248f = bitmap;
        this.f28249g = rectF;
        this.h = paint;
        this.f28250i = paint2;
        this.f28251j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f28244a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = ca0.f24896w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f28244a, 31);
        int[] iArr = this.f28246c;
        canvas.translate(iArr[0], iArr[1]);
        ca0 ca0Var = this.f28245b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.d5 d5Var = u1Var.f23157t8;
            if (d5Var != null && d5Var.f20294c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f23157t8.f20307r);
                canvas.drawPaint(u1Var.f23157t8.f20294c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f28247e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f28248f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f28249g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(ca0Var, this.f28250i);
        }
        canvas.clipPath(ca0Var);
        this.f28251j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28244a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
