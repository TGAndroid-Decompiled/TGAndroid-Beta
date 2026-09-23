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
    public int f22466a = 255;
    public final x80 f22467b;
    public final int[] f22468c;
    public final org.telegram.ui.Cells.t1 d;
    public final int[] e;
    public final Bitmap f22469f;
    public final RectF f22470g;
    public final Paint h;
    public final Paint f22471i;
    public final StaticLayout f22472j;

    public am0(x80 x80Var, int[] iArr, org.telegram.ui.Cells.t1 t1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f22467b = x80Var;
        this.f22468c = iArr;
        this.d = t1Var;
        this.e = iArr2;
        this.f22469f = bitmap;
        this.f22470g = rectF;
        this.h = paint;
        this.f22471i = paint2;
        this.f22472j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f22466a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = x80.f29943w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f22466a, 31);
        int[] iArr = this.f22468c;
        canvas.translate(iArr[0], iArr[1]);
        x80 x80Var = this.f22467b;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null && t1Var.C1()) {
            org.telegram.ui.ActionBar.e5 e5Var = t1Var.f21220t8;
            if (e5Var != null && e5Var.f18583c != null) {
                canvas.save();
                t1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -t1Var.f21220t8.f18595r);
                canvas.drawPaint(t1Var.f21220t8.f18583c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], t1Var.getPaddingTop() + iArr2[1]);
                t1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - t1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f22469f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f22470g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(x80Var, this.f22471i);
        }
        canvas.clipPath(x80Var);
        this.f22472j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f22466a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
