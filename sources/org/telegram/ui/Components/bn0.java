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
public final class bn0 extends Drawable {
    public int f25107a = 255;
    public final s90 f25108b;
    public final int[] f25109c;
    public final org.telegram.ui.Cells.t1 d;
    public final int[] e;
    public final Bitmap f25110f;
    public final RectF f25111g;
    public final Paint h;
    public final Paint f25112i;
    public final StaticLayout f25113j;

    public bn0(s90 s90Var, int[] iArr, org.telegram.ui.Cells.t1 t1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f25108b = s90Var;
        this.f25109c = iArr;
        this.d = t1Var;
        this.e = iArr2;
        this.f25110f = bitmap;
        this.f25111g = rectF;
        this.h = paint;
        this.f25112i = paint2;
        this.f25113j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f25107a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = s90.f30425w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f25107a, 31);
        int[] iArr = this.f25109c;
        canvas.translate(iArr[0], iArr[1]);
        s90 s90Var = this.f25108b;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null && t1Var.B1()) {
            org.telegram.ui.ActionBar.j5 j5Var = t1Var.f23585t8;
            if (j5Var != null && j5Var.f20999c != null) {
                canvas.save();
                t1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -t1Var.f23585t8.f21011r);
                canvas.drawPaint(t1Var.f23585t8.f20999c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], t1Var.getPaddingTop() + iArr2[1]);
                t1Var.C1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - t1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f25110f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f25111g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(s90Var, this.f25112i);
        }
        canvas.clipPath(s90Var);
        this.f25113j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25107a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
