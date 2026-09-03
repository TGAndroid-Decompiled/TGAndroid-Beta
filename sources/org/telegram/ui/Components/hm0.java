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
public final class hm0 extends Drawable {
    public int f27566a = 255;
    public final z80 f27567b;
    public final int[] f27568c;
    public final org.telegram.ui.Cells.t1 d;
    public final int[] f27569e;
    public final Bitmap f27570f;
    public final RectF f27571g;
    public final Paint h;
    public final Paint f27572i;
    public final StaticLayout f27573j;

    public hm0(z80 z80Var, int[] iArr, org.telegram.ui.Cells.t1 t1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f27567b = z80Var;
        this.f27568c = iArr;
        this.d = t1Var;
        this.f27569e = iArr2;
        this.f27570f = bitmap;
        this.f27571g = rectF;
        this.h = paint;
        this.f27572i = paint2;
        this.f27573j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f27566a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = z80.f33857w;
        rectF.left = f10 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f27566a, 31);
        int[] iArr = this.f27568c;
        canvas.translate(iArr[0], iArr[1]);
        z80 z80Var = this.f27567b;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null && t1Var.C1()) {
            org.telegram.ui.ActionBar.h5 h5Var = t1Var.f24007q8;
            if (h5Var != null && h5Var.f21423c != null) {
                canvas.save();
                t1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -t1Var.f24007q8.f21436r);
                canvas.drawPaint(t1Var.f24007q8.f21423c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f27569e;
                canvas.translate(iArr2[0], t1Var.getPaddingTop() + iArr2[1]);
                t1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - t1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f27570f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f27571g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(z80Var, this.f27572i);
        }
        canvas.clipPath(z80Var);
        this.f27573j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27566a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
