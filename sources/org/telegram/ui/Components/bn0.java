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
public final class bn0 extends Drawable {
    public int f23825a = 255;
    public final x90 f23826b;
    public final int[] f23827c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] e;
    public final Bitmap f23828f;
    public final RectF f23829g;
    public final Paint h;
    public final Paint f23830i;
    public final StaticLayout f23831j;

    public bn0(x90 x90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f23826b = x90Var;
        this.f23827c = iArr;
        this.d = u1Var;
        this.e = iArr2;
        this.f23828f = bitmap;
        this.f23829g = rectF;
        this.h = paint;
        this.f23830i = paint2;
        this.f23831j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f23825a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = x90.f31208w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f23825a, 31);
        int[] iArr = this.f23827c;
        canvas.translate(iArr[0], iArr[1]);
        x90 x90Var = this.f23826b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.d5 d5Var = u1Var.f22414t8;
            if (d5Var != null && d5Var.f19693c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f22414t8.f19705r);
                canvas.drawPaint(u1Var.f22414t8.f19693c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f23828f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f23829g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(x90Var, this.f23830i);
        }
        canvas.clipPath(x90Var);
        this.f23831j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f23825a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
