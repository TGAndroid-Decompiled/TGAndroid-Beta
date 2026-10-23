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
public final class fj0 extends Drawable {
    public final Drawable f26361a;
    public final Drawable f26362b;
    public final Paint f26363c;
    public final RectF d;
    public int e;
    public long f26364f;
    public float f26365g;
    public boolean h;
    public boolean f26366i;

    public fj0(Context context) {
        Paint paint = new Paint(1);
        this.f26363c = paint;
        this.d = new RectF();
        this.e = 0;
        this.f26361a = context.getResources().getDrawable(R.drawable.outline_shield_plain_24).mutate();
        this.f26362b = context.getResources().getDrawable(R.drawable.outline_shield_check).mutate();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f26364f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.ui.Cells.b1.f(2, bounds.centerX(), drawable), org.telegram.messenger.sl.d(2, bounds.centerY(), drawable), org.telegram.ui.Cells.b1.y(2, bounds.centerX(), drawable), org.telegram.ui.Cells.b1.u(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        float f7;
        this.f26366i = z10;
        this.h = z11;
        this.f26364f = SystemClock.elapsedRealtime();
        if (!z12) {
            if (this.h) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f26365g = f7;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fj0.draw(android.graphics.Canvas):void");
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
        this.f26361a.setColorFilter(colorFilter);
        this.f26362b.setColorFilter(colorFilter);
        this.f26363c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
