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
public final class jm0 extends Drawable {
    public int f24441a = 255;
    public final g90 f24442b;
    public final int[] f24443c;
    public final org.telegram.ui.Cells.t1 d;
    public final int[] e;
    public final Bitmap f24444f;
    public final RectF f24445g;
    public final Paint h;
    public final Paint f24446i;
    public final StaticLayout f24447j;

    public jm0(g90 g90Var, int[] iArr, org.telegram.ui.Cells.t1 t1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f24442b = g90Var;
        this.f24443c = iArr;
        this.d = t1Var;
        this.e = iArr2;
        this.f24444f = bitmap;
        this.f24445g = rectF;
        this.h = paint;
        this.f24446i = paint2;
        this.f24447j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f24441a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = g90.f23296w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f24441a, 31);
        int[] iArr = this.f24443c;
        canvas.translate(iArr[0], iArr[1]);
        g90 g90Var = this.f24442b;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null && t1Var.C1()) {
            org.telegram.ui.ActionBar.h5 h5Var = t1Var.f20331t8;
            if (h5Var != null && h5Var.f17772c != null) {
                canvas.save();
                t1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -t1Var.f20331t8.f17784r);
                canvas.drawPaint(t1Var.f20331t8.f17772c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], t1Var.getPaddingTop() + iArr2[1]);
                t1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - t1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f24444f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f24445g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(g90Var, this.f24446i);
        }
        canvas.clipPath(g90Var);
        this.f24447j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24441a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
