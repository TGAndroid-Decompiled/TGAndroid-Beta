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
public final class kl0 extends Drawable {
    public int f30193a = 255;
    public final f80 f30194b;
    public final int[] f30195c;
    public final org.telegram.ui.Cells.t1 d;
    public final int[] f30196e;
    public final Bitmap f30197f;
    public final RectF f30198g;
    public final Paint h;
    public final Paint f30199i;
    public final StaticLayout f30200j;

    public kl0(f80 f80Var, int[] iArr, org.telegram.ui.Cells.t1 t1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f30194b = f80Var;
        this.f30195c = iArr;
        this.d = t1Var;
        this.f30196e = iArr2;
        this.f30197f = bitmap;
        this.f30198g = rectF;
        this.h = paint;
        this.f30199i = paint2;
        this.f30200j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f30193a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = f80.f28326w;
        rectF.left = f10 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f30193a, 31);
        int[] iArr = this.f30195c;
        canvas.translate(iArr[0], iArr[1]);
        f80 f80Var = this.f30194b;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null && t1Var.C1()) {
            org.telegram.ui.ActionBar.d5 d5Var = t1Var.f25518p8;
            if (d5Var != null && d5Var.f22845c != null) {
                canvas.save();
                t1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -t1Var.f25518p8.f22858r);
                canvas.drawPaint(t1Var.f25518p8.f22845c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f30196e;
                canvas.translate(iArr2[0], t1Var.getPaddingTop() + iArr2[1]);
                t1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - t1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f30197f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f30198g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(f80Var, this.f30199i);
        }
        canvas.clipPath(f80Var);
        this.f30200j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
        this.f30193a = i9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
