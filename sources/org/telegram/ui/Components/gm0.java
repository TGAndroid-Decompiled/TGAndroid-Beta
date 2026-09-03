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
public final class gm0 extends Drawable {
    public int f25201a = 255;
    public final y80 f25202b;
    public final int[] f25203c;
    public final org.telegram.ui.Cells.s1 d;
    public final int[] e;
    public final Bitmap f25204f;
    public final RectF f25205g;
    public final Paint h;
    public final Paint f25206i;
    public final StaticLayout f25207j;

    public gm0(y80 y80Var, int[] iArr, org.telegram.ui.Cells.s1 s1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f25202b = y80Var;
        this.f25203c = iArr;
        this.d = s1Var;
        this.e = iArr2;
        this.f25204f = bitmap;
        this.f25205g = rectF;
        this.h = paint;
        this.f25206i = paint2;
        this.f25207j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f25201a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = y80.f30944w;
        rectF.left = f10 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f25201a, 31);
        int[] iArr = this.f25203c;
        canvas.translate(iArr[0], iArr[1]);
        y80 y80Var = this.f25202b;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        if (s1Var != null && s1Var.C1()) {
            org.telegram.ui.ActionBar.g5 g5Var = s1Var.f22142q8;
            if (g5Var != null && g5Var.f19691c != null) {
                canvas.save();
                s1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -s1Var.f22142q8.f19703r);
                canvas.drawPaint(s1Var.f22142q8.f19691c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], s1Var.getPaddingTop() + iArr2[1]);
                s1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - s1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f25204f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f25205g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(y80Var, this.f25206i);
        }
        canvas.clipPath(y80Var);
        this.f25207j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25201a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
