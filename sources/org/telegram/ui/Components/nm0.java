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
    public int f26858a = 255;
    public final j90 f26859b;
    public final int[] f26860c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] e;
    public final Bitmap f26861f;
    public final RectF f26862g;
    public final Paint h;
    public final Paint f26863i;
    public final StaticLayout f26864j;

    public nm0(j90 j90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f26859b = j90Var;
        this.f26860c = iArr;
        this.d = u1Var;
        this.e = iArr2;
        this.f26861f = bitmap;
        this.f26862g = rectF;
        this.h = paint;
        this.f26863i = paint2;
        this.f26864j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f26858a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = j90.f25409w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f26858a, 31);
        int[] iArr = this.f26860c;
        canvas.translate(iArr[0], iArr[1]);
        j90 j90Var = this.f26859b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.f5 f5Var = u1Var.f21538t8;
            if (f5Var != null && f5Var.f18853c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f21538t8.f18865r);
                canvas.drawPaint(u1Var.f21538t8.f18853c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f26861f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f26862g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(j90Var, this.f26863i);
        }
        canvas.clipPath(j90Var);
        this.f26864j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26858a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
