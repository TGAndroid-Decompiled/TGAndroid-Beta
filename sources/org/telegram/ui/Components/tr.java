package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class tr extends Drawable {
    public final Drawable f27469a;
    public final RectF f27470b = new RectF();
    public final Paint f27471c;
    public final Paint d;
    public int e;
    public final int f27472f;
    public float f27473g;
    public boolean h;
    public float f27474i;
    public float f27475j;
    public float f27476k;

    public tr(Context context, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f27471c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f27469a = context.getDrawable(i10);
        this.f27472f = i11;
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
                this.f27473g = f7;
            } else {
                if (!z10) {
                    f7 = 1.0f;
                }
                this.f27473g = f7;
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tr.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f27469a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27469a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f27469a.setBounds(i10, i11, i12, i13);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
