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
public final class gn0 extends Drawable {
    public int f28606a = 255;
    public final s90 f28607b;
    public final int[] f28608c;
    public final org.telegram.ui.Cells.s1 d;
    public final int[] e;
    public final Bitmap f28609f;
    public final RectF f28610g;
    public final Paint h;
    public final Paint f28611i;
    public final StaticLayout f28612j;

    public gn0(s90 s90Var, int[] iArr, org.telegram.ui.Cells.s1 s1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f28607b = s90Var;
        this.f28608c = iArr;
        this.d = s1Var;
        this.e = iArr2;
        this.f28609f = bitmap;
        this.f28610g = rectF;
        this.h = paint;
        this.f28611i = paint2;
        this.f28612j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f28606a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = s90.f32479w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f28606a, 31);
        int[] iArr = this.f28608c;
        canvas.translate(iArr[0], iArr[1]);
        s90 s90Var = this.f28607b;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        if (s1Var != null && s1Var.C1()) {
            org.telegram.ui.ActionBar.l5 l5Var = s1Var.f25292t8;
            if (l5Var != null && l5Var.f22834c != null) {
                canvas.save();
                s1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -s1Var.f25292t8.f22846r);
                canvas.drawPaint(s1Var.f25292t8.f22834c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], s1Var.getPaddingTop() + iArr2[1]);
                s1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - s1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f28609f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f28610g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(s90Var, this.f28611i);
        }
        canvas.clipPath(s90Var);
        this.f28612j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28606a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
