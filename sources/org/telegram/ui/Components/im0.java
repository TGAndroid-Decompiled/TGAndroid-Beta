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
public final class im0 extends Drawable {
    public int f27861a = 255;
    public final z80 f27862b;
    public final int[] f27863c;
    public final org.telegram.ui.Cells.t1 d;
    public final int[] f27864e;
    public final Bitmap f27865f;
    public final RectF f27866g;
    public final Paint h;
    public final Paint f27867i;
    public final StaticLayout f27868j;

    public im0(z80 z80Var, int[] iArr, org.telegram.ui.Cells.t1 t1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f27862b = z80Var;
        this.f27863c = iArr;
        this.d = t1Var;
        this.f27864e = iArr2;
        this.f27865f = bitmap;
        this.f27866g = rectF;
        this.h = paint;
        this.f27867i = paint2;
        this.f27868j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f27861a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = z80.f33813w;
        rectF.left = f10 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f27861a, 31);
        int[] iArr = this.f27863c;
        canvas.translate(iArr[0], iArr[1]);
        z80 z80Var = this.f27862b;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null && t1Var.C1()) {
            org.telegram.ui.ActionBar.h5 h5Var = t1Var.f24005q8;
            if (h5Var != null && h5Var.f21421c != null) {
                canvas.save();
                t1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -t1Var.f24005q8.f21434r);
                canvas.drawPaint(t1Var.f24005q8.f21421c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f27864e;
                canvas.translate(iArr2[0], t1Var.getPaddingTop() + iArr2[1]);
                t1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - t1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f27865f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f27866g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(z80Var, this.f27867i);
        }
        canvas.clipPath(z80Var);
        this.f27868j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27861a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
