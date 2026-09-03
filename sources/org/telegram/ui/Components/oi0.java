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
public final class oi0 extends Drawable {
    public final Drawable f29774a;
    public final Drawable f29775b;
    public final Paint f29776c;
    public final RectF d;
    public int f29777e;
    public long f29778f;
    public float f29779g;
    public boolean h;
    public boolean f29780i;

    public oi0(Context context) {
        Paint paint = new Paint(1);
        this.f29776c = paint;
        this.d = new RectF();
        this.f29777e = 0;
        this.f29774a = context.getResources().getDrawable(R.drawable.outline_shield_plain_24).mutate();
        this.f29775b = context.getResources().getDrawable(R.drawable.outline_shield_check).mutate();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f29778f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.ui.b.u(2, bounds.centerX(), drawable), org.telegram.ui.b.f(2, bounds.centerY(), drawable), org.telegram.ui.b.A(2, bounds.centerX(), drawable), org.telegram.ui.b.y(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z4, boolean z10, boolean z11) {
        float f10;
        this.f29780i = z4;
        this.h = z10;
        this.f29778f = SystemClock.elapsedRealtime();
        if (!z11) {
            if (this.h) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f29779g = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oi0.draw(android.graphics.Canvas):void");
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
        this.f29774a.setColorFilter(colorFilter);
        this.f29775b.setColorFilter(colorFilter);
        this.f29776c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
