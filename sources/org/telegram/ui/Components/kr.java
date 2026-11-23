package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class kr extends Drawable {
    public final Drawable f36919a;
    public final RectF f36920b = new RectF();
    public final Paint f36921c;
    public final Paint d;
    public int f36922e;
    public final int f36923f;
    public float f36924g;
    public boolean h;
    public float f36925i;
    public float f36926j;
    public float f36927k;

    public kr(Context context, int i7, int i10) {
        Paint paint = new Paint(1);
        this.f36921c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f36919a = context.getDrawable(i7);
        this.f36923f = i10;
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
                this.f36924g = f10;
            } else {
                if (!z10) {
                    f10 = 1.0f;
                }
                this.f36924g = f10;
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kr.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f36919a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f36919a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.f36919a.setBounds(i7, i10, i11, i12);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
