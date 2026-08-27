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

public final class nl0 extends Drawable {

    public int f30989a = 255;

    public final j80 f30990b;

    public final int[] f30991c;
    public final org.telegram.ui.Cells.s1 d;

    public final int[] f30992e;

    public final Bitmap f30993f;

    public final RectF f30994g;
    public final Paint h;

    public final Paint f30995i;

    public final StaticLayout f30996j;

    public nl0(j80 j80Var, int[] iArr, org.telegram.ui.Cells.s1 s1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f30990b = j80Var;
        this.f30991c = iArr;
        this.d = s1Var;
        this.f30992e = iArr2;
        this.f30993f = bitmap;
        this.f30994g = rectF;
        this.h = paint;
        this.f30995i = paint2;
        this.f30996j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f30989a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = j80.f29642w;
        rectF.left = f10 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f30989a, 31);
        int[] iArr = this.f30991c;
        canvas.translate(iArr[0], iArr[1]);
        j80 j80Var = this.f30990b;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        if (s1Var == null || !s1Var.B1()) {
            canvas.drawPath(j80Var, this.f30995i);
        } else {
            org.telegram.ui.ActionBar.d5 d5Var = s1Var.f25475p8;
            if (d5Var == null || d5Var.f22845c == null) {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f30992e;
                canvas.translate(iArr2[0], s1Var.getPaddingTop() + iArr2[1]);
                s1Var.C1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - s1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            } else {
                canvas.save();
                s1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -s1Var.f25475p8.f22858r);
                canvas.drawPaint(s1Var.f25475p8.f22845c);
                canvas.restore();
            }
            Bitmap bitmap = this.f30993f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f30994g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        }
        canvas.clipPath(j80Var);
        this.f30996j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30989a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
