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
public final class hn0 extends Drawable {
    public int f29030a = 255;
    public final t90 f29031b;
    public final int[] f29032c;
    public final org.telegram.ui.Cells.s1 d;
    public final int[] e;
    public final Bitmap f29033f;
    public final RectF f29034g;
    public final Paint h;
    public final Paint f29035i;
    public final StaticLayout f29036j;

    public hn0(t90 t90Var, int[] iArr, org.telegram.ui.Cells.s1 s1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f29031b = t90Var;
        this.f29032c = iArr;
        this.d = s1Var;
        this.e = iArr2;
        this.f29033f = bitmap;
        this.f29034g = rectF;
        this.h = paint;
        this.f29035i = paint2;
        this.f29036j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f29030a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = t90.f32906w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f29030a, 31);
        int[] iArr = this.f29032c;
        canvas.translate(iArr[0], iArr[1]);
        t90 t90Var = this.f29031b;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        if (s1Var != null && s1Var.C1()) {
            org.telegram.ui.ActionBar.l5 l5Var = s1Var.f25294t8;
            if (l5Var != null && l5Var.f22835c != null) {
                canvas.save();
                s1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -s1Var.f25294t8.f22847r);
                canvas.drawPaint(s1Var.f25294t8.f22835c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], s1Var.getPaddingTop() + iArr2[1]);
                s1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - s1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f29033f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f29034g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(t90Var, this.f29035i);
        }
        canvas.clipPath(t90Var);
        this.f29036j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29030a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
