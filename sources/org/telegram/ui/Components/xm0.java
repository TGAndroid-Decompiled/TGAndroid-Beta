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
public final class xm0 extends Drawable {
    public int f32420a = 255;
    public final r90 f32421b;
    public final int[] f32422c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] e;
    public final Bitmap f32423f;
    public final RectF f32424g;
    public final Paint h;
    public final Paint f32425i;
    public final StaticLayout f32426j;

    public xm0(r90 r90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f32421b = r90Var;
        this.f32422c = iArr;
        this.d = u1Var;
        this.e = iArr2;
        this.f32423f = bitmap;
        this.f32424g = rectF;
        this.h = paint;
        this.f32425i = paint2;
        this.f32426j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f32420a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = r90.f29887w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f32420a, 31);
        int[] iArr = this.f32422c;
        canvas.translate(iArr[0], iArr[1]);
        r90 r90Var = this.f32421b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.f5 f5Var = u1Var.f23491t8;
            if (f5Var != null && f5Var.f20809c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f23491t8.f20821r);
                canvas.drawPaint(u1Var.f23491t8.f20809c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f32423f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f32424g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(r90Var, this.f32425i);
        }
        canvas.clipPath(r90Var);
        this.f32426j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f32420a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
