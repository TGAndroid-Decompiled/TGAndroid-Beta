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
public final class lm0 extends Drawable {
    public int f26137a = 255;
    public final h90 f26138b;
    public final int[] f26139c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] e;
    public final Bitmap f26140f;
    public final RectF f26141g;
    public final Paint h;
    public final Paint f26142i;
    public final StaticLayout f26143j;

    public lm0(h90 h90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f26138b = h90Var;
        this.f26139c = iArr;
        this.d = u1Var;
        this.e = iArr2;
        this.f26140f = bitmap;
        this.f26141g = rectF;
        this.h = paint;
        this.f26142i = paint2;
        this.f26143j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f26137a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = h90.f24694w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f26137a, 31);
        int[] iArr = this.f26139c;
        canvas.translate(iArr[0], iArr[1]);
        h90 h90Var = this.f26138b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.d5 d5Var = u1Var.f21536t8;
            if (d5Var != null && d5Var.f18810c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f21536t8.f18822r);
                canvas.drawPaint(u1Var.f21536t8.f18810c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f26140f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f26141g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(h90Var, this.f26142i);
        }
        canvas.clipPath(h90Var);
        this.f26143j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26137a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
