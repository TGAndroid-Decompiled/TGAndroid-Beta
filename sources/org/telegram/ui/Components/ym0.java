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
public final class ym0 extends Drawable {
    public int f32696a = 255;
    public final r90 f32697b;
    public final int[] f32698c;
    public final org.telegram.ui.Cells.u1 d;
    public final int[] e;
    public final Bitmap f32699f;
    public final RectF f32700g;
    public final Paint h;
    public final Paint f32701i;
    public final StaticLayout f32702j;

    public ym0(r90 r90Var, int[] iArr, org.telegram.ui.Cells.u1 u1Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.f32697b = r90Var;
        this.f32698c = iArr;
        this.d = u1Var;
        this.e = iArr2;
        this.f32699f = bitmap;
        this.f32700g = rectF;
        this.h = paint;
        this.f32701i = paint2;
        this.f32702j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f32696a <= 0) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        float f7 = rectF.left;
        CornerPathEffect cornerPathEffect = r90.f29890w;
        rectF.left = f7 - (AndroidUtilities.dp(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.f32696a, 31);
        int[] iArr = this.f32698c;
        canvas.translate(iArr[0], iArr[1]);
        r90 r90Var = this.f32697b;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        if (u1Var != null && u1Var.C1()) {
            org.telegram.ui.ActionBar.f5 f5Var = u1Var.f23494t8;
            if (f5Var != null && f5Var.f20812c != null) {
                canvas.save();
                u1Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -u1Var.f23494t8.f20824r);
                canvas.drawPaint(u1Var.f23494t8.f20812c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], u1Var.getPaddingTop() + iArr2[1]);
                u1Var.D1(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - u1Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f32699f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.f32700g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(r90Var, this.f32701i);
        }
        canvas.clipPath(r90Var);
        this.f32702j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f32696a = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
