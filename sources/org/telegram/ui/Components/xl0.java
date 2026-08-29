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
public final class xl0 extends Drawable {
    public int f34775a = 255;
    public final s80 f34776b;
    public final int[] f34777c;
    public final org.telegram.ui.Cells.s1 d;
    public final int[] f34778e;
    public final Bitmap f34779f;
    public final RectF f34780g;
    public final Paint h;
    public final Paint f34781i;
    public final StaticLayout f34782j;

    public xl0(s80 s80Var, int[] iArr, org.telegram.ui.Cells.s1 s1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f34776b = s80Var;
        this.f34777c = iArr;
        this.d = s1Var;
        this.f34778e = iArr2;
        this.f34779f = bitmap;
        this.f34780g = rectF;
        this.h = paint;
        this.f34781i = paint2;
        this.f34782j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f34775a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f9 = rectF.left;
        CornerPathEffect cornerPathEffect = s80.f32539w;
        rectF.left = f9 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f34775a, 31);
        int[] iArr = this.f34777c;
        canvas.translate(iArr[0], iArr[1]);
        s80 s80Var = this.f34776b;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        if (s1Var != null && s1Var.C1()) {
            org.telegram.ui.ActionBar.d5 d5Var = s1Var.f25487p8;
            if (d5Var != null && d5Var.f22862c != null) {
                canvas.save();
                s1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -s1Var.f25487p8.f22875r);
                canvas.drawPaint(s1Var.f25487p8.f22862c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f34778e;
                canvas.translate(iArr2[0], s1Var.getPaddingTop() + iArr2[1]);
                s1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - s1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f34779f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f34780g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(s80Var, this.f34781i);
        }
        canvas.clipPath(s80Var);
        this.f34782j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f34775a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
