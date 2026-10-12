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
    public int f28233a = 255;
    public final ca0 f28234b;
    public final int[] f28235c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] f28236e;
    public final Bitmap f28237f;
    public final RectF f28238g;
    public final Paint h;
    public final Paint f28239i;
    public final StaticLayout f28240j;

    public ln0(ca0 ca0Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f28234b = ca0Var;
        this.f28235c = iArr;
        this.d = u1Var;
        this.f28236e = iArr2;
        this.f28237f = bitmap;
        this.f28238g = rectF;
        this.h = paint;
        this.f28239i = paint2;
        this.f28240j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f28233a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = ca0.f24891w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f28233a, 31);
        int[] iArr = this.f28235c;
        canvas.translate(iArr[0], iArr[1]);
        ca0 ca0Var = this.f28234b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.d5 d5Var = u1Var.f23158t8;
            if (d5Var != null && d5Var.f20295c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f23158t8.f20308r);
                canvas.drawPaint(u1Var.f23158t8.f20295c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f28236e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f28237f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f28238g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(ca0Var, this.f28239i);
        }
        canvas.clipPath(ca0Var);
        this.f28240j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28233a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
