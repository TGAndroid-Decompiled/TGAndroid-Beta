package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class hr extends Drawable {
    public final Drawable f35791a;
    public final RectF f35792b = new RectF();
    public final Paint f35793c;
    public final Paint d;
    public int f35794e;
    public final int f35795f;
    public float f35796g;
    public boolean h;
    public float f35797i;
    public float f35798j;
    public float f35799k;

    public hr(Context context, int i7, int i10) {
        Paint paint = new Paint(1);
        this.f35793c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f35791a = context.getDrawable(i7);
        this.f35795f = i10;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.7f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(2.5f));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.h != z10) {
            this.h = z10;
            float f10 = 0.0f;
            if (!z11) {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f35796g = f10;
            } else {
                if (!z10) {
                    f10 = 1.0f;
                }
                this.f35796g = f10;
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hr.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f35791a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f35791a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.f35791a.setBounds(i7, i10, i11, i12);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
