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
public final class zl0 extends Drawable {
    public int f30609a = 255;
    public final w80 f30610b;
    public final int[] f30611c;
    public final org.telegram.ui.Cells.t1 d;
    public final int[] e;
    public final Bitmap f30612f;
    public final RectF f30613g;
    public final Paint h;
    public final Paint f30614i;
    public final StaticLayout f30615j;

    public zl0(w80 w80Var, int[] iArr, org.telegram.ui.Cells.t1 t1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f30610b = w80Var;
        this.f30611c = iArr;
        this.d = t1Var;
        this.e = iArr2;
        this.f30612f = bitmap;
        this.f30613g = rectF;
        this.h = paint;
        this.f30614i = paint2;
        this.f30615j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f30609a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = w80.f29653w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f30609a, 31);
        int[] iArr = this.f30611c;
        canvas.translate(iArr[0], iArr[1]);
        w80 w80Var = this.f30610b;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null && t1Var.C1()) {
            org.telegram.ui.ActionBar.f5 f5Var = t1Var.f21250t8;
            if (f5Var != null && f5Var.f18647c != null) {
                canvas.save();
                t1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -t1Var.f21250t8.f18659r);
                canvas.drawPaint(t1Var.f21250t8.f18647c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], t1Var.getPaddingTop() + iArr2[1]);
                t1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - t1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f30612f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f30613g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(w80Var, this.f30614i);
        }
        canvas.clipPath(w80Var);
        this.f30615j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30609a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
