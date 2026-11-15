package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
public final class nk0 extends Drawable {
    public int f37625a = 255;
    public final u70 f37626b;
    public final int[] f37627c;
    public final org.telegram.ui.Cells.q1 d;
    public final int[] f37628e;
    public final Bitmap f37629f;
    public final RectF f37630g;
    public final Paint h;
    public final Paint f37631i;
    public final StaticLayout f37632j;

    public nk0(u70 u70Var, int[] iArr, org.telegram.ui.Cells.q1 q1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f37626b = u70Var;
        this.f37627c = iArr;
        this.d = q1Var;
        this.f37628e = iArr2;
        this.f37629f = bitmap;
        this.f37630g = rectF;
        this.h = paint;
        this.f37631i = paint2;
        this.f37632j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f37625a <= 0) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = u70.f39942w;
        rectF.left = f10 - (org.telegram.messenger.g0.L(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f37625a, 31);
        int[] iArr = this.f37627c;
        canvas.translate(iArr[0], iArr[1]);
        u70 u70Var = this.f37626b;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        if (q1Var != null && q1Var.L0()) {
            org.telegram.ui.ActionBar.r4 r4Var = q1Var.L6;
            if (r4Var != null && r4Var.f29556c != null) {
                canvas.save();
                q1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -q1Var.L6.f29569r);
                canvas.drawPaint(q1Var.L6.f29556c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f37628e;
                canvas.translate(iArr2[0], q1Var.getPaddingTop() + iArr2[1]);
                q1Var.M0(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - q1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f37629f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f37630g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(u70Var, this.f37631i);
        }
        canvas.clipPath(u70Var);
        this.f37632j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f37625a = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
