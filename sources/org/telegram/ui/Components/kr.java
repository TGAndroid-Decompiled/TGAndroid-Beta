package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class kr extends Drawable {
    public final Drawable f26369a;
    public final RectF f26370b = new RectF();
    public final Paint f26371c;
    public final Paint d;
    public int e;
    public final int f26372f;
    public float f26373g;
    public boolean h;
    public float f26374i;
    public float f26375j;
    public float f26376k;

    public kr(Context context, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f26371c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f26369a = context.getDrawable(i10);
        this.f26372f = i11;
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
                this.f26373g = f10;
            } else {
                if (!z4) {
                    f10 = 1.0f;
                }
                this.f26373g = f10;
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
        return this.f26369a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f26369a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f26369a.setBounds(i10, i11, i12, i13);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
