package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class bi0 extends Drawable {
    public final Drawable f27113a;
    public final Drawable f27114b;
    public final Paint f27115c;
    public final RectF d;
    public int f27116e;
    public long f27117f;
    public float f27118g;
    public boolean h;
    public boolean f27119i;

    public bi0(Context context) {
        Paint paint = new Paint(1);
        this.f27115c = paint;
        this.d = new RectF();
        this.f27116e = 0;
        this.f27113a = context.getResources().getDrawable(R.drawable.outline_shield_plain_24).mutate();
        this.f27114b = context.getResources().getDrawable(R.drawable.outline_shield_check).mutate();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f27117f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.ui.b.v(2, bounds.centerX(), drawable), org.telegram.ui.b.f(2, bounds.centerY(), drawable), org.telegram.ui.b.A(2, bounds.centerX(), drawable), org.telegram.ui.b.y(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        float f9;
        this.f27119i = z10;
        this.h = z11;
        this.f27117f = SystemClock.elapsedRealtime();
        if (!z12) {
            if (this.h) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            this.f27118g = f9;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27113a.setColorFilter(colorFilter);
        this.f27114b.setColorFilter(colorFilter);
        this.f27115c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
