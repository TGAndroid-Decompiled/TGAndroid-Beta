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
public final class an0 extends Drawable {
    public int f24755a = 255;
    public final q90 f24756b;
    public final int[] f24757c;
    public final org.telegram.ui.Cells.t1 d;
    public final int[] e;
    public final Bitmap f24758f;
    public final RectF f24759g;
    public final Paint h;
    public final Paint f24760i;
    public final StaticLayout f24761j;

    public an0(q90 q90Var, int[] iArr, org.telegram.ui.Cells.t1 t1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f24756b = q90Var;
        this.f24757c = iArr;
        this.d = t1Var;
        this.e = iArr2;
        this.f24758f = bitmap;
        this.f24759g = rectF;
        this.h = paint;
        this.f24760i = paint2;
        this.f24761j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f24755a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = q90.f29850w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f24755a, 31);
        int[] iArr = this.f24757c;
        canvas.translate(iArr[0], iArr[1]);
        q90 q90Var = this.f24756b;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null && t1Var.B1()) {
            org.telegram.ui.ActionBar.j5 j5Var = t1Var.f23586t8;
            if (j5Var != null && j5Var.f21000c != null) {
                canvas.save();
                t1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -t1Var.f23586t8.f21012r);
                canvas.drawPaint(t1Var.f23586t8.f21000c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], t1Var.getPaddingTop() + iArr2[1]);
                t1Var.C1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - t1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f24758f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f24759g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(q90Var, this.f24760i);
        }
        canvas.clipPath(q90Var);
        this.f24761j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24755a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
