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
public final class mm0 extends Drawable {
    public int f26453a = 255;
    public final f90 f26454b;
    public final int[] f26455c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] e;
    public final Bitmap f26456f;
    public final RectF f26457g;
    public final Paint h;
    public final Paint f26458i;
    public final StaticLayout f26459j;

    public mm0(f90 f90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f26454b = f90Var;
        this.f26455c = iArr;
        this.d = u1Var;
        this.e = iArr2;
        this.f26456f = bitmap;
        this.f26457g = rectF;
        this.h = paint;
        this.f26458i = paint2;
        this.f26459j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f26453a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = f90.f24074w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f26453a, 31);
        int[] iArr = this.f26455c;
        canvas.translate(iArr[0], iArr[1]);
        f90 f90Var = this.f26454b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.f5 f5Var = u1Var.f21500t8;
            if (f5Var != null && f5Var.f18832c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f21500t8.f18844r);
                canvas.drawPaint(u1Var.f21500t8.f18832c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f26456f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f26457g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(f90Var, this.f26458i);
        }
        canvas.clipPath(f90Var);
        this.f26459j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26453a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
