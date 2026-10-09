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
public final class fn0 extends Drawable {
    public int f26432a = 255;
    public final y90 f26433b;
    public final int[] f26434c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] f26435e;
    public final Bitmap f26436f;
    public final RectF f26437g;
    public final Paint h;
    public final Paint f26438i;
    public final StaticLayout f26439j;

    public fn0(y90 y90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f26433b = y90Var;
        this.f26434c = iArr;
        this.d = u1Var;
        this.f26435e = iArr2;
        this.f26436f = bitmap;
        this.f26437g = rectF;
        this.h = paint;
        this.f26438i = paint2;
        this.f26439j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f26432a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = y90.f33167w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f26432a, 31);
        int[] iArr = this.f26434c;
        canvas.translate(iArr[0], iArr[1]);
        y90 y90Var = this.f26433b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.f5 f5Var = u1Var.f23385t8;
            if (f5Var != null && f5Var.f20601c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f23385t8.f20614r);
                canvas.drawPaint(u1Var.f23385t8.f20601c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f26435e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f26436f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f26437g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(y90Var, this.f26438i);
        }
        canvas.clipPath(y90Var);
        this.f26439j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26432a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
