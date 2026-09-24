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
    public int f26129a = 255;
    public final h90 f26130b;
    public final int[] f26131c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] e;
    public final Bitmap f26132f;
    public final RectF f26133g;
    public final Paint h;
    public final Paint f26134i;
    public final StaticLayout f26135j;

    public lm0(h90 h90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f26130b = h90Var;
        this.f26131c = iArr;
        this.d = u1Var;
        this.e = iArr2;
        this.f26132f = bitmap;
        this.f26133g = rectF;
        this.h = paint;
        this.f26134i = paint2;
        this.f26135j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f26129a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = h90.f24687w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f26129a, 31);
        int[] iArr = this.f26131c;
        canvas.translate(iArr[0], iArr[1]);
        h90 h90Var = this.f26130b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.d5 d5Var = u1Var.f21521t8;
            if (d5Var != null && d5Var.f18795c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f21521t8.f18807r);
                canvas.drawPaint(u1Var.f21521t8.f18795c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f26132f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f26133g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(h90Var, this.f26134i);
        }
        canvas.clipPath(h90Var);
        this.f26135j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26129a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
