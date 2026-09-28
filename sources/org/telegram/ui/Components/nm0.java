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
public final class nm0 extends Drawable {
    public int f26804a = 255;
    public final j90 f26805b;
    public final int[] f26806c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] e;
    public final Bitmap f26807f;
    public final RectF f26808g;
    public final Paint h;
    public final Paint f26809i;
    public final StaticLayout f26810j;

    public nm0(j90 j90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f26805b = j90Var;
        this.f26806c = iArr;
        this.d = u1Var;
        this.e = iArr2;
        this.f26807f = bitmap;
        this.f26808g = rectF;
        this.h = paint;
        this.f26809i = paint2;
        this.f26810j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f26804a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = j90.f25394w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f26804a, 31);
        int[] iArr = this.f26806c;
        canvas.translate(iArr[0], iArr[1]);
        j90 j90Var = this.f26805b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.d5 d5Var = u1Var.f21535t8;
            if (d5Var != null && d5Var.f18809c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f21535t8.f18821r);
                canvas.drawPaint(u1Var.f21535t8.f18809c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f26807f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f26808g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(j90Var, this.f26809i);
        }
        canvas.clipPath(j90Var);
        this.f26810j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26804a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
