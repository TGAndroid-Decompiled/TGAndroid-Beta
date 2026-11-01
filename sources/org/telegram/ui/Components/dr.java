package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class dr extends Drawable {
    public final Drawable f25576a;
    public final RectF f25577b = new RectF();
    public final Paint f25578c;
    public final Paint d;
    public int e;
    public final int f25579f;
    public float f25580g;
    public boolean h;
    public float f25581i;
    public float f25582j;
    public float f25583k;

    public dr(Context context, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f25578c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f25576a = context.getDrawable(i10);
        this.f25579f = i11;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.7f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.i0.N(2.5f));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.h != z10) {
            this.h = z10;
            float f7 = 0.0f;
            if (!z11) {
                if (z10) {
                    f7 = 1.0f;
                }
                this.f25580g = f7;
            } else {
                if (!z10) {
                    f7 = 1.0f;
                }
                this.f25580g = f7;
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dr.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f25576a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25576a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f25576a.setBounds(i10, i11, i12, i13);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
