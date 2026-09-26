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
    public int f26136a = 255;
    public final h90 f26137b;
    public final int[] f26138c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] e;
    public final Bitmap f26139f;
    public final RectF f26140g;
    public final Paint h;
    public final Paint f26141i;
    public final StaticLayout f26142j;

    public lm0(h90 h90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f26137b = h90Var;
        this.f26138c = iArr;
        this.d = u1Var;
        this.e = iArr2;
        this.f26139f = bitmap;
        this.f26140g = rectF;
        this.h = paint;
        this.f26141i = paint2;
        this.f26142j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f26136a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = h90.f24693w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f26136a, 31);
        int[] iArr = this.f26138c;
        canvas.translate(iArr[0], iArr[1]);
        h90 h90Var = this.f26137b;
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
            Bitmap bitmap = this.f26139f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f26140g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(h90Var, this.f26141i);
        }
        canvas.clipPath(h90Var);
        this.f26142j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26136a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
