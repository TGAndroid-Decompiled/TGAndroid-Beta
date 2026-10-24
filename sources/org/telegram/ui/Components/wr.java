package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class wr extends Drawable {
    public final Drawable f32331a;
    public final RectF f32332b = new RectF();
    public final Paint f32333c;
    public final Paint d;
    public int e;
    public final int f32334f;
    public float f32335g;
    public boolean h;
    public float f32336i;
    public float f32337j;
    public float f32338k;

    public wr(Context context, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f32333c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f32331a = context.getDrawable(i10);
        this.f32334f = i11;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.h != z10) {
            this.h = z10;
            float f7 = 0.0f;
            if (!z11) {
                if (z10) {
                    f7 = 1.0f;
                }
                this.f32335g = f7;
            } else {
                if (!z10) {
                    f7 = 1.0f;
                }
                this.f32335g = f7;
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wr.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f32331a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f32331a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f32331a.setBounds(i10, i11, i12, i13);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
