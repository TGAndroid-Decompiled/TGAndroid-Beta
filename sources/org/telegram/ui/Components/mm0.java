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
public final class mm0 extends Drawable {
    public int f26448a = 255;
    public final i90 f26449b;
    public final int[] f26450c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] e;
    public final Bitmap f26451f;
    public final RectF f26452g;
    public final Paint h;
    public final Paint f26453i;
    public final StaticLayout f26454j;

    public mm0(i90 i90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f26449b = i90Var;
        this.f26450c = iArr;
        this.d = u1Var;
        this.e = iArr2;
        this.f26451f = bitmap;
        this.f26452g = rectF;
        this.h = paint;
        this.f26453i = paint2;
        this.f26454j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f26448a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = i90.f25013w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f26448a, 31);
        int[] iArr = this.f26450c;
        canvas.translate(iArr[0], iArr[1]);
        i90 i90Var = this.f26449b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.d5 d5Var = u1Var.f21535t8;
            if (d5Var != null && d5Var.f18809c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f21535t8.f18821r);
                canvas.drawPaint(u1Var.f21535t8.f18809c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f26451f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f26452g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(i90Var, this.f26453i);
        }
        canvas.clipPath(i90Var);
        this.f26454j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26448a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
