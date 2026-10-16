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
    public int f23518a = 255;
    public final x90 f23519b;
    public final int[] f23520c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] e;
    public final Bitmap f23521f;
    public final RectF f23522g;
    public final Paint h;
    public final Paint f23523i;
    public final StaticLayout f23524j;

    public bn0(x90 x90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f23519b = x90Var;
        this.f23520c = iArr;
        this.d = u1Var;
        this.e = iArr2;
        this.f23521f = bitmap;
        this.f23522g = rectF;
        this.h = paint;
        this.f23523i = paint2;
        this.f23524j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f23518a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = x90.f30891w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f23518a, 31);
        int[] iArr = this.f23520c;
        canvas.translate(iArr[0], iArr[1]);
        x90 x90Var = this.f23519b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.d5 d5Var = u1Var.f22123t8;
            if (d5Var != null && d5Var.f19393c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f22123t8.f19405r);
                canvas.drawPaint(u1Var.f22123t8.f19393c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f23521f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f23522g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(x90Var, this.f23523i);
        }
        canvas.clipPath(x90Var);
        this.f23524j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f23518a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
