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
    public int f30606a = 255;
    public final w80 f30607b;
    public final int[] f30608c;
    public final org.telegram.ui.Cells.t1 d;
    public final int[] e;
    public final Bitmap f30609f;
    public final RectF f30610g;
    public final Paint h;
    public final Paint f30611i;
    public final StaticLayout f30612j;

    public zl0(w80 w80Var, int[] iArr, org.telegram.ui.Cells.t1 t1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f30607b = w80Var;
        this.f30608c = iArr;
        this.d = t1Var;
        this.e = iArr2;
        this.f30609f = bitmap;
        this.f30610g = rectF;
        this.h = paint;
        this.f30611i = paint2;
        this.f30612j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f30606a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = w80.f29650w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f30606a, 31);
        int[] iArr = this.f30608c;
        canvas.translate(iArr[0], iArr[1]);
        w80 w80Var = this.f30607b;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null && t1Var.C1()) {
            org.telegram.ui.ActionBar.f5 f5Var = t1Var.f21233t8;
            if (f5Var != null && f5Var.f18645c != null) {
                canvas.save();
                t1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -t1Var.f21233t8.f18657r);
                canvas.drawPaint(t1Var.f21233t8.f18645c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], t1Var.getPaddingTop() + iArr2[1]);
                t1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - t1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f30609f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f30610g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(w80Var, this.f30611i);
        }
        canvas.clipPath(w80Var);
        this.f30612j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30606a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
