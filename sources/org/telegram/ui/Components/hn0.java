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
public final class hn0 extends Drawable {
    public int f27037a = 255;
    public final z90 f27038b;
    public final int[] f27039c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] f27040e;
    public final Bitmap f27041f;
    public final RectF f27042g;
    public final Paint h;
    public final Paint f27043i;
    public final StaticLayout f27044j;

    public hn0(z90 z90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f27038b = z90Var;
        this.f27039c = iArr;
        this.d = u1Var;
        this.f27040e = iArr2;
        this.f27041f = bitmap;
        this.f27042g = rectF;
        this.h = paint;
        this.f27043i = paint2;
        this.f27044j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f27037a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = z90.f33458w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f27037a, 31);
        int[] iArr = this.f27039c;
        canvas.translate(iArr[0], iArr[1]);
        z90 z90Var = this.f27038b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.d5 d5Var = u1Var.f23377t8;
            if (d5Var != null && d5Var.f20524c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f23377t8.f20537r);
                canvas.drawPaint(u1Var.f23377t8.f20524c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f27040e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f27041f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f27042g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(z90Var, this.f27043i);
        }
        canvas.clipPath(z90Var);
        this.f27044j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27037a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
