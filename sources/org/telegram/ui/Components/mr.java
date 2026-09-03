package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class mr extends Drawable {
    public final Drawable f29242a;
    public final RectF f29243b = new RectF();
    public final Paint f29244c;
    public final Paint d;
    public int f29245e;
    public final int f29246f;
    public float f29247g;
    public boolean h;
    public float f29248i;
    public float f29249j;
    public float f29250k;

    public mr(Context context, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f29244c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f29242a = context.getDrawable(i10);
        this.f29246f = i11;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
    }

    public final void a(boolean z4, boolean z10) {
        if (this.h != z4) {
            this.h = z4;
            float f10 = 0.0f;
            if (!z10) {
                if (z4) {
                    f10 = 1.0f;
                }
                this.f29247g = f10;
            } else {
                if (!z4) {
                    f10 = 1.0f;
                }
                this.f29247g = f10;
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mr.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f29242a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f29242a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f29242a.setBounds(i10, i11, i12, i13);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
