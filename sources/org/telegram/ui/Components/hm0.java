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
public final class hm0 extends Drawable {
    public int f25447a = 255;
    public final y80 f25448b;
    public final int[] f25449c;
    public final org.telegram.ui.Cells.t1 d;
    public final int[] e;
    public final Bitmap f25450f;
    public final RectF f25451g;
    public final Paint h;
    public final Paint f25452i;
    public final StaticLayout f25453j;

    public hm0(y80 y80Var, int[] iArr, org.telegram.ui.Cells.t1 t1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f25448b = y80Var;
        this.f25449c = iArr;
        this.d = t1Var;
        this.e = iArr2;
        this.f25450f = bitmap;
        this.f25451g = rectF;
        this.h = paint;
        this.f25452i = paint2;
        this.f25453j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f25447a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f10 = rectF.left;
        CornerPathEffect cornerPathEffect = y80.f30930w;
        rectF.left = f10 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f25447a, 31);
        int[] iArr = this.f25449c;
        canvas.translate(iArr[0], iArr[1]);
        y80 y80Var = this.f25448b;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        if (t1Var != null && t1Var.C1()) {
            org.telegram.ui.ActionBar.g5 g5Var = t1Var.f22205q8;
            if (g5Var != null && g5Var.f19716c != null) {
                canvas.save();
                t1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -t1Var.f22205q8.f19728r);
                canvas.drawPaint(t1Var.f22205q8.f19716c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], t1Var.getPaddingTop() + iArr2[1]);
                t1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - t1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f25450f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f25451g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(y80Var, this.f25452i);
        }
        canvas.clipPath(y80Var);
        this.f25453j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25447a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
