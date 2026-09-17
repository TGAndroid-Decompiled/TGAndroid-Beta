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
    public int f22433a = 255;
    public final w80 f22434b;
    public final int[] f22435c;
    public final org.telegram.ui.Cells.t1 d;
    public final int[] e;
    public final Bitmap f22436f;
    public final RectF f22437g;
    public final Paint h;
    public final Paint f22438i;
    public final StaticLayout f22439j;

    public am0(w80 w80Var, int[] iArr, org.telegram.ui.Cells.t1 t1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f22434b = w80Var;
        this.f22435c = iArr;
        this.d = t1Var;
        this.e = iArr2;
        this.f22436f = bitmap;
        this.f22437g = rectF;
        this.h = paint;
        this.f22438i = paint2;
        this.f22439j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f22433a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = w80.f29595w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f22433a, 31);
        int[] iArr = this.f22435c;
        canvas.translate(iArr[0], iArr[1]);
        w80 w80Var = this.f22434b;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null && t1Var.C1()) {
            org.telegram.ui.ActionBar.g5 g5Var = t1Var.f21260t8;
            if (g5Var != null && g5Var.f18676c != null) {
                canvas.save();
                t1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -t1Var.f21260t8.f18688r);
                canvas.drawPaint(t1Var.f21260t8.f18676c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], t1Var.getPaddingTop() + iArr2[1]);
                t1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - t1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f22436f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f22437g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(w80Var, this.f22438i);
        }
        canvas.clipPath(w80Var);
        this.f22439j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f22433a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
