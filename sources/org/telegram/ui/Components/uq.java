package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class uq extends Drawable {
    public final Drawable f38701a;
    public final RectF f38702b = new RectF();
    public final Paint f38703c;
    public final Paint d;
    public int f38704e;
    public final int f38705f;
    public float f38706g;
    public boolean h;
    public float f38707i;
    public float f38708j;
    public float f38709k;

    public uq(Context context, int i7, int i10) {
        Paint paint = new Paint(1);
        this.f38703c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f38701a = context.getDrawable(i7);
        this.f38705f = i10;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.7f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(2.5f));
    }

    public final void a(boolean z9, boolean z10) {
        if (this.h != z9) {
            this.h = z9;
            float f10 = 0.0f;
            if (!z10) {
                if (z9) {
                    f10 = 1.0f;
                }
                this.f38706g = f10;
            } else {
                if (!z9) {
                    f10 = 1.0f;
                }
                this.f38706g = f10;
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uq.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f38701a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f38701a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.f38701a.setBounds(i7, i10, i11, i12);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
