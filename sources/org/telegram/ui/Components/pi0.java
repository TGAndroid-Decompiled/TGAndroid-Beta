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
public final class pi0 extends Drawable {
    public final Drawable f26136a;
    public final Drawable f26137b;
    public final Paint f26138c;
    public final RectF d;
    public int e;
    public long f26139f;
    public float f26140g;
    public boolean h;
    public boolean f26141i;

    public pi0(Context context) {
        Paint paint = new Paint(1);
        this.f26138c = paint;
        this.d = new RectF();
        this.e = 0;
        this.f26136a = context.getResources().getDrawable(R.drawable.outline_shield_plain_24).mutate();
        this.f26137b = context.getResources().getDrawable(R.drawable.outline_shield_check).mutate();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f26139f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.messenger.em.w(2, bounds.centerX(), drawable), org.telegram.messenger.em.e(2, bounds.centerY(), drawable), org.telegram.messenger.em.B(2, bounds.centerX(), drawable), org.telegram.messenger.em.z(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        float f7;
        this.f26141i = z10;
        this.h = z11;
        this.f26139f = SystemClock.elapsedRealtime();
        if (!z12) {
            if (this.h) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f26140g = f7;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pi0.draw(android.graphics.Canvas):void");
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
        this.f26136a.setColorFilter(colorFilter);
        this.f26137b.setColorFilter(colorFilter);
        this.f26138c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
