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
    public int f33199a = 255;
    public final x80 f33200b;
    public final int[] f33201c;
    public final org.telegram.ui.Cells.t1 d;
    public final int[] f33202e;
    public final Bitmap f33203f;
    public final RectF f33204g;
    public final Paint h;
    public final Paint f33205i;
    public final StaticLayout f33206j;

    public zl0(x80 x80Var, int[] iArr, org.telegram.ui.Cells.t1 t1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f33200b = x80Var;
        this.f33201c = iArr;
        this.d = t1Var;
        this.f33202e = iArr2;
        this.f33203f = bitmap;
        this.f33204g = rectF;
        this.h = paint;
        this.f33205i = paint2;
        this.f33206j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f33199a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = x80.f32477w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f33199a, 31);
        int[] iArr = this.f33201c;
        canvas.translate(iArr[0], iArr[1]);
        x80 x80Var = this.f33200b;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null && t1Var.C1()) {
            org.telegram.ui.ActionBar.f5 f5Var = t1Var.f23160t8;
            if (f5Var != null && f5Var.f20453c != null) {
                canvas.save();
                t1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -t1Var.f23160t8.f20466r);
                canvas.drawPaint(t1Var.f23160t8.f20453c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f33202e;
                canvas.translate(iArr2[0], t1Var.getPaddingTop() + iArr2[1]);
                t1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - t1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f33203f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f33204g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(x80Var, this.f33205i);
        }
        canvas.clipPath(x80Var);
        this.f33206j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f33199a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
