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
public final class nm0 extends Drawable {
    public int f26827a = 255;
    public final h90 f26828b;
    public final int[] f26829c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] e;
    public final Bitmap f26830f;
    public final RectF f26831g;
    public final Paint h;
    public final Paint f26832i;
    public final StaticLayout f26833j;

    public nm0(h90 h90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f26828b = h90Var;
        this.f26829c = iArr;
        this.d = u1Var;
        this.e = iArr2;
        this.f26830f = bitmap;
        this.f26831g = rectF;
        this.h = paint;
        this.f26832i = paint2;
        this.f26833j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f26827a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = h90.f24743w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f26827a, 31);
        int[] iArr = this.f26829c;
        canvas.translate(iArr[0], iArr[1]);
        h90 h90Var = this.f26828b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.f5 f5Var = u1Var.f21518t8;
            if (f5Var != null && f5Var.f18882c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f21518t8.f18894r);
                canvas.drawPaint(u1Var.f21518t8.f18882c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f26830f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f26831g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(h90Var, this.f26832i);
        }
        canvas.clipPath(h90Var);
        this.f26833j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26827a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
