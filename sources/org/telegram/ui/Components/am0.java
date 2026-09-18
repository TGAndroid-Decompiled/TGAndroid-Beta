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
public final class am0 extends Drawable {
    public int f22436a = 255;
    public final w80 f22437b;
    public final int[] f22438c;
    public final org.telegram.ui.Cells.t1 d;
    public final int[] e;
    public final Bitmap f22439f;
    public final RectF f22440g;
    public final Paint h;
    public final Paint f22441i;
    public final StaticLayout f22442j;

    public am0(w80 w80Var, int[] iArr, org.telegram.ui.Cells.t1 t1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f22437b = w80Var;
        this.f22438c = iArr;
        this.d = t1Var;
        this.e = iArr2;
        this.f22439f = bitmap;
        this.f22440g = rectF;
        this.h = paint;
        this.f22441i = paint2;
        this.f22442j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f22436a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = w80.f29598w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f22436a, 31);
        int[] iArr = this.f22438c;
        canvas.translate(iArr[0], iArr[1]);
        w80 w80Var = this.f22437b;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null && t1Var.C1()) {
            org.telegram.ui.ActionBar.g5 g5Var = t1Var.f21261t8;
            if (g5Var != null && g5Var.f18677c != null) {
                canvas.save();
                t1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -t1Var.f21261t8.f18689r);
                canvas.drawPaint(t1Var.f21261t8.f18677c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], t1Var.getPaddingTop() + iArr2[1]);
                t1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - t1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f22439f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f22440g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(w80Var, this.f22441i);
        }
        canvas.clipPath(w80Var);
        this.f22442j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f22436a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
