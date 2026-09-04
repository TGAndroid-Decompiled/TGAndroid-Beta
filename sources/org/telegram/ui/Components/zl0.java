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
    public int f33172a = 255;
    public final x80 f33173b;
    public final int[] f33174c;
    public final org.telegram.ui.Cells.t1 d;
    public final int[] f33175e;
    public final Bitmap f33176f;
    public final RectF f33177g;
    public final Paint h;
    public final Paint f33178i;
    public final StaticLayout f33179j;

    public zl0(x80 x80Var, int[] iArr, org.telegram.ui.Cells.t1 t1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f33173b = x80Var;
        this.f33174c = iArr;
        this.d = t1Var;
        this.f33175e = iArr2;
        this.f33176f = bitmap;
        this.f33177g = rectF;
        this.h = paint;
        this.f33178i = paint2;
        this.f33179j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f33172a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = x80.f32450w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f33172a, 31);
        int[] iArr = this.f33174c;
        canvas.translate(iArr[0], iArr[1]);
        x80 x80Var = this.f33173b;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null && t1Var.C1()) {
            org.telegram.ui.ActionBar.f5 f5Var = t1Var.f23133t8;
            if (f5Var != null && f5Var.f20426c != null) {
                canvas.save();
                t1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -t1Var.f23133t8.f20439r);
                canvas.drawPaint(t1Var.f23133t8.f20426c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f33175e;
                canvas.translate(iArr2[0], t1Var.getPaddingTop() + iArr2[1]);
                t1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - t1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f33176f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f33177g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(x80Var, this.f33178i);
        }
        canvas.clipPath(x80Var);
        this.f33179j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f33172a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
