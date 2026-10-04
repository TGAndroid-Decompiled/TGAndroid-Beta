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
public final class rm0 extends Drawable {
    public int f30466a = 255;
    public final k90 f30467b;
    public final int[] f30468c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] f30469e;
    public final Bitmap f30470f;
    public final RectF f30471g;
    public final Paint h;
    public final Paint f30472i;
    public final StaticLayout f30473j;

    public rm0(k90 k90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f30467b = k90Var;
        this.f30468c = iArr;
        this.d = u1Var;
        this.f30469e = iArr2;
        this.f30470f = bitmap;
        this.f30471g = rectF;
        this.h = paint;
        this.f30472i = paint2;
        this.f30473j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f30466a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = k90.f28028w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f30466a, 31);
        int[] iArr = this.f30468c;
        canvas.translate(iArr[0], iArr[1]);
        k90 k90Var = this.f30467b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.e5 e5Var = u1Var.f23397t8;
            if (e5Var != null && e5Var.f20553c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f23397t8.f20566r);
                canvas.drawPaint(u1Var.f23397t8.f20553c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.f30469e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f30470f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f30471g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(k90Var, this.f30472i);
        }
        canvas.clipPath(k90Var);
        this.f30473j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30466a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
